package main;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Array;

public class Main {
	
	public static Scanner input; ///create field 
	
	public static void main(String[] args) {
		int[] userIn;
		userIn = new int[9];
		
		input = new Scanner(System.in);
		//String userIn[1] = new Scanner.(System.in);
		//System.out.println("User, please enter your name: ");
		//String name = input.next();
		//System.out.println("Hallo, " + name);
		/*
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		
		
		
		userIn[0] = Integer.parseInt(input.next());
		
		System.out.println("Bitte geben Sie die zweite Zahl ein: ");
		userIn[1] = Integer.parseInt(input.next());
		Arrays.sort(userIn);
		
		System.out.println (
			"Erste Zahl: " + userIn[0] +
			"Zweite Zahl: " + userIn[1] +
			"Ergebnis: " + (userIn[0] + userIn[1])
		);
		for (int i=0; i< userIn.length; i++) {
			System.out.print(userIn[i] + " " + i);
		}
		*/
		int temp=0;
		int prim = 1;
		int[] pZahlen;
		pZahlen = new int[1000];
		pZahlen[0]=1;
		
		while(prim < 1500) {
			System.out.print(prim);
			prim++;
			
			
			if ((prim % pZahlen[temp])==0){
				
				pZahlen[temp]=prim;
				temp++;
			}
		}
		for (int q = 0; q < pZahlen.length; q++) {
			System.out.print(pZahlen[q]);
		}
		for (int kapital=1000);
	}
	
}
