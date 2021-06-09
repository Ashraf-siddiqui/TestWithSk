package oOPS_Programs;

public class InheritanceClassSecond extends InheritanceClassFirst
{
	
	public static void main(String[] args) {
		
		
		//inheritance first objective achieved
		InheritanceClassSecond obj=new InheritanceClassSecond();
		obj.Method_In_InheritanceClassFirst();
		
		obj.Method2_In_InheritanceClassFirst();
			
	//	Not able to inherit the private function.
		
	//the only way to access that method will be by the one present in that class.
		
//		InheritanceClassFirst obj2=new InheritanceClassFirst();
//		obj2.Method3_In_InheritanceClassFirst
//		
		
		
		
	}

}
