package contract;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerOrderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/**
		 * configure order in order to be equal to ControllerOrder.UP
		 * Test if order is equal to ControllerOrder.valueOf("UP")
		 */
		ControllerOrder order = ControllerOrder.UP;
		assertEquals(ControllerOrder.valueOf("UP"), order);
	}

}
