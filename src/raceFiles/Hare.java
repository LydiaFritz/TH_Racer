/**
 * 
 */
package raceFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Hare extends Racer {

	private static final Random rnd = new Random();
	private boolean arrogant;

	/**
	 * @param name
	 * @param minSpeedInMetersPerSecond
	 * @param maxSpeedInMetersPerSecon
	 */
	public Hare(String name) {
		super(name, 10.0, 15.0);
	}

	private boolean setArrogant() {
		// hare is arrogant 70% of the time
		return rnd.nextDouble() <= .7;

	}

	@Override
	public String toString() {
		return "Hare";
	}

	public void run(double timeIntervalSeconds) {
		if (setArrogant()) {
			System.out.println("The arrogant hare is napping");
		} else {
			// calculate random fraction
			Random r = new Random();
			double rate = r.nextDouble();
			double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
			diff *= rate;
			double speed = diff + this.minSpeedInMetersPerSecond;
			this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
			System.out.println("Hare is hopping");
		}
	}

}
