/*package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.Level;

public class LevelTest extends Level {

	protected int levelSize = 30;
	char map[][] = new char[levelSize][levelSize];
	private Level level;


	@Before
	public void setUp() throws Exception {
		this.level = new Level();
		
	}

	@After
	public void tearDown() throws Exception {
	}



	@Test
	public void testLevel() {
		assertNotNull(this.level);
	}

	@Test
	public void testLoadLevel() {
		this.level.loadLevel();
		assertNotNull(this.level.getMessage());
		assertNotNull(this.level.getLevel());
	}

	@Test
	public void testGetLevel() {
		assertNotNull(this.map);
	}

	@Test
	public void testGetId() {
		assertNotNull(this.level.getId());
	}

	@Test
	public void testSetId() {
		int id =10;
		int test = 10;
		this.level.setId(id);
		assertEquals(test, this.level.getId());
	}

	@Test
	public void testGetKey() {
		assertNotNull(this.level.getKey());
		
	}

	@Test
	public void testGetLevelSize() {
		assertNotNull(this.level.getLevelSize());
		
	}

	@Test
	public void testSetKey() {
		String key ="a";
		String test = "a";
		this.level.setKey(key);
		assertEquals(test, this.level.getKey());
	}

	@Test
	public void testGetMessage() {
		assertNotNull(this.level.getMessage());
		
	}

	@Test
	public void testSetMessage() {
		String message ="test";
		String test = "test";
		this.level.setMessage(message);
		assertEquals(test, this.level.getMessage());
		
	}

}*/
