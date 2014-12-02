package userControl;

public class Main {
	int currentStatus = 0;
	
	public static void main(String[] args) {
		
		String finalStatus = getStatus();
		System.out.println("System launching..." + finalStatus);

	}

	public String getStatus() {
		String x = "ERR";
		if (currentStatus == 0) {
			x = "   Done";
		} else {
			x = "   Fatal Error";
		}
		return x;
	}

}
