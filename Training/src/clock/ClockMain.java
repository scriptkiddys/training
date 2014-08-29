package clock;

public class ClockMain {

	public static void main(String[] args) {
		Clock clockUK = new Clock();
		Clock clockDE = new Clock();
		
		clockDE.changeTime(1600);
		clockUK.changeTime(1500);
		clockDE.printTime();
		clockUK.printTime();
	}

}
