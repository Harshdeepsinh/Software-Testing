package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Jatin Tayal,","E20CSE152");
		assertEquals("Jatin Tayal,E20CSE152",res);
	}

}
