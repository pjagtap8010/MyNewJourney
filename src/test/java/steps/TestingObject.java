package steps;

public class TestingObject {
	
	
	String city;
	String country;
	
	public static void main(String[] args) {
		
		TestingObject t1 = new TestingObject();
		
		t1.city = "New Delhi";
		t1.country= "India";
		
		TestingObject t2 = new TestingObject();
		
		System.out.println(t1.city);//new delhi
		
	}

}
