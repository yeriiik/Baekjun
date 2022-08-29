package string;

import java.util.Scanner;

public class four_repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	// 입력할 문자열의 개수를 입력을 받는다.
		
		for(int i=0; i<T; i++) {	// 반복할 횟수랑 문자열을 입력받는다.
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j=0; j<S.length(); j++) {	// 문자열의 길이만큼 밑에있는 for문을 반복한다.
				for(int k=0; k<R; k++) {		// 반복할 횟수만큼 charAt()을 이용해 문자열을 반복하여 출력.
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
