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

/** 
*Test the initialization
*/
	
	@Before
	public void setUp() throws Exception {
		this.level = new Level();
		
	}

	@After
	public void tearDown() throws Exception {
	}



	@Test
	public void testLevel() {
/**
*Test if the level is not null so if it exists
*/
		assertNotNull(this.level);
	}

	@Test
	public void testLoadLevel() {
/**
*Test if there is a message or a level
*/
		this.level.loadLevel();
		assertNotNull(this.level.getMessage());
		assertNotNull(this.level.getLevel());
	}

	@Test
	public void testGetLevel() {
/**
*Test if the map exists
*/
		assertNotNull(this.map);
	}

	@Test
	public void testGetId() {
/**
*Test if the level has an id
*/
		assertNotNull(this.level.getId());
	}

	@Test
	public void testSetId() {
/**
*Test if the set id is equal to the id which is get, so if setId works
*/
		int id =10;
		int test = 10;
		this.level.setId(id);
		assertEquals(test, this.level.getId());
	}

	@Test
	public void testGetKey() {
/**
*Test if the key exists
*/
		assertNotNull(this.level.getKey());
		
	}

	@Test
	public void testGetLevelSize() {
/**
*Test if the level size exists
*/
		assertNotNull(this.level.getLevelSize());
		
	}

	@Test
	public void testSetKey() {
/**
*Test if the set key is equal to the key which is get, so if setKey works
*/
		String key ="a";
		String test = "a";
		this.level.setKey(key);
		assertEquals(test, this.level.getKey());
	}

	@Test
	public void testGetMessage() {
/**
*Test if the message exists
*/
		assertNotNull(this.level.getMessage());
		
	}

	@Test
	public void testSetMessage() {
/**
*Test if the set message is equal to the message which is get, so if setMessage works
*/
		String message ="test";
		String test = "test";
		this.level.setMessage(message);
		assertEquals(test, this.level.getMessage());
		
	}

}
