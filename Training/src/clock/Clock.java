package clock;

public class Clock {
	int time = 0000;

	void changeTime(int newTime) {
		time = newTime;
	}

	void printTime() {
		System.out.println("time:" + time);
	}
}
