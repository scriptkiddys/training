package main;

public class P21 {
	
	public void main() {
		System.out.println("========== Anfang Seite 20. ==========");
		
		int x = 0;
		int y = 0;
		for (int i = 0; i < 4; i++) {
			while (x < 5) {
				switch (i) {
					case 0:
						y = x - y;
						break;
					
					case 1:
						y = y + x;
						break;
					
					case 2:
						y = y + 2;
						if (y > 4) {
							y = y - 1;
						}
						break;
					
					case 3:
						x = x + 1;
						y = y + x;
						break;
					
					case 4:
						if (y < 5) {
							x = x + 1;
							if (y < 3) {
								x = x - 1;
							}
						}
						y = y + 2;
						break;
					
					default:
						System.out.print("ERR");
						break;
				
				}
				System.out.print(x + "" + y + " ");
				x = x + 1;
				
			}
			System.out.println();
			x = y = 0;
			
		}
		System.out.println("=========== Ende Seite 20. ===========");
		System.out.println();
		
	}
	
}