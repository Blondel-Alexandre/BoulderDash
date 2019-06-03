package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.Level;

/**
*The test Level
*
*@author Group 4 A1 - Arras
*/
public class LevelTest extends Level {
	/**
	 *Create a new map with a size of 30x30
	*/
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


	/**
	 *Test if the level is not null so if it exists
	 */
	@Test
	public void testLevel() {

		assertNotNull(this.level);
	}
	
	/**
	 *Test if there is a message or a level
	 */
	@Test
	public void testLoadLevel() {

		this.level.loadLevel();
		assertNotNull(this.level.getMessage());
		assertNotNull(this.level.getLevel());
	}
	/**
	*Test if the map exists
	*/
	@Test
	public void testGetLevel() {
		assertNotNull(this.map);
	}
	
	/**
	 *Test if the level has an id
	 */
	@Test
	public void testGetId() {
		assertNotNull(this.level.getId());
	}
	
	/**
	 *Test if the set id is equal to the id which is get, so if setId works
	 */
	@Test
	public void testSetId() {
		int id =10;
		int test = 10;
		this.level.setId(id);
		assertEquals(test, this.level.getId());
	}
	
	/**
	 *Test if the key exists
	 */
	@Test
	public void testGetKey() {
	assertNotNull(this.level.getKey());
	}
	
	 /**
	 *Test if the level size exists
	 */
	@Test
	public void testGetLevelSize() {
		assertNotNull(this.level.getLevelSize());
	}
	
	/**
	 *Test if the set key is equal to the key which is get, so if setKey works
	 */
	@Test
	public void testSetKey() {
		String key ="a";
		String test = "a";
		this.level.setKey(key);
		assertEquals(test, this.level.getKey());
	}
	
	/**
	*Test if the message exists
	*/
	@Test
	public void testGetMessage() {
		assertNotNull(this.level.getMessage());
	}
	
	/**
	 *Test if the set message is equal to the message which is get, so if setMessage works
	 */
	@Test
	public void testSetMessage() {

		String message ="test";
		String test = "test";
		this.level.setMessage(message);
		assertEquals(test, this.level.getMessage());	
	}

}
