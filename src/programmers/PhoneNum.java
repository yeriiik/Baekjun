package programmers;

// 핸드폰 번호 가리기
public class PhoneNum {
	public String solution(String phone_number) {
	
	// 핸드폰 번호를 받아서 문자열로 만들어준다.
	StringBuilder answer = new StringBuilder(phone_number);
	
	for(int i=0; i<phone_number.length()-4; i++) {
		answer.setCharAt(i, '*');
	}
	return answer.toString();
	}
}
