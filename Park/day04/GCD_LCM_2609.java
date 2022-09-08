package com.ssafy.gcd_lcm;

import java.util.Scanner;

public class GCD_LCM_2609 {
/*
 
24 18
 
 */
	public static void main(String[] args) {
		// 유클리드 호재법 - 두 수의 최대공약수를 구하는 알고리즘
		// 최대 공약수 예시
		// 1071과 1029의 최대공약수를 구하면,
		// 1071은 1029로 나누어 떨어지지 않기 때문에, 1071을 1029로 나눈 나머지를 구한다. ≫ 42
		// 1029는 42로 나누어 떨어지지 않기 때문에, 1029를 42로 나눈 나머지를 구한다. ≫ 21
		// 42는 21로 나누어 떨어진다.
		// 따라서, 최대공약수는 21이다.
		// r = A mod B ( r 은 a에 b를 나눈 나머지 )
		// GCD(A, B) = GCD(b, r) = ... = d ( d 는 A 와 B 의 최대공약수 )
		// 최소 공배수
		// A = a * d, B = b * d 라면
		// a 와 b 는 서로소, A 와 B 의 최소공배수 => a * b * d
		// 최소 공배수 => A * B / d
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int gcd = GCD(a, b);
		int lcm = LCM(a, b);
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a % b);
	}
	
	public static int LCM(int a, int b) {
		return a*b/GCD(a,b);
	}

}
