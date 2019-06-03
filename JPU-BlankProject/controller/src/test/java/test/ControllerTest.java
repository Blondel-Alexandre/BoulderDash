package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IModel;
import contract.IView;
import controller.Controller;

public class ControllerTest  {

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
		
		ControllerOrder order = ControllerOrder.UP;
		assertEquals(ControllerOrder.valueOf("UP"), order);
	}

}
