
public class Bubble_Sort_Program {

	
	
	public static int[] Sort_Using_Bubble_Sort(int[] arr)
	{
		
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
		return arr;
		
		
		
		
		
	}
	
	
	public static int[] Sort_Using_Selection_Sort(int[] arr)
	{ int largest=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
	
	
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>largest)
			{
				largest=arr[j];
				
			}
			
		}
		System.out.println("------>largest"+largest);
		int temp=arr[arr.length-i-1];
		arr[arr.length-i-1]=largest;
		largest=arr[arr.length];
		
	}
	return arr;
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		int[] intArray = new int[] {9,3,8,4,2,3};
		
		int[] intArray1=Bubble_Sort_Program.Sort_Using_Bubble_Sort(intArray);
//		System.out.println("Sort using bubble Sort.");
//		for(int a : intArray1)
//		{
//			System.out.print(a);
//		}
//		
		
		int[] intArray2=Bubble_Sort_Program.Sort_Using_Selection_Sort(intArray);
		
		
		for(int a : intArray2)
		{
			System.out.print(a);
		}
		
	}
	
	
	
}
