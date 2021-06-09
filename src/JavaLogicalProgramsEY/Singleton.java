package JavaLogicalProgramsEY;

public class Singleton {
	
	//a class whose constructor is private 
	private static Singleton single;
	public String s;
	private  Singleton()
	{
		
		 s="helllo from constructor";
		 
		 
	}
	
	
	public static Singleton getInstance()
	{
		
		
		if(single==null)
		{
			return single=new Singleton();
		}
		return single;
	}
	
	
	
	

}
