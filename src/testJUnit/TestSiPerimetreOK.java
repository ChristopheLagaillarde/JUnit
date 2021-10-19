package testJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestSiPerimetreOK {

	@Test
	void test() {
		CalculCarre monTest = new CalculCarre();
		monTest.perimetreCarre(4,4);
		System.out.println(monTest.perimetre);
		assertEquals(17,monTest.perimetre);
	}

}
