package baekjun;

import java.util.Scanner;

public class YoonNyeon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*4000)+1;
		a = sc.nextInt();
		
        if((a%4==0) && ((a%100!=0)||(a%400==0))) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
	}

} 