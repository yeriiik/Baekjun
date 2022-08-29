package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class min_max2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] A = new int[n];
	
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(A);
		System.out.println(A[0] + " " + A[n-1]);
		
	}

}
