package JavaLogicalProgramsEY;

public class StringReverseUSingStringBuilder {

	
	 static String reverse(String str)
	{
		
		 StringBuilder sb=new StringBuilder(str);
		 
		 
		 
		 
		return sb.reverse().toString();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(reverse("Ashraf"));
	}
}
