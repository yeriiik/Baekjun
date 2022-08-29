package arrays;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		int multi = 1;
		
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
			multi *= A[i];
		} // for
		
		String num = Integer.toString(multi);

		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<num.length(); j++) {
				if(num.charAt(j) == i + 48) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
		
		
	} // main

} // end class
