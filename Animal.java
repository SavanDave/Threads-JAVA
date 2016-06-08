import java.util.Random;

public class Animal implements Runnable {

	private String name;
	private double position;
	private double speed;
	private int restMax;
	private Food food;
	private static boolean winner = false;

	public Animal(String name, double position, double speed, int restMax, Food food) {
		super();
		this.name = name;
		this.position = position;
		this.speed = speed;
		this.restMax = restMax;
		this.food = food;
		
	}



	@Override
	synchronized public void run() {
//		while(true){
//		food.eat(this.name);
//		}
		while (!(position >= 100) || winner == false) {
			Random r = new Random();
			try {
				Thread.sleep(r.nextInt(getRestMax()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.position += this.speed;
			System.out
					.println(this.getName() + " is at " + this.getPosition() + " and is running at " + this.getSpeed());

			if (this.position >= 100) {
				winner = true;
				System.out.println("The winner is " + this.getName());
			}
			food.eat(this.name);
		}

	}
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRestMax() {
		return restMax;
	}

	public void setRestMax(int restMax) {
		this.restMax = restMax;
	}

	public static boolean isWinner() {
		return winner;
	}

	public static void setWinner(boolean winner) {
		Animal.winner = winner;
	}

}
