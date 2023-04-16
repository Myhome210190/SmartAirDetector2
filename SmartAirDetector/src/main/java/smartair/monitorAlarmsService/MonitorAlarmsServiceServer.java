package smartair.monitorAlarmsService;


import java.io.IOException;
import java.util.logging.Logger;

import smartair.dataAnalisysService.getDataResponse;
import smartair.monitorAlarmsService.monitorAlarmsServiceGrpc.monitorAlarmsServiceImplBase;
import smartair.monitorAlarmsService.TheMonitor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class MonitorAlarmsServiceServer extends monitorAlarmsServiceImplBase  {

	private static final Logger logger = Logger.getLogger(MonitorAlarmsServiceServer.class.getName());
	public TheMonitor monitor = new TheMonitor();

	public static void main(String[] args) {
		
		MonitorAlarmsServiceServer dataServer = new MonitorAlarmsServiceServer();
		
		int port = 50053;
	    
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
	public void setThreshold(setThresholdRequest request,  StreamObserver<setThresholdResponse> responseObserver) {
		    
		System.out.println("sending air data");
		
		monitor.setThresholdCo(request.getThreshold());
		
		 setThresholdResponse reply = setThresholdResponse.newBuilder().setThresholdSet(true).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	
	@Override
	public void startAlertMonitor(setThresholdRequest request,  StreamObserver<alertMonitorResponse> responseObserver){
		monitor.setThresholdCo(request.getThreshold());
		getDataResponse dataresponse =  monitor.getDatafromserver();
		 
		alertMonitorResponse reply = alertMonitorResponse.newBuilder().setAlertMessage(monitor.checkLevels(dataresponse.getCoReading())).build();
		responseObserver.onNext(reply);
	     
	    responseObserver.onCompleted();
		
	}
	
	
	
  

}

