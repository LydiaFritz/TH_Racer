/**
 * 
 */
package driver;

import java.util.Random;

import raceFiles.Hare;
import raceFiles.Race;
import raceFiles.Racer;
import raceFiles.Tortoise;

/**
 * @author a4432_asu
 *
 */
public class Main {

	private static final double TIME_IN_SECONDS = 10.0;
	private static final double RACE_DISTANCE_METERS = 200.0;
	private static final Random rnd = new Random();
	
	private boolean arrogant;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Racer h = new Hare("Henry");
		Racer t = new Tortoise("Tony");
		Racer r = new Racer("Racer", 1, 10);
		h.run(TIME_IN_SECONDS);
		t.run(TIME_IN_SECONDS);
		r.run(TIME_IN_SECONDS);
		
		
		/*
		 * Racer t = new Tortoise("timmy", 2, 3); t.run(10); Race theRace = new
		 * Race(RACE_DISTANCE_METERS, TIME_IN_SECONDS); signUpRacers(theRace);
		 * theRace.start(); announceWinner(theRace);
		 */


	}
	
	private static void announceWinner(Race r) {
		System.out.println(r.getWinner() + " is the winner.");
	}

	private static void signUpRacers(Race r) {
		Racer racer = new Racer("Bob", 7, 11);
		r.signUpRacer(racer);
		racer = new Racer("Amy", 1, 14);
		r.signUpRacer(racer);
		racer = new Racer("Cal", 3, 18);
		r.signUpRacer(racer);
	}
}
