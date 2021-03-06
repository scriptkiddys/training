package clock;

public class Clock {
	private int time = 0000;
	private String timeZone = "ERR";
	
	public int getTime(){
		return time;
	}
	public String getTimeZone(){
		return timeZone;
	}
	
	void setTime(int newTime) {
		time = newTime;
	}
	
	void setTimeZone(String newTimeZone) {
		timeZone = newTimeZone;
	}
	
	void printTime() {
		System.out.println("The time in " + getTimeZone() + " is: " + getTime());
	}
	
}
