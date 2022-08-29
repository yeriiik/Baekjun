package programmers;

class Math {
    public int[] solution(int[] answers) {
    	int count = 0;
    	
    	// 학생 1
        int[] student1 = {1, 2, 3, 4, 5};
        int correct1 = 0;
        int[] answer1 = new int[answers.length];
        
        while(count < answer1.length) {
        	answer1[count] = student1[count%student1.length]; 
        	count++;
        }
          
        
        count = 0;
        
        // 학생 2
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int correct2 = 0;
        int[] answer2 = new int[answers.length];
        
        while(count < answer2.length) {
        	answer2[count] = student2[count%student2.length]; 
        	count++;
        }
        
        
        count = 0;
        
        // 학생 3
        int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int correct3 = 0;
        int[] answer3 = new int[answers.length];
        
        while(count < answer3.length) {
        	answer3[count] = student3[count%student3.length]; 
        	count++;
        }
        
        for(int i=0; i<answers.length; i++) {
        	if(answer1[i] == answers[i]) {
        		correct1++;
        	}
        }
        
        for(int i=0; i<answers.length; i++) {
        	if(answer2[i] == answers[i]) {
        		correct2++;
        	}
        }
        
        for(int i=0; i<answers.length; i++) {
        	if(answer3[i] == answers[i]) {
        		correct3++;
        	}
        }
        
        int[] answer = {correct1, correct2, correct3};
        
        if(correct1 > correct2 && correct1 > correct3) {
        	return new int[] {1};
        } else if(correct2 > correct1 && correct2 > correct3) {
        	return new int[] {2};
        } else if(correct3 > correct1 && correct3 > correct2) {
        	return new int[] {3};
        } else if(correct1 == correct2 && correct1 > correct3) {
        	return new int[] {1, 2};
        } else if(correct1 == correct3 && correct1 > correct2) {
        	return new int[] {1, 3};
        } else if(correct2 == correct3 && correct2 > correct1) {
        	return new int[] {2, 3};
        } else if(correct1 == correct2 && correct1 == correct3) {
        	return new int[] {1, 2, 3};
        }
        
		return answer;
        
   
    }
    
}
