package programmers;

import java.util.HashMap;
import java.util.HashSet;

class Report2 {
	public int[] solution(String[] id_list, String[] report, int k) {
	        
			// key: 신고자, value: 피신고자
			// HashSet: 중복값 처리를 위해
	        HashMap<String, HashSet<String>> reportHash = new HashMap<>();
	        // key: 피신고자, value: 신고자
	        HashMap<String, HashSet<String>> resultHash = new HashMap<>();
	        
	        // report를 하나씩 처리
		        for (String r : report) {	// 0번에 신고자 ID, 1번에 피신고자 ID
		        	String[] str = r.split(" ");	// 공백으로 분리
		        	
	        	if (reportHash.containsKey(str[0]) == false)	// reportHash에 키값이 있는지 확인 
	        		reportHash.put(str[0], new HashSet<>());	// 없으면 set 객체를 생성해서 넣어준다.
	        	reportHash.get(str[ 0]).add(str[1]);	// 피신고자를 넣는다.
	        	
	        	if(resultHash.containsKey(str[1]) == false)
	        	   resultHash.put(str[1], new HashSet<>());
	        	resultHash.get(str[1]).add(str[0]);
	        }
	        
	        int[] answer = new int[id_list.length];
	        for (int i=0; i<answer.length; ++i) {
	        	String user = id_list[i];
	        	if(reportHash.containsKey(user) == false)
	        		continue;
	        	
	        	for(String bad : reportHash.get(user)) {
	        		if (resultHash.get(bad).size() >= k)
	        			answer[i]++;
	        	}
	        }
	        return answer;
	    }
	}

