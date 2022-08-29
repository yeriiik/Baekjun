package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	// 배열의 수(범위) 입력
		
		int[] A = new int[num];
		
		for(int i=0; i<num; i++) {
			A[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(A);
		System.out.println(A[0] + " " + A[num-1]);
		
	}
	
} // end class
