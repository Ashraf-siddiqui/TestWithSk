package oOPS_Programs;

public class EncapsulationPart2 {

	
	
	
	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
		obj.setAddress("Delhi");
		obj.setName("Ashraf");
		obj.setRollNumber(1);
		obj.setMobileNumber(100);
		
		
		
		//implementaion of encapsulation we can access the private data and we can have logic inside the setter method.
		//for eg here i have used for my roll number -->it should be greater than 100 always otherwise value will not be accepted by setter.

		System.out.println(obj.getAddress());
		System.out.println(obj.getMobileNumber());
		System.out.println(obj.getName());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
