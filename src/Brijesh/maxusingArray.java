package Brijesh;

public class maxusingArray {

	
	
	//find max and minimum occuring element using array
	
	
	public static void max(String Str)
	{
		//str="programming"
		int []occurence=new int[127];
		
		for(int i=0;i<Str.length();i++)
		{
			occurence[Str.charAt(i)]=occurence[Str.charAt(i)]+1;
			
		}
		
	int max=Integer.MIN_VALUE;
		for(int i=0;i<occurence.length;i++)
		{
			if(max<occurence[i])
			{
				max=occurence[i];
			}
		}
		System.out.println("max value is "+max);
		
		
		
		for(int i=0;i<occurence.length;i++)
		{
			if(occurence[i]==max)
			{
				System.out.println("character is "+(char) i);
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		max("programming");
		
		
		
		
		
		
	}
	
	
	
	
}
