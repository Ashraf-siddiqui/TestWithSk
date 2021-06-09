package oOPS_Programs;

public class InheritanceClassFirst {

	
	
	public void Method_In_InheritanceClassFirst()
	{
		System.out.println("method from First class.");
	}
	
	
	protected void Method2_In_InheritanceClassFirst()
	{
		
		
		System.out.println("method2 from First class.");
		
	}
	
	
	private void Method3_In_InheritanceClassFirst()
	{
		
		
		System.out.println("method3 from First class.");
		
	}
	
	
	
	public static void main(String[] args) {
		InheritanceClassFirst obj=new InheritanceClassFirst();
		//private method can only be access within the class.
		
		obj.Method3_In_InheritanceClassFirst();
		
		
		
	}
	
	
	
	
	
	
	
}
