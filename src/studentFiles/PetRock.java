package studentFiles;

import java.util.Random;

import raceFiles.Racer;

public class PetRock extends Racer {
	private static Random rdm = new Random();

	public PetRock(String name, int minSpeed, int maxSpeed) {
		super(name, minSpeed, maxSpeed);
	}

	@Override
	public void run(double timeInSeconds) {
		System.out.println("...*rock noises*");
		double rate = rdm.nextDouble();
		Double TripleRate = rate * rate * rate;
		double di = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		di *= TripleRate;
		double speed = this.minSpeedInMetersPerSecond + di;
		System.out.printf("Your Pet Rock is going over %.2f/n meters per second!!!", speed);
		distanceCoveredInMeters += speed * timeInSeconds;
	}
}
