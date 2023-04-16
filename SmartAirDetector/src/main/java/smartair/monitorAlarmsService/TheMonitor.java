package smartair.monitorAlarmsService;

import smartair.dataAnalisysService.getDataRequest;
import smartair.dataAnalisysService.getDataResponse;
import smartair.dataAnalisysService.dataAnalisysServiceGrpc;
import smartair.dataAnalisysService.dataAnalisysServiceGrpc.dataAnalisysServiceBlockingStub;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class TheMonitor {
	float thresholdCo;
   
	public TheMonitor() {
		thresholdCo = 0;
	}	
		
	public void setThresholdCo(float thresholdCo) {
		this.thresholdCo = thresholdCo;
		}
	public float getThresholco() {
		return this.thresholdCo;
	}
	
	public getDataResponse getDatafromserver(){
		String host = "localhost";
		int port = 50052;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		dataAnalisysServiceBlockingStub  blockingStub = dataAnalisysServiceGrpc.newBlockingStub(channel);
				
	    
	
	    	 double timestamp = 20;
	    	 getDataRequest request = getDataRequest.newBuilder().setTimeStamp(timestamp).build();
	    	 
	    	getDataResponse response = blockingStub.getData(request);
	    	
	    	return response;
	    	 
	    		 
	   
	  }
		


  public boolean checkLevels(float coReading) {
	  
	  if (coReading > thresholdCo) {
		  return true;
		 
	  }else {
		  return false;
	  }
  }
  }
