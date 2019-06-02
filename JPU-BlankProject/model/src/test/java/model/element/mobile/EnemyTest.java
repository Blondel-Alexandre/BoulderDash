package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;

public class EnemyTest extends Enemy {
	private Enemy enemy;


	@Before
	public void setUp() throws Exception {
		this.enemy = new Enemy();
		this.enemy.setX(1);
		this.enemy.setY(1);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testMove() {
		
		//test moveUp
		this.enemy.moveUp();
		int expected = 0;
		assertEquals(expected,this.enemy.getY());
		
		//testMoveDown
		this.enemy.moveDown();
		int expected2 = 1;
		assertEquals(expected2,this.enemy.getY());
		
		//testMoveRight
		this.enemy.moveRight();
		int expected3 = 2;
		assertEquals(expected3,this.enemy.getX());
		
		//testMoveLeft
		this.enemy.moveLeft();
		int expected4 = 1;
		assertEquals(expected4,this.enemy.getX());
		
	}

	@Test
	public void testEnemy() {
		assertNotNull(this.enemy.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.enemy.getPermeability());
		
		ElementType expected2 =  ElementType.Enemy;
		assertEquals(expected2, this.enemy.getElementType());
	}

}
