package string;

import java.util.Scanner;

public class one_ascii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.next().charAt(0); // 입력 받은 값을 문자로 변환하고 그 값을 int타입 변수에 저장
									 // -> 아스키 코드로 출력
		
		System.out.println(a);
		

	} // main

} // end class
