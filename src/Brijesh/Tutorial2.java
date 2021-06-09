package Brijesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tutorial2 {
	
	int x;
	static void fun()
	{
		System.out.println("ashraf");
		
	}
	
	
	public static void main(String[] args) {
		
		Tutorial2 t2=new Tutorial2();
		t2.fun();
		t2=null;
		t2.fun();
		
		
    new Tutorial2().fun();
//	
//	new Tutorial2().fun();
//	
	
	int arr[]= {5,8,9,10,109};
	List<Integer>e=new ArrayList<Integer>();
	e.add(2);
	e.add(2);
	Set<Integer> set=new HashSet<Integer>(e);
	
	System.out.println(set);
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
