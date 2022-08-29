package repeat;

import java.util.Scanner;

public class a_plus_b_8 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;	
		num = sc.nextInt();
		int caseNo = 0;
		
		int[] A = new int[num];
		int[] B = new int[num];
		
		for(int i=0; i<num; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			caseNo++;
			System.out.println("Case #" + caseNo + ": " + A[i] + " + " + B[i] + " = " +  (A[i]+B[i]));
		}
	} // main

} // end class
