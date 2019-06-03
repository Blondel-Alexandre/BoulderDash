package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ElementType;
import contract.Permeability;

/**
*The test Enemy
*
*@author Group 4 A1 - Arras
*/


/**
*Create the Enemy
*/
public class EnemyTest extends Enemy {
	private Enemy enemy;

/**
*Create an enemy with position equal to (1;1)
*/
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
		
		//Test if the y coordonate of the enemy become 0 if the enemy move up
		this.enemy.moveUp();
		int expected = 0;
		assertEquals(expected,this.enemy.getY());
		
		//Test if the y coordonate of the enemy become 1 if the enemy move down after he moved up
		this.enemy.moveDown();
		int expected2 = 1;
		assertEquals(expected2,this.enemy.getY());
		
		//Test if the x coordonate of the enemy become 2 if the enemy move right
		this.enemy.moveRight();
		int expected3 = 2;
		assertEquals(expected3,this.enemy.getX());
		
		//Test if the x coordonate of the enemy become 1 if the enemy move left after he moved right
		this.enemy.moveLeft();
		int expected4 = 1;
		assertEquals(expected4,this.enemy.getX());
		
	}

	
/**
*Test if the sprite of enemy exists
*Test if the permeability of enemy is BLOCKING
*Test if the enemy is an Enemy
*/
	@Test
	public void testEnemy() {
		assertNotNull(this.enemy.getSprite());
		
		Permeability expected1 = Permeability.BLOCKING;
		assertEquals(expected1, this.enemy.getPermeability());
		
		ElementType expected2 =  ElementType.Enemy;
		assertEquals(expected2, this.enemy.getElementType());
	}

}
