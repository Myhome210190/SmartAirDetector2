package smartair.sensorService;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import smartair.sensorService.sensorServiceGrpc.sensorServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class SensorServiceClient {

	private static final Logger logger = Logger.getLogger(SensorServiceClient.class.getName());

		  
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		sensorServiceBlockingStub  blockingStub = sensorServiceGrpc.newBlockingStub(channel);
				
	    SensorServiceClient client = new SensorServiceClient();
	    
	    try {
	    	 double timestamp = 20;
	    	 getDataRequest request = getDataRequest.newBuilder().setTimeStamp(timestamp).build();
	    	 
	    	getDataResponse response = blockingStub.getData(request);
	    	 
	    	 logger.info("Co Emission is: " + response.getCoReading()+ response.getFromTimeStamp() + response.getCurrentTimeStamp());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return; 
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
