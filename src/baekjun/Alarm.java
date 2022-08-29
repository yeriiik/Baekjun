package baekjun;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		
		if(m < 45) {			// 입력받은 '분'이 45 보다 작으면  
			h--;				// 한시간 빼기
			m = 60 - (45 - m);	// 60 - (45 - 입력받은 '분')
			if(h < 0){
				h = 23;
			} 
			System.out.println(h + " " + m); 
			
		} else {
	
		System.out.println(h + " " + (m - 45));
		
		} // if-else
	} // main
	
} // end class
