package JavaRefresher.cmpe273;

import junit.framework.TestCase;

public class GenericsTest extends TestCase {

	public void testMyGenericBean() {
		MyGenericBean<String, String> myBean1 = new MyGenericBean<String, String>("Apoorv", "Mehta");
		MyGenericBean<Integer, Integer> myBean2 = new MyGenericBean<Integer, Integer>(5, 10);
		assertEquals("Apoorv",myBean1.getObject1());
		assertEquals("Mehta", myBean1.getObject2());
			
	}

}
