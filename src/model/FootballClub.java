package model;
import java.util.*;

public class FootballClub{

  private String nameFC;
  private int nitFC;
  private String fundationDateFC;
  private Team[] teams;
  private final static int MAX_TEAMS = 2;
  private String[][] dressingRoomA;
  private final static int DRESSING_A_F = 7;
  private final static int DRESSING_A_C = 6;
  private String[][] dressingRoomB;
  private final static int DRESSING_B_F = 7;
  private final static int DRESSING_B_C = 7;
  private ArrayList<Employee> employees;
  private String[][] sectorOffice;
  private final static int OFFICE_F = 6;
  private final static int OFFICE_C = 6;
  private Position[] allPosition = Position.values();
  private Expertice[] allExpertice = Expertice.values();
  private Tactic[] allTactic = Tactic.values();

  public FootballClub(String nameFC, int nitFC, String fundationDateFC){
    this.nameFC = nameFC;
    this.nitFC = nitFC;
    this.fundationDateFC = fundationDateFC;
    teams = new Team[MAX_TEAMS];
    teams[0] = new Team("Team A");
    teams[1] = new Team("Team B");
    dressingRoomA = new String[DRESSING_A_F][DRESSING_A_C];
    dressingRoomB = new String[DRESSING_B_F][DRESSING_B_C];
    employees = new ArrayList<Employee>();
    sectorOffice = new String[OFFICE_F][OFFICE_C];
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

  public ArrayList<Employee> getEmployees(){
    return employees;
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
      System.out.println("\nJugadores:");
      if (players != null) {
        for (int j = 0; j < players.length; j++) {
          if (players[j] != null) {
            System.out.println(players[j].showInfo());
          }
        }
      } else {
        System.out.println("\nNo hay jugadores.");
      }
      AssistentCoach[] assisCoach = teams[i].getAssisCoach();
      System.out.println("\nCoach Asistentes:");
      if (assisCoach[0] == null) {
        System.out.println("\nNo hay coach asistentes.");
      } else {
        for (int j = 0; j < assisCoach.length; j++) {
          if (assisCoach[j] != null) {
            System.out.println(assisCoach[j].showInfo());
          }
        }
      }
      MainCoach[] mainCoach = teams[i].getMainCoach();
      System.out.println("\nCoach Principales:");
      if (mainCoach[0] == null) {
        System.out.println("\nNo hay coach principales.");
      } else {
        for (int j = 0; j < mainCoach.length; j++) {
          if (mainCoach[j] != null) {
            System.out.println(mainCoach[j].showInfo());
          }
        }
      }
      ArrayList<LineUp> lineUps = teams[i].getLineUps();
      System.out.println("\nLineUps: ");
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

  public boolean addPlayerTeam(String namePl, int index){
    boolean found = false;
    Player[] players = teams[index].getPlayers();
    for (int i = 0; i < employees.size() && !found; i++) {
      if (employees.get(i) instanceof Player && employees.get(i).getNameEm().equalsIgnoreCase(namePl)) {
        for (int j = 0; j < players.length && !found; j++) {
          if (players[j] == null) {
            players[j] = (Player) employees.get(i);
            teams[index].setPlayers(players);
            found = true;
          }
        }
      }
    }
    return found;
  }

  public boolean removePlayerTeam(String namePl, int index){
    boolean found = false;
    Player[] players = teams[index].getPlayers();
    for (int i = 0; i < players.length && !found; i++) {
      if (players[i].getNameEm().equalsIgnoreCase(namePl)) {
        players[i] = null;
        teams[index].setPlayers(players);
        found = true;
      }
    }
    return found;
  }

  public String goToCamerino(int index){
    Player[] players = teams[index].getPlayers();
    int count = 0;
    try {
      if (index == 0) {
        for (int i = 0; i < dressingRoomA.length && count < players.length; i++) {
          for (int j = 0; j < dressingRoomA[i].length; j++) {
            if (i != 1 && i != 3 && i != 5) {
              if (j != 1 && j != 3 && j != 5) {
                dressingRoomA[i][j] = players[count].getNameEm();
                count++;
              }
            } else {
              if (j != 1 && j != 3 && j != 5) {
                dressingRoomA[i][j] = players[count].getNameEm();
                count++;
              }
            }
          }
        }
      } else {
        for (int i = 0; i < dressingRoomB.length && count < players.length; i++) {
          for (int j = 0; j < dressingRoomB[i].length; j++) {
            if (i % 2 == 0) {
              if (j != 1 && j != 3 && j != 5 && j != 7) {
                dressingRoomB[i][j] = players[count].getNameEm();
                count++;
              }
            } else {
              if (j != 1 && j != 3 && j != 5) {
                dressingRoomB[i][j] = players[count].getNameEm();
                count++;
              }
            }
          }
        }
      }
    } catch(NullPointerException e) {
    }
    String msg = "Doned";
    return msg;
  }

  public void printCamerino(int index){

    if (index == 0) {
      for (String matriz[] : dressingRoomA) {
        System.out.println(Arrays.toString(matriz));
      }
    } else {
      for (String matriz[] : dressingRoomB) {
        System.out.println(Arrays.toString(matriz));
      }
    }
  }

  public boolean addAssisTeam(String namePl, int index){
    boolean found = false;
    AssistentCoach[] assisCoach = teams[index].getAssisCoach();
    for (int i = 0; i < employees.size() && !found; i++) {
      if (employees.get(i) instanceof AssistentCoach && employees.get(i).getNameEm().equalsIgnoreCase(namePl)) {
        for (int j = 0; j < assisCoach.length && !found; j++) {
          if (assisCoach[j] == null) {
            assisCoach[j] = (AssistentCoach) employees.get(i);
            teams[index].setAssistentCoach(assisCoach);
            found = true;
          }
        }
      }
    }
    return found;
  }

  public boolean removeAssisTeam(String namePl, int index){
    boolean found = false;
    AssistentCoach[] assisCoach = teams[index].getAssisCoach();
    for (int i = 0; i < assisCoach.length && !found; i++) {
      if (assisCoach[i].getNameEm().equalsIgnoreCase(namePl)) {
        assisCoach[i] = null;
        teams[index].setAssistentCoach(assisCoach);
        found = true;
      }
    }
    return found;
  }

  public boolean addMainTeam(String namePl, int index){
    boolean found = false;
    MainCoach[] mainCoach = teams[index].getMainCoach();
    for (int i = 0; i < employees.size() && !found; i++) {
      if (employees.get(i) instanceof MainCoach && employees.get(i).getNameEm().equalsIgnoreCase(namePl)) {
        for (int j = 0; j < mainCoach.length && !found; j++) {
          if (mainCoach[j] == null) {
            mainCoach[j] = (MainCoach) employees.get(i);
            teams[index].setMainCoach(mainCoach);
            found = true;
          }
        }
      }
    }
    return found;
  }

  public boolean removeMainTeam(String namePl, int index){
    boolean found = false;
    MainCoach[] mainCoach = teams[index].getMainCoach();
    for (int i = 0; i < mainCoach.length && !found; i++) {
      if (mainCoach[i].getNameEm().equalsIgnoreCase(namePl)) {
        mainCoach[i] = null;
        teams[index].setMainCoach(mainCoach);
        found = true;
      }
    }
    return found;
  }

  public void goToOffice(){

    ArrayList<String> coachs = new ArrayList<String>();
    try {
      MainCoach[] mainCoachA = teams[0].getMainCoach();
      for (int i = 0; i < mainCoachA.length; i++) {
        coachs.add(mainCoachA[i].getNameEm());
      }
    } catch(NullPointerException e) {
    }
    try {
      MainCoach[] mainCoachB = teams[1].getMainCoach();
      for (int i = 0; i < mainCoachB.length; i++) {
        coachs.add(mainCoachB[i].getNameEm());
      }
    } catch(NullPointerException e) {
    }
    try {
      AssistentCoach[] assisCoachA = teams[0].getAssisCoach();
      for (int i = 0; i < assisCoachA.length; i++) {
        coachs.add(assisCoachA[i].getNameEm());
      }
    } catch(NullPointerException e) {
    }
    try {
      AssistentCoach[] assisCoachB = teams[1].getAssisCoach();
      for (int i = 0; i < assisCoachB.length; i++) {
        coachs.add(assisCoachB[i].getNameEm());
      }
    } catch(NullPointerException e) {
    }
    int count = 0;
    try {
      for (int i = 0; i < sectorOffice.length && count < coachs.size(); i++) {
        for (int j = 0; j < sectorOffice[i].length && count < coachs.size(); j++) {
          if (i != 1 && i != 3 && i != 5) {
            if (j != 1 && j != 3 && j != 5) {
              sectorOffice[i][j] = coachs.get(count);
              count++;
            }
          }  else {
            if (j != 1 && j != 3 && j != 5) {
              sectorOffice[i][j] = coachs.get(count);
              count++;
            }
          }
        }
      }
    } catch(NullPointerException e) {
    }
  }

  public void printOffice(){
    System.out.println("");
    for (String matriz[] : sectorOffice) {
      System.out.println(Arrays.toString(matriz));
    }
  }

  public void printTactic(){
    System.out.println("");
    for (int i = 0; i < allTactic.length; i++) {
      System.out.println("(" + (i+1) + ")" + allTactic[i]);
    }
    System.out.println("");
  }

  public boolean createLineUp(int index, String dateLineUp, Tactic tactic, String formationLine){
    ArrayList<LineUp> lineUps = teams[index].getLineUps();
    return lineUps.add(new LineUp(dateLineUp, tactic, formationLine));
  }

  public String printTeamLineUp(int index){
    ArrayList<LineUp> lineUps = teams[index].getLineUps();
    String msg = "";
    String formationLine;
    String[] formationSlip;
    int[] formationPart;
    int formationIndex;
    for (int i = 0; i < lineUps.size(); i++) {
      boolean[][] matriz = {
        {false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false}};

      msg += "\nDate: " + lineUps.get(i).getDateLineUp();
      msg += "\nTactic: " + lineUps.get(i).getTactic();
      msg += "\nFormation Line: " + lineUps.get(i).getFormationLine();
      msg += "\n\n";
      formationLine = lineUps.get(i).getFormationLine();
      formationSlip = formationLine.split("-");
      formationPart = new int[formationSlip.length];
      for (int j = 0; j < formationSlip.length; j++) {
        formationPart[j] = Integer.parseInt(formationSlip[j]);
      }
      matriz[6][3] = (formationPart[0] % 2 == 0) ? false : true;
      formationIndex = formationPart[0] / 2;
      for (int j = 0; j < formationIndex; j++) {
        matriz[6][3 + (j + 1)] = true;
        matriz[6][3 - (j + 1)] = true;
      }
      matriz[4][3] = (formationPart[1] % 2 == 0) ? false : true;
      formationIndex = formationPart[1] / 2;
      for (int j = 0; j < formationIndex; j++) {
        matriz[4][3 + (j + 1)] = true;
        matriz[4][3 - (j + 1)] = true;
      }
      matriz[2][3] = (formationPart[2] % 2 == 0) ? false : true;
      formationIndex = formationPart[2] / 2;
      for (int j = 0; j < formationIndex; j++) {
        matriz[2][3 + (j + 1)] = true;
        matriz[2][3 - (j + 1)] = true;
      }
      try {
        matriz[0][3] = (formationPart[3] % 2 == 0) ? false : true;
        formationIndex = formationPart[3] / 2;
        for (int j = 0; j < formationIndex; j++) {
          matriz[0][3 + (j + 1)] = true;
          matriz[0][3 - (j + 1)] = true;
        }
      } catch(ArrayIndexOutOfBoundsException e) {
      }
      int[][] matrizInt = {
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},};
      for (int j = 0; j < matriz.length; j++) {
        for (int k = 0; k < matriz[j].length; k++) {
          if (matriz[j][k] == false) {
            matrizInt[j][k] = 0;
          } else if (matriz[j][k] == true) {
            matrizInt[j][k] = 1;
          }
        }
      }
      for (int[] b : matrizInt) {
        msg += Arrays.toString(b) + "\n";
      }
    }
    return msg;
  }
}
