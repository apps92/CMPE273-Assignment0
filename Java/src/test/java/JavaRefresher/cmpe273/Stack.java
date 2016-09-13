package JavaRefresher.cmpe273;

import junit.framework.TestCase;

public class Stack extends TestCase {

	public void testPush() {
		myStackImplementation m= new myStackImplementation(3);
		
		assertEquals("Another Card added to your collection!", m.Push("vansh"));
		
	}

	public void testPop() {
		fail("Not yet implemented");
	}

	public void testPeek() {
		fail("Not yet implemented");
	}

	public void testShow() {
		fail("Not yet implemented");
	}

}
