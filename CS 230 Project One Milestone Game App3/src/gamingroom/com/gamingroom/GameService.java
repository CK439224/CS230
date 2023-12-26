package gamingroom.com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 * A singleton service for the game engine.
 * The singleton service purpose is to control
 * object creation, limiting the number to one
 * but allowing the flexibility to create more
 * if the situation changes.
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;
	
	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;
	
	private static GameService service = new GameService();
	
	private GameService() {
		
	}

	// FIXME: Add missing pieces to turn this class a singleton 
	
	public static GameService getInstance() {
		return service;
	}


	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		
		/*
		 * The iterator pattern is used to gain access to the games collection
		 * in order to go through one element at a time without knowing what
		 * underlying representation.
		 * */
		Iterator<Game> iterateGameList = games.iterator();
		/*
		 * The while loop iterates through the game collection looking for a
		 * given name, if found, it will return the existing instance of the
		 * game in order to keep names unique.
		 * */
		while (iterateGameList.hasNext()) {
			
			if (name.compareToIgnoreCase(iterateGameList.next().getName()) == 0) {
				name = "Placeholder Name";
				game = new Game(nextGameId, name);
				return game;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		
		/*
		 * The iterator pattern is used to gain access to the games collection
		 * in order to go through one element at a time without knowing what
		 * underlying representation.
		 * */		
		// Looks through the games to see if the id exists
		Iterator<Game> iterateGameList = games.iterator();
		/*
		 * The while loop iterates through the game collection looking for a
		 * existing game, if found, it will return the existing instance of the
		 * game in order to keep id unique.
		 * */
		while (iterateGameList.hasNext()) {
			if (id + 1 == iterateGameList.next().getId()) {
				game = new Game(id + 1, games.get((int) id).getName());
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		/*
		 * The iterator pattern is used to gain access to the games collection
		 * in order to go through one element at a time without knowing what
		 * underlying representation.
		 * */	
		Iterator<Game> iterateGameList = games.iterator();
		/*
		 * The while loop iterates through the game collection looking for a
		 * existing game with the given name, if found, it will return the existing
		 * instance of that game.
		 * */		
		while (iterateGameList.hasNext()) {
			if (name.compareToIgnoreCase(iterateGameList.next().getName()) == 0) {
				game = new Game(iterateGameList.next().getId(), name);
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	/**
	 * Returns the next play id
	 * 
	 * @return the next play id
	 */
	public long getNextPlayerId() {
		return nextPlayerId;
	}
	/**
	 * Returns the next team id
	 * 
	 * @return the next team id
	 */
	public long getNextTeamId() {
		return nextTeamId;
	}
}

