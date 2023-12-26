package gamingroom.com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	//long id;
	//String name;
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}
	
	/*
	 * Creating a list of active teams
	 * */
	private List<Team> teams = new ArrayList<Team>();
	
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}
	
	
	public Team addTeam(String name) {
		/*
		 * Local team instance
		 * */
		Team team = null;

		/*
		 * Instance Iterator
		 * */
		Iterator<Team> iterateTeamList = teams.iterator();

		while (iterateTeamList.hasNext()) {
			
			if(name.compareToIgnoreCase(iterateTeamList.next().getName())==0) {
				//name = "Placeholder name";
				team = new Team(super.getId(), name);
				return team;
			}
			if(team == null) {
				team = new Team(super.getId(), name);
				teams.add(team);
			}
		}
		return team;
	}


	@Override
	public String toString() {
		
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
