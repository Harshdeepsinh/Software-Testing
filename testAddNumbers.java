package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		int res=junit.addnumbers(100,100);
		assertEquals(200,res);
		
	}

}
