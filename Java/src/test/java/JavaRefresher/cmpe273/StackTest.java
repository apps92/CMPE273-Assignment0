package JavaRefresher.cmpe273;

import junit.framework.TestCase;

public class StackTest extends TestCase {

	public void testPush() {
		myStackImplementation m= new myStackImplementation(3);
		
		assertEquals("Another Card added to your collection!", m.Push("Pickachu"));
		
	}

	public void testPop() {
		myStackImplementation n= new myStackImplementation(3);
		n.Push("Student1");
		n.Push("Student2");
		assertNotNull(n.pop());//Should Pop 2nd Student
		assertNotNull(n.pop()); //Should Pop 1st Student
				
	}


}
