package studentFiles;

import java.util.Random;

import raceFiles.Racer;

public class Truck extends Racer {

	public String name = "Annoying Trucker";

	public String toString() {
		return name;
	}

	public Truck() {
		super("Annoying Trucker", 20, maxSpeedInMetersPerSecon());
	}

	public static int maxSpeedInMetersPerSecon() {
		double ran = Math.random();

		if (ran > .5) {
			System.out.println("The Trucker has his Brights on in the middle of the day making him more powerful!");
			return 50;
		}

		return 30;
	}

	public void run(double timeIntervalSeconds) {
		// calculate random fraction
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		diff *= rate;
		double speed = diff + this.minSpeedInMetersPerSecond;
		this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
	}
}
