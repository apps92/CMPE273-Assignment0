package JavaRefresher.cmpe273;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class MyCollectionsImplementation {
	private PlayerBean myPlayer;
	private HashSet<PlayerBean> mySquad = new HashSet<PlayerBean>();
	private HashMap<String, PlayerBean> finalTeam= new HashMap<String, PlayerBean>();
	Scanner sc = new Scanner(System.in);
	private int choice;
	private String finalchoice;
    
	public MyCollectionsImplementation(String [] names, String [] positions){
		for(int j=0;j<5;j++)
		{
			//System.out.println("Received"+names[j]+positions[j]);
		}
	for(int i=0;i<5;i++)
	{
		myPlayer = new PlayerBean();
		myPlayer.setAttackXp(i);
		myPlayer.setDefenseXp(5-i);
		myPlayer.setMidfieldXp((1));
		myPlayer.setPlayerName(names[i]);
		myPlayer.setPositions(positions[i]);
		mySquad.add(myPlayer);
		//System.out.println("Added :"+i+myPlayer.getPlayerName());
			}
	
	do{
		
		System.out.println("Welcome to SJ Sharks Team Management");
		System.out.println("Choose and option to manage the team: ");
		System.out.println("1. View Entire Squad");
		System.out.println("2. Pick the starting 3 players");
		System.out.println("3. Check the Team by entering Position");
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			showSquad();
			break;
			
		case 2:
			pickTeam();
			break;
			
		case 3:
			showPlayerStatus();
			
			break;
		default:
			
		}
		System.out.println("Try Again?");
		finalchoice=sc.nextLine();
	}
	while (finalchoice.equalsIgnoreCase("yes"));
	
	}

	private void showSquad() {
		PlayerBean selectedPlayer = new PlayerBean();
		Iterator<PlayerBean> SquadDisplay = mySquad.iterator();
		while(SquadDisplay.hasNext())
		{
			selectedPlayer = SquadDisplay.next();
			System.out.println(selectedPlayer.getPlayerName() + " "+ selectedPlayer.getPositions() +selectedPlayer.getAttackXp()+"-"+selectedPlayer.getMidfieldXp()+" "+selectedPlayer.getDefenseXp());
		}
	}
		private void pickTeam()
		{
		
		
			//Iterator<PlayerBean> Team = mySquad.iterator();
			String fname= new String();
			
			System.out.println("Pick the 3 players for first team");
		
			
			
			for(int k=0;k<3;k++)
			{
			System.out.println("Enter Player Name:");
			fname=sc.nextLine();
			
			for(PlayerBean playerToBeAdded : mySquad)
			{
				if(playerToBeAdded.getPlayerName().equalsIgnoreCase(fname));
				{
					finalTeam.put(playerToBeAdded.getPositions(), playerToBeAdded);
				//System.out.println(fname+ " Added!");
				}				
			}
			
			
			}
			
			
			
	}
		public void showPlayerStatus()
		{
			System.out.println("Enter the first team position to check");
		String queryPlayer = new String(); 			
			queryPlayer = sc.nextLine();
		System.out.println(finalTeam.get(queryPlayer).getPlayerName()+finalTeam.get(queryPlayer).getPositions());
			
			
		}
	
	
	
}
