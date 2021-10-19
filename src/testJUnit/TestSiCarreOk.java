package testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSiCarreOk {

	@Test
	void test() {
		CalculCarre monTest = new CalculCarre();
		int res = monTest.carreDe(8);
		assertEquals(64,res);
	}

}
