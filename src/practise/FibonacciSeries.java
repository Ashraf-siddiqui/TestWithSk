package practise;

public class FibonacciSeries {

	static 
	{
		
		int i=0,j=1,k;
		System.out.println(i);
		System.out.println(j);
		for(int terms=2;terms<10;terms++)
		{
//			System.out.println(i);
//			System.out.println(j);
			k=i+j;
			System.out.println(k);	
			
			i=j;
			j=k;
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
