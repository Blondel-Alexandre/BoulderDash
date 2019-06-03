package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import contract.IElement;

public class BoulderDashModelTest  {
//	private DwarfMiner dwarf;
//	private BrokenDirt brokenDirt;
	private BoulderDashModel model;
	IElement elements;
	ArrayList<IElement> list;
	int x = 3;
	int y = 2;
	

	@Before
	public void setUp() throws Exception {
		this.model = new BoulderDashModel();
	//	DwarfMiner dwarf = new DwarfMiner();
		this.elements=model.getElement();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetHelloWorld() {
		assertNotNull(this.model.helloWorld);
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
		assertNotNull(this.model.sprites);
	}

	@Test
	public void testElementList() {
		assertNotNull(this.model.sprites);
	}

	@Test
	public void testGetDwarf() {
		assertNotNull(this.model.dwarfs);
	}

	@Test
	public void testGetElement() {
		assertNotNull(this.model.elements);
		
	}

	@Test
	public void testGetObservable() {
		assertNotNull(this);
	}
	
	
}
