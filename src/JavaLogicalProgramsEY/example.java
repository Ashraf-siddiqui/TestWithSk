package JavaLogicalProgramsEY;

import java.lang.Character.Subset;

public class example {

	static void swap(String a,String b)
	{
		//a=happy ,b=bday;
			//a=happybday
		//------>b=happy
	 a=a+b;
	b= a.substring(0,a.length()-b.length());
	System.out.println("value b----------------------->"+b);
	
	a=a.substring(b.length());
	System.out.println(a);
	
	}
	
	
	
	public static void main(String[] args) {
		
		String a="happy",b="Bday";
		swap(a,b);
	}
	
	
	
	
	
	
}
