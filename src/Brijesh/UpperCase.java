package Brijesh;

public class UpperCase {

	
	//AshrafAutomation=>get the count of uppercase in this string.
	
	
	
	static int countUppercase(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(Character.isUpperCase(a))
//			{StringBuilder bu=new StringBuilder("Ashraf");
//			StringBuffer b1=new StringBuffer("Ashraf");
//			System.out.println(bu +" "+b1);
		//		System.out.println(a);
				++count;
			}
			
		return count;	
		}
		
		
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
	int count=countUppercase("AutomationAshraf");
	
	System.out.println(count);
	
	
	
	
	}
}
