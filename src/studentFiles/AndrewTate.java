package studentFiles;

import java.lang.runtime.ObjectMethods;
import java.util.Random;

import raceFiles.Racer;

public class AndrewTate extends Racer {
    private static final Random rnd = new Random();
    private boolean speedBoost;
	private double minSpeedMetersPerSecond;
    
    public AndrewTate(String name) {
        super(name, 60.0, 121.0);
    }
    private boolean setSpeedBoost() {
        return rnd.nextDouble() <= .22;
        
    }
    public String toString() {
        return "Andrew Tate";
    }
    
    public void run(double timeIntervalSeconds) {
        if(setSpeedBoost()) {
            System.out.println("Andrew Tate hops in Bugatti");
            System.out.printf("Andrew asks the other racers \"What color is your Bugatti!\"\n");
        }else {
        
        Random r = new Random();
        double rate = r.nextDouble();
        double diff = this.maxSpeedInMetersPerSecon - this.minSpeedInMetersPerSecond;
        diff *= rate;
        double speed = diff + this.minSpeedMetersPerSecond;
        this.distanceCoveredInMeters +=(speed + timeIntervalSeconds);
        System.out.println("Andrew Tate is speeding!");
    }
    
}
}

