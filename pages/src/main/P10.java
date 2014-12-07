package main;

public class P10 {
	
	public void main(){
		System.out.println("========== Anfang Seite 10. ==========");
		
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.println("x ist  " + x);
		double d = Math.random();
		
		/// das ist ein Kommentar
		System.out.println("// Eigentlich wird d nicht genutzt, aber so: " + d);
		
		while (x > 12){
			x = x - 1;
		}
		for (x = 0; x < 10; x++){
			System.out.println("x ist jetzt " + x);
		}
		
		
		if (x == 10) {
			System.out.println("x ist 10");
		} else {
			System.out.println("ist nicht 10");
		}
		if ((x<3) & (name.equals("Dirk"))) {
			System.out.println("Vorsicht!");
		}
		System.out.println("Diese Zeile wird immer ausgeführt.");
		
		
		System.out.println("=========== Ende Seite 10. ===========");
		System.out.println();
	}

}
