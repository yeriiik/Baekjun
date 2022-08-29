package programmers;

public class Kim {
	public String solution(String[] seoul) {
		int kimIdx = 0;
		
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim"))
				kimIdx = i;
		}
		return "김서방은 " + kimIdx + "에 있다";
	}
	
//	---------------------------------------------------
	
	public static void main(String[] args) {
		Kim kim = new Kim();
		String[] names = {"Jane", "Kim", "Kang"};
		System.out.println(kim.solution(names));
	}
}
