import java.util.List;

public class TeamCreator{

  private String mteam_name;
  private String mcoach;
  private PlayerList mPlayerList;

  public TeamCreator(String team_name, String coach, PlayerList playerlist) {
    mteam_name = team_name;
    mcoach = coach;
    mPlayerList = playerlist;
  }



  public String getTeamName(){
    return mteam_name;
  }

  public String getCoach(){
    return mcoach;
  }

  public PlayerList getPlayerList(){
    return mPlayerList;
  }


}
