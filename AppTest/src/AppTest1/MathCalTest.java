package AppTest1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathCalTest {

	@Test
	void test() {
		assertEquals(8,new MathCal().add(3, 5));
	}
	void test1() {
		assertEquals(9,new MathCal().sub(3, 5));
	}

}
