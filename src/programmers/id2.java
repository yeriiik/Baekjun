package programmers;

class id2 {
	public String solution(String new_id) {
        String answer = new_id.toLowerCase(); // 1단계

        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계: [] 안의 문자를 제외한 나머지 제거
        answer = answer.replaceAll("[.]{2,}", "."); // 3단계: '.'이 2회 이상이면 '.'으로 치환
        answer = answer.replaceAll("^[.]|[.]$", "");    // 4단계: '.'이 처음이나 끝에 있다면 제거
        
        if (answer.equals("")) {    // 5단계
            answer += "a";
        }

        if (answer.length() >= 16) {     // 6단계
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");	// '.'이 끝에 있으면 제거
        }

        if (answer.length() <= 2) {  // 7단계
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }
}
