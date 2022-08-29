package repeat;

import java.util.Scanner;

public class fast_a_plus_b {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;	
		num = sc.nextInt();
		
		int[] A = new int[num];
		int[] B = new int[num];
		
		for(int i=0; i<num; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(A[i] + B[i]);
		}
	} // main

} // end class
