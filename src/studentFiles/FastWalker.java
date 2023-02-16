package studentFiles;

import raceFiles.Racer;

public class FastWalker extends Racer {
	private static double WalkingFrequency;
	private static double RunningFrequency;

	public FastWalker(String name, double WalkingSpeed, double RunningSpeed) {
		super(name, WalkingSpeed, RunningSpeed);
		WalkingFrequency = 0.9 + Math.random();
		RunningFrequency = 1 - WalkingFrequency;
	}

	public void run(double time) {
		//distanceCoveredInMeters = RunningFrequency * time * RunningSpeed + WalkingFrequency * time * WalkingSpeed;
		System.out.println("Fast Walker tries to access private variables.");
	}
}