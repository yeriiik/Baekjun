package baekjun;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*100);
		a = sc.nextInt();
		
        if(a >= 90) {
        	System.out.println("A");
        } else if(a>=80) {
        	System.out.println("B");
        } else if(a>=70) {
        	System.out.println("C");
        } else if(a>=60) {
        	System.out.println("D");
        } else {
        	System.out.println("F");
        }

	}

} 