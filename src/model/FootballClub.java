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

  public FootballClub(String nameFC, int nitFC, String fundationDateFC){
    this.nameFC = nameFC;
    this.nitFC = nitFC;
    this.fundationDateFC = fundationDateFC;
    teams = new Team[MAX_TEAMS];
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
    for (int i = 0; i < dressingRoomA.length; i++) {
      for (int j = 0; j < dressingRoomA[i].length; j++) {
        if (j % 2 != 0 && dressingRoomA[i][j] == null) {
          dressingRoomA[i][j] = player;
        }
      }
    }
  }

  public void addPlayerDressingB(Player player){
    for (int i = 0; i < dressingRoomB.length; i++) {
      for (int j = 0; j < dressingRoomB[i].length; j++) {
        if (j % 2 != 0 && dressingRoomB[i][j] == null) {
          dressingRoomB[i][j] = player;
        }
      }
    }
  }
}
