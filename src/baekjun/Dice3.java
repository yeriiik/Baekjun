package baekjun;

import java.util.Scanner;

public class Dice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b & a==c) {							// 숫자가 모두 같은 경우
			System.out.println(10000+(a)*1000);	
		} else if(a==b & a!=c) {					// 두개의 숫자가 같은 경우
			System.out.println(1000+(a)*100);
		} else if(b==c & b!=a) {
			System.out.println(1000+(b)*100);
		} else if(a==c & a!=b) {
			System.out.println(1000+(a)*100);
		} else if((a>b & a>c) & (a!=b) & (a!=c) & (b!=c)){
			System.out.println(a*100);
		} else if((b>a & b>c) & (a!=b) & (a!=c) & (b!=c)){
			System.out.println(b*100);
		} else if((c>a & c>b) & (a!=b) & (a!=c) & (b!=c)){
			System.out.println(c*100);
		} else {
			System.out.println();
		} 

	} // main

} // end class
