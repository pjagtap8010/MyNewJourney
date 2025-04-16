package steps;

import java.util.HashMap;

import org.testng.annotations.Test;

public class A {
	
	@Test
	public void m1()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("India", "New Delhi");
		hm.put("USA", "Washington");
		hm.put("Germany", "Berlin");
		
		String capital = hm.get("USA");
		
		System.out.println(capital);
		
	}

}
