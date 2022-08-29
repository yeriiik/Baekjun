package programmers;

import java.util.*;

class Report1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,Integer> reportCnt = new HashMap<>();	// 신고횟수
        Map<String,String> reportNames = new HashMap<>();	// 신고자
        for(String str : id_list){		// id_list 만큼
            reportCnt.put(str,0);		// 신고횟수 Hashmap에 key: id, value: 0 넣는다.
            reportNames.put(str,"");	// 신고자 Hashmap에 key: id, value: "" 넣는다.
        }

        Set<String> set = new HashSet<>();
        for(String str : report)	// 신고 횟수만큼 
            set.add(str);

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            StringTokenizer st = new StringTokenizer(it.next()," ");
            String s1=st.nextToken();
            String s2=st.nextToken();
            reportNames.replace(s1,reportNames.get(s1)+" "+s2);
            reportCnt.replace(s2,reportCnt.get(s2)+1);
        }

        for(int i=0;i<id_list.length;i++){
            StringTokenizer st = new StringTokenizer(reportNames.get(id_list[i])," ");
            while(st.hasMoreTokens())
                if(reportCnt.get(st.nextToken())>=k)
                    answer[i]++;
        }

        return answer;
    }
}