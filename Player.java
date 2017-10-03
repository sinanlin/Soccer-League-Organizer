
public class Player{

  private String mname;
  private String mheight;
  private String mexperience;


  public Player(String name, String height, String experience){
    mname = name;
    mheight = height;
    mexperience = experience;
  }

  public String getName(){
    return mname;
  }

  public String getHight(){
    return mheight;
  }

  public String getExperience(){
    return mexperience;
  }

  public String getPlayerStats(){
    return "Player Name:" + mname + " Height:"+ mheight + " Experience:"+ mexperience + "\n";
  }

}
