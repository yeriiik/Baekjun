package string;

import java.util.Scanner;

public class two_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// 숫자의 길이
		String str = sc.next();			// 공백이 없으므로 문자열로 받고 분리시켜야 함
		
		int sum = 0;
		for(int i=0; i<n; i++) {		
			sum += str.charAt(i)-48;	// 문자열을 charAt()으로 하나씩 뽑는데, 아스키코드 값을 반환하기 떄문에
										// -48을 해줘서 정수로 변환한다.
		}
		System.out.println(sum);
		
	}

}
