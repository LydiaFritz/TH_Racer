package needWork;


import java.util.Random;

public class Minotaur extends Driver{
	private static final Random r = new Random();
	private boolean isCharging;
	
	public Minotaur(){
		super("Johnny", 17, 25);
	}

	private boolean isCharging(){
		int rnd = r.nextInt(21);
		if(rnd > 12){
			this.isCharging = true;
		}else{
			this.isCharging = false;
		}
	}
	
	@Override
	public void run(double timeInSeconds){
		isCharging();
		double rate = r.nextDouble();
		double diff = this.maxSpeedInMetersPerSecond - this.minSpeedInMetersPerSecond;
		if(isCharging){
			System.out.println("The minotaur charges!");
			diff *= rate;
			double speed = diff + this.maxSpeedInMetersPerSecond;
			this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
		}else{
			System.out.println("The mintoaur runs!");
			diff *= rate;
			double speed = diff + this.minSpeedInMetersPerSecond;
			this.distanceCoveredINMeters += (speed * timeIntervalSeconds);
		}
	}
		
		@Override
		public String toString() {
			return "Minotaur";
		}
}