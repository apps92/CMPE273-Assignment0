package JavaRefresher.cmpe273;

import junit.framework.TestCase;

public class QueueTest extends TestCase {

	public void testEnqueue() {
		myQueueImplementation testQueue = new myQueueImplementation();
		
		
		assertEquals("Thank you. You will be called when your turn comes up!", testQueue.enqueue("Apoorv"));
		
	}
	
	
	
	

	
	

}
