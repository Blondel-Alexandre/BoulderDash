package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
*The Test DBProperties
*
*@author Groupe 4 A1 - Arras
*/

public class DBPropertiesTest  {
/**
*Instantiates new DB Properties
*/
	private DBProperties dbProperties = null;


	@Before
	public void setUp() throws Exception {
		this.dbProperties = new DBProperties();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDBProperties() {
/**
*Test if the class which is get is the same than the previous one
*/
		assertEquals(DBProperties.class, this.dbProperties.getClass());
	}

	@Test
	public void testGetUrl() {
/**
*Test if the URL which is get is the same than the URL
*/
		String URL = "jdbc:mysql://localhost/jpublankproject?autoReconnect=true&useSSL=false";
        assertEquals(URL, this.dbProperties.getUrl());
	}

	@Test
	public void testGetLogin() {
/**
*Test if the login which is get is the same than the LOGIN (root)
*/
		String LOGIN = "root";
        assertEquals(LOGIN, this.dbProperties.getLogin());
	}

	@Test
	public void testGetPassword() {
/**
*Test if the password which is get is the same than PASS
*/
		String PASS = "";
		assertEquals(PASS, this.dbProperties.getPassword());
	}

}
