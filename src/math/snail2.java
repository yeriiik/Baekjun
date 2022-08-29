package math;

import java.util.Scanner;

public class snail2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
			int A = sc.nextInt();
			int B = sc.nextInt();
			int V = sc.nextInt();
			
			int day, before;
			
			
			before = V - A;
			day = before / (A-B);
			if(before%(A-B)!=0)
				day++;
			System.out.println(day+1);
			
	} // main

} // end class
