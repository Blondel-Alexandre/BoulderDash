package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Test DBConnectionTest.
 * @author Groupe 4 A1 - Arras
 */

public class DBConnectionTest  {


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		/**
		 * Close the connection with the database
		 */
		DBConnection.getInstance().getConnection().close();
    }
	

	@Test
	public void testGetInstance() {
		/**
		 * Test if the instance of the database exists
		 */
		 assertNotNull(DBConnection.getInstance());
	}

	@Test
	public void testGetConnection(){
		/**
		 * Test if the connection of the database exists
		 */
		assertNotNull(DBConnection.getInstance().getConnection());
	}

}
