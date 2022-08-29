package math;

import java.util.Scanner;

public class hotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h, w, n, x, y;
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		for(int i=0; i<t; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			
			if(n % h == 0) { // 총 층 수와 손님 수가 나누어 떨어지면
				x = h;	//  객실 층 = 손님 순서
				y = n / h;	// 호 수 = 손님 순서 / 총 층 수
			}
			else {	// 아니면
				x = n % h;	// 객실 층 = 손님 순서 % 총 층 수 	
				y = n / h + 1;	// 호 수 = 손님 수 / 총 층 수 + 1
			}
			
			arr[i] = (x * 100) + y;
		} // for
		
		for(int i : arr) System.out.println(i);

	}

}
