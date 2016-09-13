package JavaRefresher.cmpe273;

import junit.framework.TestCase;


public class StackTest extends TestCase {

	private myStackImplementation stack1,stack2;
	
	@Override
	
	protected void setUp() throws Exception {
		super.setUp();
		
		System.out.println("Setting up stack 1 and stack2");
		 stack1 = new myStackImplementation(5);
		 stack2 = new myStackImplementation(3);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Tearing down");
		this.stack1 = null;
		this.stack2 = null;
	}
	
	

}
