/**
 * 
 */
package driver;

import java.util.Random;

import raceFiles.Hare;
import raceFiles.Panther;
import raceFiles.Race;
import raceFiles.Racer;
import raceFiles.Tortoise;
import studentFiles.Truck;
import studentFiles.TylerD;
import studentFiles.AndrewTate;
import studentFiles.FastWalker;
import studentFiles.Godzilla;
import studentFiles.MarioKart;
import studentFiles.Penguin;
import studentFiles.PetRock;

/**
 * @author a4432_asu
 *
 */
public class Main {

	private static final double TIME_IN_SECONDS = 10.0;
	private static final double RACE_DISTANCE_METERS = 2000.0;
	private static final Random rnd = new Random();

	private boolean arrogant;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Race theRace = new Race(RACE_DISTANCE_METERS, TIME_IN_SECONDS);
		signUpRacers(theRace);
		theRace.start();
		announceWinner(theRace);

	}

	private static void announceWinner(Race r) {
		System.out.println(r.getWinner() + " is the winner.");
	}

	private static void signUpRacers(Race r) {
		Racer newRacer = new Tortoise("Timmy");
		r.signUpRacer(newRacer);
		newRacer = new PetRock("Stoney", 5,6);
		r.signUpRacer(newRacer);
		newRacer = new Hare("Bugsy");
		r.signUpRacer(newRacer);
		newRacer = new Panther("Jackson");
		r.signUpRacer(newRacer);
		newRacer = new TylerD("T-Man", 1, 3);
		r.signUpRacer(newRacer);
		newRacer = new Truck();
		r.signUpRacer(newRacer);
		newRacer = new FastWalker("Mom", 3, 5);
		r.signUpRacer(newRacer);
		newRacer = new Penguin();
		r.signUpRacer(newRacer);
		newRacer = new Godzilla();
		r.signUpRacer(newRacer);
		newRacer = new  MarioKart("Luigi");
		r.signUpRacer(newRacer);
		newRacer = new AndrewTate("Andrew");
		r.signUpRacer(newRacer);
	}

}
