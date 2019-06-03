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



/**
*Instantiates new DB Properties
*/
public class DBPropertiesTest  {
	private DBProperties dbProperties = null;


	@Before
	public void setUp() throws Exception {
		this.dbProperties = new DBProperties();
	}

	@After
	public void tearDown() throws Exception {
	}

/**
*Test if the class which is get is the same than the previous one
*/
	@Test
	public void testDBProperties() {
		assertEquals(DBProperties.class, this.dbProperties.getClass());
	}

/**
*Test if the URL which is get is the same than the URL
*/
	@Test
	public void testGetUrl() {
		String URL = "jdbc:mysql://localhost/jpublankproject?autoReconnect=true&useSSL=false";
        assertEquals(URL, this.dbProperties.getUrl());
	}

/**
*Test if the login which is get is the same than the LOGIN (root)
*/
	@Test
	public void testGetLogin() {
		String LOGIN = "root";
        assertEquals(LOGIN, this.dbProperties.getLogin());
	}

/**
*Test if the password which is get is the same than PASS
*/
	@Test
	public void testGetPassword() {
		String PASS = "";
		assertEquals(PASS, this.dbProperties.getPassword());
	}

}
