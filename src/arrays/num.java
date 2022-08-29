package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
//		int[] B = {0,1,2,3,4,5,6,7,8,9};
//		
//		for(int k=0; k<B.length; k++) {
//			String numberB = String.valueOf(B[k]);
//		}
		

		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		} // for
		
		int C = A[0]*A[1]*A[2];	// 입력받은 정수를 곱한 값
		
		// 문자열 배열로 변경하기 위한 메소드 구글링
		String numberC = String.valueOf(C);
//		char[] valueC = numberC.toCharArray();
		
		
		// 비교하는 방법 구글링
		for(int j=0; j<10; j++) {
			int count = 0;
			for(int k=0; k<numberC.length(); k++) {
			if(numberC.charAt(k) == j + 48) {
				count++;
			}
		}
			
		System.out.println(count);
		}
		
		
		
	} // main

} // end class
