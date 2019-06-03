package contract;

/**
 * The Interface IController.
 *
 */

public interface IDwarfMiner {
	void moveUpPlayer();
	
	/**
	 * Move Up the player.
	 */
	void moveLeftPlayer();
	
	/**
	 * Move Left the player.
	 */
	void moveDownPlayer();
	
	/**
	 * Move Down the player.
	 */
	void moveRightPlayer();
	
	/**
	 * Move Right the player.
	 */
	void doNothing();
	
	/**
	 * Not move the player.
	 */
}
