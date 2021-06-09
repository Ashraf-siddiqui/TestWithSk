package Recursion;

public class Factorial {

	static int returnfactorial(int n)
	{
		if(n>1)
		return n*returnfactorial(n-1);
		
		
		return 1;
		
	}
	
	
	
	static int returnFactorialWithoutRecursion(int n)
	{int result=1;
		for(int i=2;i<=n;i++)
		{
			
			result =result*i;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
	;
	System.out.println(returnfactorial(6));	
	System.out.println(returnFactorialWithoutRecursion(6));
}
	
	
	
	
	
	
	
}
