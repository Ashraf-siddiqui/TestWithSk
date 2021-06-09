package practise;

public class Example2 extends exapmle{

	
	//static {y=20;}
	static int y=24;
//	public  void  method()
//	{
//		
//		System.out.println("In child class.");
//	}
	
	

	public void method3()
	{
		System.out.println("In child class.---->+3");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		exapmle ex=new Example2();
		ex.method();
	 
		
		
//		int i = 10;
//    	int j = i++ + ++i + --i - i--;
//    	System.out.println(j);
 // 	System.out.println(Example2.y);
		
	}
	
	
	
	
}
