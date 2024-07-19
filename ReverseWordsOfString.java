package com.techdsa.strings;
import java.util.*;
// Reverse Words of String
//
//input :: hello Guys
//output :: olleh syuG

public class ReverseWordsOfString {

	public static void main(String[] args) {
	
          Scanner sc = new Scanner(System.in);
          String input=sc.nextLine();
          char[] str=input.toCharArray();
          int len=str.length;
          for(int i=0;i<len;) {
        	  int end=i;
        	  while(end<len-1 && str[end+1]!=' ' ) {
        		  end++;
        	  }

        	  System.out.println();
        	  str=reverse(i,end,str);
        	  i=end+2;
          }
          System.out.print(str);
          
	}
	private static char[] reverse(int i, int j,char[] str) {
		// TODO Auto-generated method stub
		for(;i<j;i++,j--) {
		   char temp=str[i];
		   str[i]=str[j];
		   str[j]=temp;
		}
		return str;
	}

}
