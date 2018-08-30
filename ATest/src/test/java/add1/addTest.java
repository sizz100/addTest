package add1;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		adder adder = new adder();
		int result = adder.addtion(5, 7);
		assertEquals(12, result);
	}
}
