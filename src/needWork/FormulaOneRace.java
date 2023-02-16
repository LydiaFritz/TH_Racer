package needWork;

import java.util.Random;

import raceFiles.Racer;

public class FormulaOneRace extends Racer {
	  private static final int NUM_DRIVERS = 10;
	  private static final String[] DRIVER_NAMES = { "Lewis Hamilton", "Max Verstappen", "Sergio Perez", "Valtteri Bottas",
	      "Lando Norris", "Charles Leclerc", "Carlos Sainz", "Daniel Ricciardo", "Fernando Alonso", "Esteban Ocon" };
	  private static final Random RANDOM = new Random();

	  public FormulaOneRace() {
	    super(DRIVER_NAMES[RANDOM.nextInt(NUM_DRIVERS)]);
	  }

	  @Override
	  public void run(double timeSeconds) {
	    if (RANDOM.nextInt(10) == 0) {
	      System.out.println("\tOh no! " + this.getName() + " has crashed!");
	      return;
	    }

	    double distance = calculateDistance(timeSeconds);
	    this.setDistanceCoveredInMeters(this.getDistanceCoveredInMeters() + distance);
	  }

	  private double calculateDistance(double timeSeconds) {
	    double baseSpeed = 80.0;
	    double speedVariation = RANDOM.nextInt(21) - 10;
	    double speed = baseSpeed + speedVariation;
	    return speed; // convert from km/h to m/s
	  }

	  @Override
	  public String getObjectType() {
	    return "Formula One Race";
	  }
	}