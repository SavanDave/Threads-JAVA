
public class RaceTest {

	public static void main(String[] args) {
		Food food = new Food();
		Thread rabbit = new Thread( new Animal("rabbit",0.0,5.0,150, food));
		Thread turtle = new Thread(new Animal("turtle",0.0,3.0,100, food));
		 
		 rabbit.setDaemon(false);
		 turtle.setDaemon(false);
		 
		 rabbit.start();
		 turtle.start();
	}

}
