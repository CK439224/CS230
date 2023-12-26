package gamingroom.com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		GameService service = GameService.getInstance(); // replace null with ???
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Team team1 = game1.addTeam("Team1");
		System.out.println(team1);
		Team team2 = game1.addTeam("Team2");
		System.out.println(team2);
		Player player1 = team1.addPlayer("Bobby");
		System.out.println(player1);
		Player player2 = team2.addPlayer("Ben");
		System.out.println(player2);
		Game game2 = service.addGame("Game #1");
		System.out.println(game2);
		Team team3 = game2.addTeam("Team3");
		System.out.println(team3);
		Team team4 = game2.addTeam("Team3");
		System.out.println(team4);
		Player player3 = team3.addPlayer("James");
		System.out.println(player3);
		Player player4 = team3.addPlayer("James");
		System.out.println(player4);
		

		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
