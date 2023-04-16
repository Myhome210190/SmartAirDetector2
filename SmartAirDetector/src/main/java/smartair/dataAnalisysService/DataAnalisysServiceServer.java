package smartair.dataAnalisysService;



import java.io.IOException;
import java.util.logging.Logger;

import smartair.dataAnalisysService.dataAnalisysServiceGrpc.dataAnalisysServiceImplBase;
import smartair.dataAnalisysService.dataAnalysis;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class DataAnalisysServiceServer extends dataAnalisysServiceImplBase  {

	private static final Logger logger = Logger.getLogger(DataAnalisysServiceServer.class.getName());
    public dataAnalysis dataanal = new dataAnalysis();
	public static void main(String[] args) {
		
		DataAnalisysServiceServer dataServer = new DataAnalisysServiceServer();
		
		int port = 50052;
	    
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
	public void getData(getDataRequest request,  StreamObserver<getDataResponse> responseObserver) {
		    
		System.out.println("sending air data");
		smartair.sensorService.getDataResponse response = dataanal.getdatafromsensor(request.getTimeStamp());
		
		
		 getDataResponse reply = getDataResponse.newBuilder().setFromTimeStamp(response.getFromTimeStamp()).setCoReading(response.getCoReading()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	

}

