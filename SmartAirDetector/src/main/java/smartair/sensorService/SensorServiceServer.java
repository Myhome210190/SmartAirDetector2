//building server Sensor to collect Co emission in the air
package smartair.sensorService;


import java.io.IOException;
import java.util.logging.Logger;


import smartair.sensorService.Datastore;
import smartair.sensorService.sensorServiceGrpc.sensorServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SensorServiceServer extends sensorServiceImplBase  {

	private static final Logger logger = Logger.getLogger(SensorServiceServer.class.getName());
	public Datastore datastore = new Datastore(); 

	public static void main(String[] args) {
		
		SensorServiceServer dataServer = new SensorServiceServer();
		
		int port = 50051;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(dataServer)
			    .build()
			    .start();
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	@Override
	public void inputData(inputDataRequest request,  StreamObserver<inputDataResponse> responseObserver) {
		    
		System.out.println("receiving air data");
		
         
		datastore.setCoReading(request.getCoReading());
		datastore.setTimestamp(request.getCurrentTimeStamp());
		 inputDataResponse reply = inputDataResponse.newBuilder().setDataRegistred(true).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	
	@Override
	public void getData(getDataRequest request,  StreamObserver<getDataResponse> responseObserver) {
		    
		System.out.println("sending air data");
		
		
		
		 getDataResponse reply = getDataResponse.newBuilder().setFromTimeStamp(datastore.getTimeStamp()).setCoReading(datastore.getCoReading()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	

}


