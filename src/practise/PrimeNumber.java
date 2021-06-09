package practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class PrimeNumber {
	
	

	public static void ExtractNumber(String str) {
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				
				System.out.println("number is"+str.charAt(i));
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
	int a='a';
//	System.out.println(a);
//		int nu='0';
//		int n='1';
//		int n1='9';
//		System.out.println(0+"="+nu);
//	
//		System.out.println(1+"="+n);
//		System.out.println(9+"="+n1);
//		
	PrimeNumber.ExtractNumber("98a71s3359s33s");
		
	}
}
