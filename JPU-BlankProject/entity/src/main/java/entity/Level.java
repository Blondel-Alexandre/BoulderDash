package entity;


/**
 * The Class HelloWorld.
 *
 * @author Groupe 4 A1 - Arras
 */
public class Level extends Entity {

	/** The id. */
	private int	id;

	/** The key. */
	private String key;

	/** The message. */
	private String	message  ;
	
	/** The size of the map. */
	protected int levelSize = 30;

	/** The map. */
	char map[][] = new char[levelSize][levelSize];


	/**
	 * Instantiates a new level.
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
		this.loadLevel();
	}

	/**
	 * Instantiates a new level.
	 */
	public Level() {
		this(0, "", "");
	}
	
	/**
	 * Load the level
	 * 
	 */
	
	public void loadLevel() {
	String mapCharacter = getMessage();
	final String SEPARATEUR = "@";
	String[] mot = mapCharacter.split(SEPARATEUR);
	System.out.println(getMessage());
    for (int y = 0; y < mot.length; y++) {
    	String temp = mot[y];
    	int tempLenght = temp.length();
    	for(int x = 0; x < tempLenght; x++) {
    		char c = temp.charAt(x);
    		map[y][x] = c;    		}
    		}
      }
	
	/**
	 * Gets the map
	 * 
	 * @return the map
	 * 
	 */
	
	public char[][] getLevel(){
		return this.map;
		
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
	 * Gets the size of the map.
	 * 
	 * @return the size of the map
	 */
	
	public int getLevelSize() {
		return this.levelSize;
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
		this.message = message;

	}

}
