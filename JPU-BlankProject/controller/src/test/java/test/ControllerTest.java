package test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IModel;
import contract.IView;
import controller.Controller;

public class ControlleurTest  {

	private Controller controller;
	private IView view;
	private IModel model;

	@Before
	public void setUp() throws Exception {
		this.controller = new Controller(view,model);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testController() {
		assertNotNull(this.controller);
	}
	
	@Test
	public void getModel() {
		assertNull(this.model);
	}
	@Test
	public void getView() {
		assertNull(this.view);
	}


	@Test
	public void testOrderPerform() {
		
		
		
		
		
	}

}
