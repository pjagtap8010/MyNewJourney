package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	@Before(value ="@sanity", order = 1)
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
	@Before(order = 2)
	public void beforeHook2()
	{
		System.out.println("Before hook2 is executing");
	}
	
	@After("@functional")
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}
	
	@BeforeStep("@regression")
	public void beforeStepHook()
	{
		System.out.println("Before Step is executing");
	}
	
	
	
//	@Before(order = 1)
//	public void beforeHook1()
//	{
//		System.out.println("Before hook 1 is executing");
//	}
//	
//	@After(order = 1)
//	public void afterHook1()
//	{
//		System.out.println("After hook 1 is executing");
//	}
//
//	
////	@Before
////	public void beforeHook2()
////	{
////		System.out.println("Before hook 2 is executing");
////	}
////	
////	@After(order = 0)
////	public void afterHook2()
////	{
////		System.out.println("After hook 2 is executing");
////	}
//	
//	
//	@BeforeStep
//	public void beforeStep()
//	{
//		System.out.println("Before step is executing");
//	}
//	
//	@AfterStep
//	public void afterStep()
//	{
//		System.out.println("After step is executing");
//	}
//	
//	
//	@BeforeAll(order = 1)
//	public static void beforeAll()
//	{
//		System.out.println("Before all1 is executing");
//	}
//	
//	@AfterAll(order = 1)
//	public static void aferAll()
//	{
//		System.out.println("After all1 is executing");
//	}
//	
//
//	@BeforeAll(order = 2)
//	public static void beforeAll2()
//	{
//		System.out.println("Before all2 is executing");
//	}
//	
//	@AfterAll(order = 2)
//	public static void aferAll2()
//	{
//		System.out.println("After all2 is executing");
//	}

}
