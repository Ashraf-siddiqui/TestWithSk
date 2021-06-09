package JavaLogicalProgramsEY;

import java.util.Arrays;

public class AscendingAnd3rdBiggest {

	
	
	static void Thirdbiggest(int arr[],int n)
	{
		String s=new String("java");
		String s1=new String("java");
		System.out.println(s==s1);
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
			}
			
			
			
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		int index=arr.length-n;
		System.out.println("Third largest is "+arr[index]);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		 
		int arr[]= {5,8,3,10,15,17,18,9,1,2};
		Thirdbiggest(arr,3);

	}

}
