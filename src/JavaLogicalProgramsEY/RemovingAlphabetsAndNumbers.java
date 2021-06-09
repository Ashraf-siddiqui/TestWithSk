package JavaLogicalProgramsEY;

public class RemovingAlphabetsAndNumbers {

	
	static void remove(String str)
	{ String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>64&&str.charAt(i)<=122 || str.charAt(i)>47 &&str.charAt(i)<=57)
			{
				res=res+str.charAt(i);	
			}
			
		}
		
		System.out.println(res);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		remove("AZ08393989.....><><>{{}}}");
		
		
		We arr[]=new Object[9];
		arr[0]=1;
		arr[1]="string";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
}
