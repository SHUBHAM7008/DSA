package com.techdsa.common;

public class GCDEuclidsAlgo {

	public static void main(String[] args) {
		int x=24,y=15;
		int divisor,value;

		System.out.print(findGCD(x,y));
	}
	private static int findGCD(int value, int divisor) {
		if(divisor==0) {
			return value;
		}
		return findGCD(divisor,value%divisor);
	}

//	By Euclid's Algo gcd(x,y) = gcd(y,x%y);
}
