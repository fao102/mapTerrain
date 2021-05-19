import java.util.*;

public class RamblersSearch extends Search {

  private Carta map; //map we're searching
  private String goal; //goal city

  public Carta getMap(){
    return map;
  }
  public String getGoal(){
    return goal;
  }

  public RamblersSearch(Carta m, String g){
    map=m;
    goal=g;
  }
}








