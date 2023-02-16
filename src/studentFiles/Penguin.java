package studentFiles;

import raceFiles.Hare;

public class Penguin extends Hare {
    private double penguinNum;

    public Penguin() {
        super("Waddler");
        }
    public Penguin(double num) {
        super("Waddler");
        penguinNum = num;
    }

    public void waddle() {
        double r = Math.random()*10;
        if (r<9) {
            System.out.println("Penguin has fallen down");
        }
        System.out.println(getName() + " is waddling down the race");
    }

    public void dance() {
        double r = Math.random()*10;
        if (r < 9) {
            System.out.println("Penguin has fallen down");
        }
        System.out.println(getName() + " is doing a cool dance while running");
    }

    public void run(double timeInSeconds) {
        waddle();
        dance();

        double speed = 1.5;
        distanceCoveredInMeters = timeInSeconds * speed;
    }

}