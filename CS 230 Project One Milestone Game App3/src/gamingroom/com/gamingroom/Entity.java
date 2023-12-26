package gamingroom.com.gamingroom;

public class Entity {
	
	/*
	 * Private variables for Entity Class
	 * */
	private long id;
	private String name;
	
	/*
	 * Constructor for Entity Class
	 * */
	protected Entity() {
		
	}
	
	/*
	 * Constructor for Entity class using id and name.
	 * Sets private id and name to current public variables
	 * */
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	 * Returns the id given for Entity
	 * */
	public long getId() {
		return id;
	}
	
	/*
	 * Returns the name given for Entity
	 * */
	public String getName() {
		return name;
	}
	
	/*
	 * Returns id and name in a string.
	 * */
	public String toString() {
		return "Entity [id= " + id + ", name= " + name + "]";
	}

}
