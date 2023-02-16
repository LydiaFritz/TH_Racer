package studentFiles;

import java.util.Random;

import raceFiles.Racer;

public class MarioKart extends Racer {
	
	private String[] item = {"Mushroom", "Mushroom", "Star"};
	private boolean hasItemBox = false;

	public MarioKart(String name) {
		super(name, 10.0, 15.0);
	}
	
	private boolean shouldGenerateItemBox() {
		Random rnd = new Random();
		if (rnd.nextInt(2) == 0) {
			System.out.println("Watch out, " + name + " got an Item Box!");
			return true;
		}
		else {
			System.out.println(name + " has no Item");
			return false;
		}
	}
	
	private int itemBoost() {
		int itemIndex = 0;
		hasItemBox = shouldGenerateItemBox();
		if (hasItemBox == true) {
			Random rnd = new Random();
			itemIndex = rnd.nextInt(3);
			
			if (itemIndex == 0 || itemIndex == 1) {
				System.out.println("Got a " + item[itemIndex] + "... Boost!");
				return 5;
			}
			if (itemIndex == 2) {
				System.out.println("Wow! Got a " + item[itemIndex] + " *star music plays*");
				return 10;
			}
		}
		return 0;
	}
	
	@Override
	public void run(double timeIntervalSeconds) {
		
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
		diff *= rate;
		double speed = diff + this.minSpeedInMetersPerSecond + itemBoost();
		this.distanceCoveredInMeters += (speed*timeIntervalSeconds);
	}
	
	public String toString() {
		return name;
	}

}
