package baekjun;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();	// 시
		int m = sc.nextInt();	// 분
		int t = sc.nextInt();	// 소요시간
		
		h += t/60;	// 시 + (소요시간/60(분))
		m += t%60;	// 분 + (소요시간(분)을 60으로 나눈것의 나머지(분))
	
		if(m>59) {	// 59분이 넘었을 경우
			m = m-60;
			h++;
		}
		
		if(h>23) {	// 23시가 넘었을 경우
			h = h-24;
		}
		
		
		System.out.println(h + " " + m);
	} // main

} // end class
