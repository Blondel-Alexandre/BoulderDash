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
	
	/**
	* Close the connection with the database
	*/
	@After
	public void tearDown() throws Exception {
		DBConnection.getInstance().getConnection().close();
    }
	
	/**
	* Test if the instance of the database exists
	*/
	@Test
	public void testGetInstance() {
		 assertNotNull(DBConnection.getInstance());
	}
	/**
	* Test if the connection of the database exists
	*/
	@Test
	public void testGetConnection(){
		assertNotNull(DBConnection.getInstance().getConnection());
	}

}
