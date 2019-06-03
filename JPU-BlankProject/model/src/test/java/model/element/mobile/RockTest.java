package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;

public class RockTest {
	private Rock rock;
	
	@Before
	public void setUp() throws Exception {
		this.rock = new Rock();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(this.rock.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.rock.getPermeability());
		
		ElementType expected2 =  ElementType.Rock;
		assertEquals(expected2, this.rock.getElementType());

	}
}	
