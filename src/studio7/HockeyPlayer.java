package studio7;

public class HockeyPlayer {
	//A hockey player has a name and a jersey number. 
	//Most players shoot either right or left, but some can shoot either way. 
	//A player can be right- or left-handed, but shoot either right or left. 
	//This object should be able to react when a player completes a game, 
	//recording how many goals and assists the player earned in that game. 
	//A player has a certain number of goals and assists he or she has recorded 
	//over all games played. Also, a player has a certain number of points, which 
	//is the sum of the goals and assists a player has earned. A player has a 
	//certain number of games he or she has played.
	
	private String name;
	private int number;
	private String shoot;
	private int goals;
	private int assist;
	private int numGames;
	
	public HockeyPlayer(String isName, int isNumber, String isShoot, int isGoals, int isAssist, int isNumGames) 
	{
		name = isName;
		number = isNumber;
		shoot = isShoot;
		goals = isGoals;
		assist = isAssist;
		numGames = isNumGames;
	}
	
	public String game(boolean s) 
	{
		if(s==true) {
			return "Win!";	
		}
		else {
			return "Loser:(";
		}
	}
	public int points()
	{
		return assist+goals;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
