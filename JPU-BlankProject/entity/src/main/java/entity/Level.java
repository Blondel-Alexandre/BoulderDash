package entity;

import java.awt.Graphics;

/**
 * The Class HelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
public class Level extends Entity {

	/** The id. */
	private int			id;

	/** The key. */
	private String	key;

	/** The message. */
	private String	message  ;

	/**
	 * Instantiates a new hello world.
	 *
	 * @param id
	 *          the id
	 * @param key
	 *          the key
	 * @param message
	 *          the message
	 */
	public Level(final int id, final String key, final String message) {
		this.setId(id);
		this.setKey(key);
		this.setMessage(message);
	}

	/**
	 * Instantiates a new hello world.
	 */
	public Level() {
		this(0, "", "");
	}
	
	public void loadLevel() {

	String mapCharacter = "";
	final String SEPARATEUR = "@";
	String mot[] = mapCharacter.split(SEPARATEUR);
	final int tile = 16;
	char map[][] = new char[tile][tile];
    for (int y = 0; y < mot.length; y++) {
    	String temp = mot[y];
    	int tempLenght = temp.length();
    	for(int x = 0; x < tempLenght; x++) {
    		char c = temp.charAt(x);
    		map[x][y] = c;
    		System.out.println(c + " x : " + x  + " y : " + y );
    		
    		}
      }

}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */
	public void setKey(final String key) {
		this.key = key;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	
	public void setMessage(final String message) {
		/*
		final String SEPARATEUR = "@";
		String mot[] = message.split(SEPARATEUR);

        for (int i = 0; i < mot.length; i++) {
            System.out.println(mot[i] + );
        }*/
		this.message = message;

	}

}
