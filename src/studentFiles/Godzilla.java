package studentFiles;

import java.util.Random;

import raceFiles.Racer;
public class Godzilla extends Racer {
    public Godzilla () {
        super("Godzilla", 50, 100);
    }

    @Override
    public void run(double timeIntervalInSeconds) {
        System.out.println("Godzilla is STOMPING.");
        Random r = new Random();
        double rate = r.nextDouble();
        double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
        diff *= rate;
        double speed = this.minSpeedInMetersPerSecond + diff;
        if (speed > 90) {
            System.out.println("Meets King Kong and starts dancing.");
            timeIntervalInSeconds--;
        } if (speed < 60) {
            System.out.println("Godzilla breaks a building on his way.");
            timeIntervalInSeconds--;
        }
        this.distanceCoveredInMeters += (timeIntervalInSeconds * speed);
        System.out.printf("Distance covered: %.2f\n", this.distanceCoveredInMeters);
    }
}