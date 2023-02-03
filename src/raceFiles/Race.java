package raceFiles;

import java.util.ArrayList;

public class Race {
	private ArrayList<Racer> racers;
	private double distanceInMeters, timeIntervalInSeconds;
	
	public Race(double distanceMeters, double timeSeconds) {
		racers = new ArrayList<Racer>();
		this.distanceInMeters = distanceMeters;
		this.timeIntervalInSeconds = timeSeconds;
	}
	
	public void signUpRacer(Racer racer) {
		racers.add(racer);
	}
	
	public void start() {
		System.out.println("Starting the race");
		do {
			update();
		}while(getWinner() == null);
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
