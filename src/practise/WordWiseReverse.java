package practise;

import java.util.Arrays;

public class WordWiseReverse {
	
	
	
	public static void reverseInsideAString(String str)
	{
		char arr[]=str.toCharArray();
		int t=0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==' '|| i==arr.length-1)
			{System.out.println("value of i "+i);
			for(int j=i-1;j>t;t++,j--)
			{
				char temp=arr[j];
				arr[j]=arr[t];
				arr[t]=temp;
			
			}
			t=i+1;
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WordWiseReverse.reverseInsideAString("This is a program");
	}

}
