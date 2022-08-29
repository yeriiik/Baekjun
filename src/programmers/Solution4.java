package programmers;

public class Solution4 {
	public String solution(String s) {
		String[] arr = s.split("");
		String answer = "";
		
		if(arr.length % 2 == 0) {
			answer = arr[(arr.length/2)-1] + arr[arr.length/2];
		} else 
			answer = arr[arr.length/2];

		return answer;
	}
	
	public static void main(String[] args) {
		Solution4 test = new Solution4();
		System.out.println(test.solution("hello"));
	}
}
