package math;

import java.util.Scanner;

public class snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int currentHeight = 0;
		int day = 0;
		
		while(currentHeight <= V ) {
			currentHeight += A;
			day++;
			
			if(currentHeight >= V) {
				break;
			} // if
			currentHeight -= B;
		}
		System.out.println(day);
	} // main

} // end class
