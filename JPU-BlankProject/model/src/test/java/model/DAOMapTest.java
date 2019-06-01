package model;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DAOMapTest extends DAOHelloWorld {

	public DAOMapTest(Connection connection) throws SQLException {
		super(connection);
	}

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDAOHelloWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateLevel() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteLevel() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateLevel() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindString() {
		fail("Not yet implemented");
	}

}
