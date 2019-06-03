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
	private IView view ;
	private IModel model;

	@Before
	public void setUp() throws Exception {
		/**
		 * Create a new Controller with view and model in parameter
		 */
		this.controller = new Controller(view,model);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testController() {
		/**
		 * Test if controller is not null so test if controller exist
		 */
		assertNotNull(this.controller);
	}
	
	@Test
	public void getModelTest() {
		/**
		 * Test if model is Null
		 */
		assertNull(this.model);
	}
	@Test
	public void getViewTest() {
		/**
		 * Test if view is Null
		 */
		assertNull(this.view);
	}


	@Test
	public void testOrderPerform() {
		/**
		 * configure order in order to be equal to ControllerOrder.UP
		 * Test if order is equal to ControllerOrder.valueOf("UP")
		 */
		ControllerOrder order = ControllerOrder.UP;
		assertEquals(ControllerOrder.valueOf("UP"), order);
	}

}
