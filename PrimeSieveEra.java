package com.techdsa.array;
import java.util.*;
public class PrimeSieveEra {

	public static void main(String[] args) {
		System.out.print("Enter last limit : ");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] prime =new int[n];
        for(int i=0;i<n;i++){
        	prime[i]=1;
        }
        
        for(int i=2;i<Math.sqrt(n);i++) {
        	if(prime[i]==1) {
        		for(int j=i*i;j<n;j+=i) {
        			prime[j]=0;
        		}
        	}
        }
        for(int i=2;i<n;i++){
        	if(prime[i]==1) {
        		System.out.print(i+" ");
        	}
        }
	}

}
