package model;
import java.util.*;

public class Team{

  private String nameTeam;
  private Player[] players;
  private AssistentCoach[] assisCoach;
  private MainCoach[] mainCoach;
  private ArrayList<LineUp> lineUps;
  private final static int MAX_PLAYERS = 25;
  private final static int MAX_ASSIS = 3;
  private final static int MAX_COACH = 1;

  public Team(String nameTeam){
    this.nameTeam = nameTeam;
    players = new Player[MAX_PLAYERS];
    assisCoach = new AssistentCoach[MAX_ASSIS];
    mainCoach = new MainCoach[MAX_COACH];
    lineUps = new ArrayList<LineUp>();
  }

  public String getNameTeam(){
    return nameTeam;
  }

  public void setNameTeam(String nameTeam){
    this.nameTeam = nameTeam;
  }
}
