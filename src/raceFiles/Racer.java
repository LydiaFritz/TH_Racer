/**
 * 
 */
package raceFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public abstract class Racer {
	// allows subclasses direct access to instance variables/

	protected String name;
	protected double distanceCoveredInMeters = 0.0, minSpeedInMetersPerSecond, maxSpeedInMetersPerSecon;

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

	public abstract void run(double timeIntervalSeconds);

	@Override
	public String toString() {
		return "Racer [name=" + name + "]";
	}

	// METHOD GETS THE CLASS CANONICAL NAME
	// AND STRIPS AWAY THE PACKAGE
	public String getObjectType() {
		String canonicalName = this.getClass().getCanonicalName();
		// return canonicalName;
		return canonicalName.substring(canonicalName.indexOf(".") + 1);
	}

}
