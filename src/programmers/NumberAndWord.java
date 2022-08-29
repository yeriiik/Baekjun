package programmers;

class NumberAndWord {
    public int solution(String s) {
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                
        for(int i=0; i<word.length; i++) {
        	if(s.contains(word[i])) {
        		s = s.replace(word[i], num[i]);
        	}
        } // for
        
        int answer = Integer.parseInt(s);
		return answer;
        
   	} // solution
    
    public static void main(String[] args) {

    	NumberAndWord test = new NumberAndWord();
    	System.out.println(test.solution("twotwo3seven"));
    	
    } // main
} // end class

