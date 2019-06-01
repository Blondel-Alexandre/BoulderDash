package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LevelTest {
	
	protected int levelSize = 30;

	
	char map[][] = new char[levelSize][levelSize];
	
	

	
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
		int expectedSize = 30;
		char expectedMap[][] = new char[expectedSize][expectedSize];
		assertEquals(levelSize,expectedSize);
		assertSame(map,expectedMap);
		
	}
}
