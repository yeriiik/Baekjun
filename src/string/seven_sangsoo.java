package string;

import java.util.Scanner;

public class seven_sangsoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2]; 	// 세자리수 두개를 넣는 배열 선언
	
		for(int i=0; i<num.length; i++) {
			int a = sc.nextInt();
			int[] num2 = new int[3];	// 세자리수를 넣어주는 배열
			num2[0] = a/100;		// 100의자리 숫자를 넣어준다.
			num2[2] = a%10;			// 1의자리 숫자를 넣어준다.
			num2[1] = (a-(num2[0]*100) - num2[2]); // 10의 자리 숫자
			num[i] = (num2[2]*100) + (num2[1]) + num2[0];
		}
		sc.close();
		
		System.out.println((num[0] > num[1]) ? num[0] : num[1]);
	} // main

} // end class
