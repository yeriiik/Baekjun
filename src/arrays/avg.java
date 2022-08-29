package arrays;

import java.util.Scanner;

public class avg {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		// 과목 수 입력
		double M = 0; // 최고점수
		double sum = 0; // 점수 합계
		
		double[] A = new double[num];
		
		for(int i=0; i<num; i++) {	// 점수 입력
			A[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int j=0; j<A.length; j++) {	// 최고점수 구하기
			if(A[j] > M) {
				M = A[j];
			}
			
		}
		
		for(int i=0; i<A.length; i++) {
			sum += (A[i]/M)*100;	// sum에 점수/최고점수*100을 더한값을 저장
		}
		
		System.out.println(sum/A.length);
		
		
	} // main
}
