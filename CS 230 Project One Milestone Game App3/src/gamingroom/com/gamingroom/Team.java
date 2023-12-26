package gamingroom.com.gamingroom;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	/*
	 * Creating a list of active players
	 * */
	private List<Player> players = new ArrayList<Player>();

	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}
	
	public Player addPlayer(String name) {
		
		Player player = null;
		
		Iterator<Player> iteratePlayerList = players.iterator();
		
		while(iteratePlayerList.hasNext()) {
			if(name.compareToIgnoreCase(iteratePlayerList.next().getName())==0) {
				name = "Placeholder Name";
				player = new Player(super.getId(), name);
				return player;
			}
		}
		if(player == null) {
			player = new Player(super.getId(), name);
			players.add(player);
		}
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
