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
	
	/**
	* Create a new Controller with view and model in parameter
	*/
	@Before
	public void setUp() throws Exception {
		
		this.controller = new Controller(view,model);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test if controller is not null so test if controller exist
	 */
	@Test
	public void testController() {
		assertNotNull(this.controller);
	}
	
	/**
	* Test if model is Null
	*/
	@Test
	public void getModelTest() {
		assertNull(this.model);
	}
	
	/**
	* Test if view is Null
	*/
	@Test
	public void getViewTest() {
		assertNull(this.view);
	}
	
	/**
	* configure order in order to be equal to ControllerOrder.UP
	* Test if order is equal to ControllerOrder.valueOf("UP")
	*/
	@Test
	public void testOrderPerform() {
		ControllerOrder order = ControllerOrder.UP;
		assertEquals(ControllerOrder.valueOf("UP"), order);
	}

}
