package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoulderDashModelTest extends BoulderDashModel {
	private BoulderDashModel model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.model = new BoulderDashModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBoulderDashModel() {
		
	}

	@Test
	public void testGetHelloWorld() {
		
	}

	@Test
	public void testLoadHelloWorld() {
		this.model.loadHelloWorld("GB");
		assertEquals("wwwwwwwwwwwwwwwwwwwwwwwwwwwww@wbdddddrdrdrirrrrrrdddddddriw@wrdddrcdddddrdddddddddddddrrw@widdddrrrddddddrddddrdddrdedw@wrdddrdddddbbbddddddddddddddw@wddddddddddbebdrdrdrdddrrdddw@wrddrddddddbbbddddrdrdrddddrw@wdrrdrrrddrrdddddrdddrddddddw@wirddddrrddddddrdddddddrddddw@wddddddddrddrdddddddddddrdddw@wedrrdddddddddddddddddddiwwww@wbwwwwwwwwwwwdddwwwwwwwwwwwww@wbwrdddddddrrrirddddddddddddw@wbwidddddddddddddddrddirrrddw@wwwwwwwwwwwdrddddddidddddddww@wirrrrdddddddddddddrdddddwwww@wddddddddddddddddddddddddwirw@wwwwwwwwwwwwddddddrdrdddddddw@wrdddddddrdwddrrddddddddddddw@wddwwwwwwddwddddddddddddrrrrw@wddwrrrrwddwddwdwwwwwwwddddiw@wrdwddddwdrwddwbbbbbbewwwwwdw@wddwdwddwddwddwbbbbbbiwdddddw@wdrwdwiiwddwddwbbbbbbbwdddddw@wddwdwwwwddwddwwwwwwwwwdddddw@wddwdrdrdddwddddddddddwwwwwww@wddwdddddddwrrrrrrrrrdwebpbrw@wdddwwwwwwwwddddddddddwbbbddw@wddddddddddddbbbbbbbbddbbbbiw@wwwwwwwwwwwwwwwwwwwwwwwwwwwww", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("FR");
		assertEquals("Bonjour le monde", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("DE");
		assertEquals("Hallo Welt", this.model.getHelloWorld().getMessage());
		this.model.loadHelloWorld("ID");
		assertEquals("Salamat pagi dunia", this.model.getHelloWorld().getMessage());
	}

	@Test
	public void testGetSprites() {
		
	}

	@Test
	public void testElementList() {
		
	}

	@Test
	public void testGetDwarf() {
		
	}

	@Test
	public void testGetElement() {
		
	}

	@Test
	public void testGetObservable() {
		assertNotNull(this);
	}

}
