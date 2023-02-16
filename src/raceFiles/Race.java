package raceFiles;

import java.util.ArrayList;
import java.util.Collections;

import raceFiles.Racer;

public class Race {
	private ArrayList<Racer> racers;
	private double distanceInMeters, timeIntervalInSeconds;
	public static int currentInterval = 0;
	
	public Race(double distanceMeters, double timeSeconds) {
		racers = new ArrayList<Racer>();
		this.distanceInMeters = distanceMeters;
		this.timeIntervalInSeconds = timeSeconds;
	}
	
	private void announceRacers() throws InterruptedException {
		//shuffle the field
		Collections.shuffle(racers);
		System.out.printf("Today's racers are...\n");
		Thread.sleep(2000);
		for(Racer r : racers) {
			System.out.printf("\n\t%s the %s\n", r.getName(), 
					r.getObjectType());
			Thread.sleep(750);
		}
		
	}
	
	//UPDATED BY FRITZ to show current interval
		public void start() throws InterruptedException {
			//shuffle and announce the racers
			this.announceRacers();
			currentInterval++;
			System.out.printf("\nInterval %d beginning...\n\n", currentInterval);
			update();
			while(getWinner()==null) {
				currentInterval++;
				System.out.printf("\n\nInterval %d beginning...\n", currentInterval);
				update();
			}
		}
	
	public void signUpRacer(Racer racer) {
		racers.add(racer);
	}
	
	
	
	private void update() {
		//update all the racers
		for(int i = 0; i < racers.size(); i++) {
			racers.get(i).run(this.timeIntervalInSeconds);
		}
	}
	
	public Racer getWinner() {
		for (int i = 0; i < racers.size(); i++) {
			if(racers.get(i).getDistanceCoveredInMeters()>=this.distanceInMeters)
				return racers.get(i);
		}
		return null;
	}

}
