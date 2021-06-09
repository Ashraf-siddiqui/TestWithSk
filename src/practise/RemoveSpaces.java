package practise;

public class RemoveSpaces {

	
	static  char[] removespaces(String arr)
	{
	char[] array=arr.toCharArray();
	//"            my name      is   Ashraf     "


	for(int i=0;i<array.length;i++)
	{char space;
		if(array[i]==' ' & array[i+1]==' ')
		{ 
			space=array[i+1];
			
			while(space==' ')
			{
				space++;
			}
			
			
			
			
		}
		
		
	}
		return array;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
