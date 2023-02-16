package studentFiles;

import raceFiles.Racer;
import java.util.Random;

public class TylerD extends Racer{
	public TylerD(String name, double minSpeed, double maxSpeed) {
		super(name, minSpeed, maxSpeed);
	}
	
	public String toString() {
		return "Tyler D";
	}
	
	public void run(double timeInSeconds) {
		System.out.println("Tyler D AGGRESSIVELY Speedwalks");
		Random r = new Random();
		double rate = r.nextDouble();
		double difference = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		difference *= rate;
		double speed = this.minSpeedInMetersPerSecond + difference;
		
		distanceCoveredInMeters += speed*timeInSeconds;
	}
	

}