package math;

import java.util.Scanner;

public class a_break_even {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] answerr = new answerr[2];
		
		int a = sc.nextInt();	// 고정 비용
		int b = sc.nextInt();	// 가변 비용
		int c = sc.nextInt();	// 노트북 가격
		
//		int num = 0;	// 노트북 대 수
//		boolean sell = true;	
//		
//		while(sell) {
//			
//			if(b<c) {
//				if((a+b*num) < c*num) {
//					System.out.println(num);
//					sell = false;
//				} 
//				else {
//					num++;
//				}
//			} else {	// 손익분기점이 존재하지 않으면
//				System.out.println(-1);
//				break;
//			}
//		}
		
		if (b>=c) {
			System.out.println(-1);
		}
		else {
			System.out.println(a/(c-b)+1);
		}

	} // main
	
} // end class
