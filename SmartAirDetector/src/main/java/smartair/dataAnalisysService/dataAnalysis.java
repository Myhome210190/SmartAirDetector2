package smartair.dataAnalisysService;

import smartair.sensorService.getDataRequest;
import smartair.sensorService.getDataResponse;
import smartair.sensorService.sensorServiceGrpc;
import smartair.sensorService.sensorServiceGrpc.sensorServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class dataAnalysis {

	public getDataResponse getdatafromsensor(double timestamp) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		sensorServiceBlockingStub  blockingStub = sensorServiceGrpc.newBlockingStub(channel);
				
	    

	    	 getDataRequest request = getDataRequest.newBuilder().setTimeStamp(timestamp).build();
	    	 
	    	getDataResponse response = blockingStub.getData(request);
	    	
	    	return response;
	}
}
