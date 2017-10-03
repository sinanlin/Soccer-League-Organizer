import java.util.List;
import java.util.ArrayList;

public class PlayerList{

  private List<Player> mPlayerList;

  public PlayerList(){
    mPlayerList = new ArrayList<Player>();
  }

  public void addPlayer(Player player){
    mPlayerList.add(player);
  }

  public String getPlayerName(){

    for( Player player : mPlayerList){
      return player.getName;
    }

  }



  public int getPlayerCount(){
    return mPlayerList.size();
  }


}
