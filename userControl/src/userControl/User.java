package userControl;

public class User {
	
	private String name = "ERR";
	private int salary = 000;
	private int secLevel = 0;
	
	public String getName() {
		return name;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public int getSecLevel(){
		return secLevel;
	}
	
	void print () {
		System.out.println(getName() + getSalary()+ getSecLevel());
	}

}
