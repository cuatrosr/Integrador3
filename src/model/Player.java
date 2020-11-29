package model;

public class Player extends Employee implements CalculateOp{

  private int dorsalPl;
  private int amountGoal;
  private double averagePl;
  private Position positionPl;

  public Player(String nameEm, int idEm, int salaryEm, boolean statuesEm, int dorsalPl, int amountGoal, double averagePl, Position positionPl){
    super(nameEm, idEm, salaryEm, statuesEm);
    this.dorsalPl = dorsalPl;
    this.amountGoal = amountGoal;
    this.averagePl = averagePl;
    this.positionPl = positionPl;
  }

  public int getDorsalPl(){
    return dorsalPl;
  }

  public void setDorsalPl(int dorsalPl){
    this.dorsalPl = dorsalPl;
  }

  public int getAmountGoal(){
    return amountGoal;
  }

  public void setAmountGoal(int amountGoal){
    this.amountGoal = amountGoal;
  }

  public double getAveragePl(){
    return averagePl;
  }

  public void setAveragePl(double averagePl){
    this.averagePl = averagePl;
  }

  public Position getPositionPl(){
    return positionPl;
  }

  public void setPositionPl(Position positionPl){
    this.positionPl = positionPl;
  }

  public void starMarket(int a){
    a += 1;
  }

  public void priceMarket(int a){
    a += 1;
  }
}
