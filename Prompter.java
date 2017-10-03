import java.util.Scanner;

public class Prompter{

private TeamCreator team;
private Player player;
Scanner scanner = new Scanner(System.in);

  public void Play(){


//Create a team;

    System.out.printf("What is your team's name:\n");
    String team_name = scannString();

    System.out.printf("What is coach's name:\n");
    String coach = scannString();

//Add one player;

    System.out.printf("Enter Player's name:\n");
    String playerName = scannString();

    System.out.printf("Enter Player's height:\n");
    String playerHeight = scannString();

    System.out.printf("Enter Player's experience:\n");
    String playerExperience = scannString();

    player = new Player(playerName,playerHeight,playerExperience);

    System.out.printf("The player stats is: %s\n ", player.getPlayerStats());




//Add the player into team list;

    PlayerList playerlist = new PlayerList();

    playerlist.addPlayer(player);
    playerlist.getPlayerName();



//Display the team name, coach, player;

    team = new TeamCreator(team_name,coach,playerlist);

    System.out.printf("Your team name is %s: \n ",team.getTeamName());

    System.out.printf("Your coach name is %s: \n ",team.getCoach());

    System.out.printf("Team member including %s: \n ",team.getPlayerList());


  }
  public String scannString(){
    String item = scanner.nextLine();
    return item;
  }


}
