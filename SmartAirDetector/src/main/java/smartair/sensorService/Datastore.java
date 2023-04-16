package smartair.sensorService;

public class Datastore {
	float coreading;
	double timestamp; 
	
	public Datastore() {
		coreading = 0;
		timestamp = 0;
	}
	
	public void setCoReading(float coreading) {
		this.coreading = coreading ;
	}
	
	public void setTimestamp(double timestamp) {
		this.timestamp = timestamp;
	}
	
	public float getCoReading() {
		
		return coreading;
	}

	public double getTimeStamp() {
		return timestamp;
		
	}
}
