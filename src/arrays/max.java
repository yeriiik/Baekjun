package arrays;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		
		int[] A = new int[9]; // 9개의 수를 가지고 있는 배열 선언
		 
		
		for(int i=0; i<A.length; i++) {
			 A[i] = sc.nextInt();
		}
		
		for(int e : A) {
			count++;
			if(e > max) {
				max = e;
				index = count;
			} // if
		} // enhanced-for
		
		sc.close();
		
		System.out.println(max + "\n" + index);
	} // main

} // end class
