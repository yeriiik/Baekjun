package string;

import java.util.Scanner;

public class three_alphabet {

	public static void main(String[] args) {
		int[] result = new int[26]; // 알파벳이 처음 등장하는 위치를 저장할 용도로 알파벳 개수만큼의 배열 생성
		for(int i=0; i<result.length; i++) {
			result[i] = -1;			// 입력 받은 단어에 없는 알파벳을 -1로 설정
		}
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	// 단어가 주어진다.
		
		for(int i=0; i<str.length(); i++) {
			char a = str.charAt(i);	// 문자열의 i번째 문자를 문자형 변수 a에 저장
			int b = (int)a;			// 문자를 int형 아스키 코드에 저장
			int c = b-97;			// a가 인덱스[0], b가 인덱스[1]에 있게 하기 위해 a의 아스코드 97에서 97을 빼서 0으로 만들어준다.
			
			if(result[c] == -1) {
				result[c] = i;		// i를 넣어준다.
			} else {
				continue;
			}
		}
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i] + " "); // 공백을 넣어서 출력해준다.
	}

}
