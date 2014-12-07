package main;

public class P12 {
	
	public void main(){
		System.out.println("========== Anfang Seite 12. ==========");
		
		int x = 1;
		System.out.println("Vor der Schleife");
		while (x < 4) {
			System.out.println("In der Schleife");
			System.out.println("Der Wert von x ist " + x);
			x = x + 1;
		}
		
		System.out.println("Nach der Schleife");
		
		System.out.println("=========== Ende Seite 12. ===========");
		System.out.println();
	}

}
