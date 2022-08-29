package repeat;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {	
			
			for(int j=1; j<=n-i; j++) {	 // 공백은 입력값에 현재 줄(i)을 뺀 만큼 반복
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {	
				System.out.print("*");
			}
		System.out.println();
			
		}
	}

}
