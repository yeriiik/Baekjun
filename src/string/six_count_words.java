package string;

import java.util.Scanner;

public class six_count_words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();
		System.out.println(str.split(" ").length);	// split: 매개변수에 넣은 문자열을 기준으로 문자열을 나눠준다.
	}

}
