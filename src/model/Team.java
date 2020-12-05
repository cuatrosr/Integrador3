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

  /**
  * Create a team.
  * <b> pre: </b> <br>
  * <b> post: </b> Create a team.
  * @param nameTeam nameTeam != null.
  */
  public Team(String nameTeam){
    this.nameTeam = nameTeam;
    players = new Player[MAX_PLAYERS];
    assisCoach = new AssistentCoach[MAX_ASSIS];
    mainCoach = new MainCoach[MAX_COACH];
    lineUps = new ArrayList<LineUp>();
  }

  /**
  * Return the name of the team.
  * <b> pre: </b> <br>
  * <b> post: </b> return name of the team.
  * @return nameTeam
  */
  public String getNameTeam(){
    return nameTeam;
  }

  /**
  * Set the name of team.
  * <b> pre: </b> <br>
  * <b> post: </b> set the name of team.
  * @param nameTeam nameTeam != null
  */
  public void setNameTeam(String nameTeam){
    this.nameTeam = nameTeam;
  }

  /**
  * Return the array of players in team.
  * <b> pre: </b> <br>
  * <b> post: </b> return the array of players in team.
  * @return players
  */
  public Player[] getPlayers(){
    return players;
  }

  /**
  * Set the array of players in team.
  * <b> pre: </b> <br>
  * <b> post: </b> set the players in team.
  * @param players players != null
  */
  public void setPlayers(Player[] players){
    this.players = players;
  }

  /**
  * Return the array of assistent coachs in team.
  * <b> pre: </b> <br>
  * <b> post: </b> return the array of assistent coachs in team.
  * @return assisCoach
  */
  public AssistentCoach[] getAssisCoach(){
    return assisCoach;
  }

  /**
  * Set the assistent coach in team.
  * <b> pre: </b> <br>
  * <b> post: </b> set the assistent coach in team.
  * @param assisCoach assisCoach != null
  */
  public void setAssistentCoach(AssistentCoach[] assisCoach){
    this.assisCoach = assisCoach;
  }

  /**
  * Return the array of main coachs in team.
  * <b> pre: </b> <br>
  * <b> post: </b> return the array of main coachs in team.
  * @return mainCoach
  */
  public MainCoach[] getMainCoach(){
    return mainCoach;
  }

  /**
  * Set the main coach in team.
  * <b> pre: </b> <br>
  * <b> post: </b> set the main coach in team.
  * @param mainCoach mainCoach != null
  */
  public void setMainCoach(MainCoach[] mainCoach){
    this.mainCoach = mainCoach;
  }

  /**
  * Return the arraylist of line ups in team.
  * <b> pre: </b> <br>
  * <b> post: </b> return the arraylist of line ups in team.
  * @return lineUps
  */
  public ArrayList<LineUp> getLineUps(){
    return lineUps;
  }

  /**
  * Set the line ups in team.
  * <b> pre: </b> <br>
  * <b> post: </b> set the line ups in team.
  * @param lineUps
  */
  public void setLineUps(ArrayList<LineUp> lineUps){
    this.lineUps = lineUps;
  }

  /**
  * Print the info of the employee in a team.
  * <b> pre: </b> employee != null <br>
  * <b> post: </b> print the info of all employees in team.
  */
  public String showTeamInfo(){
    String msg = "\nNombre: " + getNameTeam();
    return msg;
  }
}
