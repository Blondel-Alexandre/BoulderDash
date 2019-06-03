package contract;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * The Class Model.
 *
 * @author Groupe 4 A1 - Arras
 */
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
	/**
		 * configure order in order to be equal to ControllerOrder.UP
		 * Test if order is equal to ControllerOrder.valueOf("UP")
		 */
	@Test
	public void test() {
		ControllerOrder order = ControllerOrder.UP;
		assertEquals(ControllerOrder.valueOf("UP"), order);
	}

}
