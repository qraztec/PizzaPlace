import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests {

	@Test
	void testReceipt() {
		Receipt r = new Receipt(null, 0, null, null, null, 0.05, null);
		assertEquals(2.5, r.calculateSubTotal(50));
		assertEquals(1.74, r.calculateSubTotal(34.7));
		assertEquals(1.80, r.calculateSubTotal(35.99));
		
	}

}
