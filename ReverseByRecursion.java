package com.techdsa.strings;

public class ReverseByRecursion {

	public static void main(String[] args) {
		String str1="abcde";
		char[] str=str1.toCharArray();
		int i =0;
		int j=str.length-1;
        System.out.println(revserseStr(str,i,j));
	}

	private static char[] revserseStr(char[] str, int i, int j) {
		if(i>=j)
			return str;
		return revserseStr(swap(str,i,j),++i,--j);
	}

	private static char[] swap(char[] str, int i, int j) {
		char t=str[i];
		str[i]=str[j];
		str[j]=t;
		return str;
	}

}
