/**
 * 
 */
package raceFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Panther extends Racer {

	/**
	 * @param name
	 * @param minSpeedInMetersPerSecond
	 * @param maxSpeedInMetersPerSecon
	 */
	public Panther(String name) {
		super(name, 10, 25);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(double timeIntervalSeconds) {
		// calculate random fraction
		System.out.println("Panther is sprinting...");
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		diff *= rate;
		double speed = diff + this.minSpeedInMetersPerSecond;
		this.distanceCoveredInMeters += (speed * timeIntervalSeconds);

	}

}
