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

  public double priceMarketP(Position positionPl, int salaryEm, double averagePl, int amountGoal){
    double price;
    if (positionPl == Position.GOALKEEPER) {
      price = (salaryEm * 12) + (averagePl * 150);
    } else if (positionPl == Position.DEFENCE) {
      price = (salaryEm * 13) + (averagePl * 125) + (amountGoal * 100);
    } else if (positionPl == Position.MIDFIELDER) {
      price = (salaryEm * 14) + (averagePl * 135) + (amountGoal * 125);
    } else {
      price = (salaryEm * 15) + (averagePl * 0.9) + (amountGoal * 150);
    }
    return price;
  }

  public double priceMarketC(int salaryEm, int yearExp, int amountWinner){
    double null1 = 0;
    return null1;
  }

  public double starMarketP(Position positionPl, double averagePl, int amountGoal){
    double star;
    if (positionPl == Position.GOALKEEPER) {
      star = (averagePl * 0.9);
    } else if (positionPl == Position.DEFENCE) {
      star = (averagePl * 0.9) + (amountGoal/100);
    } else if (positionPl == Position.MIDFIELDER) {
      star = (averagePl * 0.9) + (amountGoal/90);
    } else {
      star = (averagePl * 0.9) + (amountGoal/80);
    }
    return star;
  }

  public double starMarketC(int amountWinner){
    double null1 = 0;
    return null1;
  }
}
