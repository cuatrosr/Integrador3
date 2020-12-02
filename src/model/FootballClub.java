package model;
import java.util.*;

public class FootballClub{

  private String nameFC;
  private int nitFC;
  private String fundationDateFC;
  private Team[] teams;
  private final static int MAX_TEAMS = 2;
  private Player[][] dressingRoomA;
  private final static int DRESSING_A_F = 7;
  private final static int DRESSING_A_C = 6;
  private Player[][] dressingRoomB;
  private final static int DRESSING_B_F = 7;
  private final static int DRESSING_B_C = 7;
  private ArrayList<Employee> employees;
  private Coach[][] sectorOffice;
  private final static int OFFICE_F = 6;
  private final static int OFFICE_C = 6;
  private Position[] allPosition = Position.values();
  private Expertice[] allExpertice = Expertice.values();

  public FootballClub(String nameFC, int nitFC, String fundationDateFC){
    this.nameFC = nameFC;
    this.nitFC = nitFC;
    this.fundationDateFC = fundationDateFC;
    teams = new Team[MAX_TEAMS];
    String nameTeam = "Team A";
    teams[0] = new Team(nameTeam);
    nameTeam = "Team B";
    teams[1] = new Team(nameTeam);
    dressingRoomA = new Player[DRESSING_A_F][DRESSING_A_C];
    dressingRoomB = new Player[DRESSING_B_F][DRESSING_B_C];
    employees = new ArrayList<Employee>();
    sectorOffice = new Coach[OFFICE_F][OFFICE_C];
  }

  public String getNameFC(){
    return nameFC;
  }

  public void setNameFC(String nameFC){
    this.nameFC = nameFC;
  }

  public int getNitFC(){
    return nitFC;
  }

  public void setNitFC(int nitFC){
    this.nitFC = nitFC;
  }

  public String getFundationDateFC(){
    return fundationDateFC;
  }

  public void setFundationDateFC(String fundationDateFC){
    this.fundationDateFC = fundationDateFC;
  }

  public void addPlayerDressingA(Player player){
    boolean added = false;
    for (int i = 0; i < dressingRoomA.length && added == false; i++) {
      for (int j = 0; j < dressingRoomA[i].length && added == false; j++) {
        if (j % 2 != 0 && dressingRoomA[i][j] == null) {
          dressingRoomA[i][j] = player;
          added = true;
        }
      }
    }
  }

  public void addPlayerDressingB(Player player){
    boolean added = false;
    for (int i = 0; i < dressingRoomB.length && added == false; i++) {
      for (int j = 0; j < dressingRoomB[i].length && added == false; j++) {
        if (j % 2 != 0 && dressingRoomB[i][j] == null) {
          dressingRoomB[i][j] = player;
          added = true;
        }
      }
    }
  }

  public void addCoachOffice(Coach coach){
    boolean added = false;
    for (int i = 0; i < sectorOffice.length && added == false; i++) {
      for (int j = 0; j < sectorOffice[i].length && added == false; j++) {
        if (j % 2 != 0 && sectorOffice[i][j] == null) {
          sectorOffice[i][j] = coach;
          added = true;
        }
      }
    }
  }

  public static void printAllPosition(Position[] allPosition){
    for (int i = 0; i < allPosition.length; i++) {
      System.out.println("(" + (i+1) + ") " + allPosition[i]);
    }
    System.out.println("");
  }

  public static void printAllExpertice(Expertice[] allExpertice){
    for (int i = 0; i < allExpertice.length; i++) {
      System.out.println("(" + (i+1) + ") " + allExpertice[i]);
    }
    System.out.println("");
  }

  public Position[] getAllPosition(){
    return allPosition;
  }

  public Expertice[] getAllExpertice(){
    return allExpertice;
  }

  public Team[] getTeams(){
    return teams;
  }

  public boolean addEmployee(String nameEm, int idEm, int salaryEm, boolean statuesEm, int dorsalPl, int amountGoal, double averagePl, Position positionPl){
    Player player = new Player(nameEm, idEm, salaryEm, statuesEm, dorsalPl, amountGoal, averagePl, positionPl);
    return employees.add(player);
  }

  public boolean addEmployee(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp, int amountTeam, int amountWinner){
    MainCoach mainCoach = new MainCoach(nameEm, idEm, salaryEm, statuesEm, yearExp, amountTeam, amountWinner);
    return employees.add(mainCoach);
  }

  public boolean addEmployee(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp, boolean profesionalPlayer, Expertice expertice){
    AssistentCoach assisCoach = new AssistentCoach(nameEm, idEm, salaryEm, statuesEm, yearExp, profesionalPlayer, expertice);
    return employees.add(assisCoach);
  }

  public void showInfoEmployee(){
    if (employees.size() == 0) {
      System.out.println("\nNo hay empleados aun.");
    } else {
      for (int i = 0; i < employees.size(); i++) {
        System.out.println(employees.get(i).showInfo());
      }
    }
  }

  public boolean eraseEmployee(String nameEm){
    boolean erase = false;
    for (int i = 0; i < employees.size(); i++) {
      if (employees.get(i).getNameEm().equalsIgnoreCase(nameEm)) {
        Employee employee = employees.get(i);
        return employees.remove(employee);
      }
    }
    return erase;
  }

  public void printTeam(){
    for (int i = 0; i < teams.length; i++) {
      System.out.println(teams[i].showTeamInfo());
      Player[] players = teams[i].getPlayers();
      try {
        for (int j = 0; j < players.length; j++) {
          System.out.println(players[j].showInfo());
        }
      } catch (NullPointerException e) {
        System.out.println("\nNo hay jugadores.");
      }
      AssistentCoach[] assisCoach = teams[i].getAssisCoach();
      try {
        for (int j = 0; j < assisCoach.length; j++) {
          System.out.println(assisCoach[j].showInfo());
        }
      } catch (NullPointerException e) {
        System.out.println("\nNo hay coach asistentes.");
      }
      MainCoach[] mainCoach = teams[i].getMainCoach();
      try {
        for (int j = 0; j < mainCoach.length; j++) {
          System.out.println(mainCoach[j].showInfo());
        }
      } catch (NullPointerException e) {
        System.out.println("\nNo hay coach principales.");
      }
      ArrayList<LineUp> lineUps = teams[i].getLineUps();
      if (lineUps.size() == 0) {
        System.out.println("\nNo hay Line ups.");
      } else {
        for (int j = 0; j < lineUps.size(); j++) {
          System.out.println(lineUps.get(j).showLineUpInfo());
        }
      }
      System.out.println("");
    }
  }
}
