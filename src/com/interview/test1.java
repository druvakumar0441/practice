package com.interview;

import java.util.Scanner;

public class test1 {

	//write a program to find a power(a,b) both integer
	//a=2, b=3
	//output=8
	public static int power(int a, int b) {
		int power =1;
		for(int i=1; i<=3; i++) {
			power = power*a;
		}
		return power;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		int result = power(a,b);
		System.out.println(result);
	}

}
