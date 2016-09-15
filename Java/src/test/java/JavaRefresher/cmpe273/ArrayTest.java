package JavaRefresher.cmpe273;

import junit.framework.TestCase;

public class ArrayTest extends TestCase {

	public void testDoSort() {

		String unsorted [] = {"Xyz","Def","Pqr","Abc"};
		String sorted[] = new String [10];
		MyArrayImplementation testArray = new MyArrayImplementation();
		sorted = MyArrayImplementation.doSort(unsorted);
		
		assertEquals("Abc", sorted[0]);
		assertEquals("Xyz", sorted[3]);
		

		
	}

}
