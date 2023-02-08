/**
 * 
 */
package raceFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Tortoise extends Racer {

	/**
	 * @param name
	 * @param minSpeedInMetersPerSecond
	 * @param maxSpeedInMetersPerSecon
	 */
	public Tortoise(String name) {
		super(name, 2.0, 3.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tortoise";
	}
	
	public void run(double timeIntervalSeconds) {
		//calculate random fraction
		System.out.println("Tortoise is walking...");
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		diff *= rate;
		double speed = diff + this.minSpeedInMetersPerSecond;
		this.distanceCoveredInMeters += (speed*timeIntervalSeconds);
	}
	
	
	
}
