package com.techdsa.common;
// Greatest Common Divisor
public class GCD {

	public static void main(String[] args) {
		int x=24,y=15;
		int divisor,value;
		if(x>y) {
			divisor=y;
			value=x;
		}
		System.out.print(findGCD(x,y));
	}
	private static int findGCD(int value, int divisor) {
		int rem=value%divisor;
		if(rem==0) {
			return divisor;
		}
		value=divisor;
		divisor=rem;
		return findGCD(value,divisor);
	}
//    24%15=9
//    		15%9=6
//    		       9%6=3
//    		              6%3=0
//    		                    so return 3 (divisor)
}
