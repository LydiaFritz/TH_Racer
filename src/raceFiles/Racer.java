/**
 * 
 */
package raceFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Racer {
	//allows subclasses direct access to instance variables/
	
	protected String name;
	protected double distanceCoveredInMeters = 0.0,
	minSpeedInMetersPerSecond,
	maxSpeedInMetersPerSecon;
	
	
	
	/**
	 * @param name
	 * @param minSpeedInMetersPerSecond
	 * @param maxSpeedInMetersPerSecon
	 */
	public Racer(String name, double minSpeedInMetersPerSecond, double maxSpeedInMetersPerSecon) {
		this.name = name;
		this.minSpeedInMetersPerSecond = minSpeedInMetersPerSecond;
		this.maxSpeedInMetersPerSecon = maxSpeedInMetersPerSecon;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the distanceCoveredInMeters
	 */
	public double getDistanceCoveredInMeters() {
		return distanceCoveredInMeters;
	}
	
	public void run(double timeIntervalSeconds) {
		//calculate random fraction
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		diff *= rate;
		double speed = diff + this.minSpeedInMetersPerSecond;
		this.distanceCoveredInMeters += (speed*timeIntervalSeconds);
	}
	@Override
	public String toString() {
		return "Racer [name=" + name + "]";
	}
	
	
	

}
