package contract;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementTypeTest {

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
		 * configure elementtype in order to be equal to ElementType.BrokenDirt 
		 * Test if elementtype is equal to ElementType.valueOf("BrokenDirt")
		 */
		ElementType elementtype = ElementType.BrokenDirt;
		assertEquals(ElementType.valueOf("BrokenDirt"), elementtype);
	}

}
