package Brijesh;

import java.util.HashMap;
import java.util.List;

public class Tutorial3 {
	
	 //static keyword
	//2nd way after object creation.
	//it is a keyword.
	//functions,variables,class
	//non static ----------------->>>>instance(object),variable,function.
	
	int x=2;//gole k 
	int j=2;
	String s="23";
	Integer i=new Integer(s);
	String s2=Integer.toString(i);
//	Float f=new Float(value);
//	Double d=new Double(value);
//	Boolean b=new Boolean(value);
//	Byte b=new Byte(value);
//	
	
	void fun2(int N)
	{
		
		//x is accessible here.
		while (N > 0) {
            int d = N % 10;
            System.out.println(d + " ("
                               + (d + 48) + ")");
 
            N = N / 10;
        }
	}
	
	
	//static ------------->variable,function,class
	static int fun()
	{
		//rectangle....
	//	System.out.println(x);
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		
		
	
		Tutorial3 t3=	new Tutorial3();
		t3.fun2(36);

//		Tutorial3 t4=	new Tutorial3();
//		t4.fun2();
//		
		
		
		
	}
	
	

}
