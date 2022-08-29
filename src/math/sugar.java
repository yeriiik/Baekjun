package math;

import java.util.Scanner;

public class sugar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = -1;							// 정확하게 N키로를 만들 수 없을 때 -1 출력
		int five = 0;								// 5키로 짜리 봉지 개수

		
		if(n%5==0) {								// 5로(5kg) 나눠지면 바로 5로 나눠서 출력
			result = n/5;
		} else {
			for(int i=3; i<=n; i++) {				// 1키로 부터 N키로 까지 for문을 돌린다.
				if(i%5==0) {						// 5로 나눠지면
					five++;							// 5키로 봉지 개수 추가
					int rest = n-(five*5);			// N키로 에서 (five(5키로봉지 개수)*5키로)를 뺀 값을 rest(나머지)에 넣는다. 
					if(rest%3==0) {					// 그 rest(나머지)가 3으로 나눠지면
						result = five + (rest/3);	// 결과는 five(5키로 봉지 개수) + (rest(나머지) / 3키로)
					} else if(n%3==0) {				// 위에 다 아니고 N키로가 3키로로 나눠지면 결과는 N키로 / 3
						result = n/3;
					}
				}
				
			} // for
			
		} // if
		System.out.println(result);

	} // main

} // end class
