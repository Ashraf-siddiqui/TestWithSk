package JavaLogicalProgramsEY;

public class NthRepeatingElementFromLeft {

	
	
	static int NthRepeatingElementFromLef(int arr[],int n)
	{
		
		//{2,3,4,5,3,2,6,3,3,5}
		int size=arr.length;
		int count=0;
		int j=0;
		int res[]=new int[size];
		for(int i=0;i<size;i++)
		{
			for( j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				count++;
			
				
			}
			int temp=arr[i];
			arr[i]=arr[size-1];
			arr[size-1]=temp;
			if(res[size-1]==0)
			res[size-1]=count;
			
			size--;
			
		}
		
		return res[n];
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		int arr[]={2,3,4,5,3,2,6,3,3,5};
		System.out.println(NthRepeatingElementFromLef(arr,3));
		
		
	}
	
	
	
}
