package model;

public class MainCoach extends Coach implements CalculateOp{

  private int amountTeam;
  private int amountWinner;

  public MainCoach(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp, int amountTeam, int amountWinner){
    super(nameEm, idEm, salaryEm, statuesEm, yearExp);
    this.amountTeam = amountTeam;
    this.amountWinner = amountWinner;
  }

  public int getAmountTeam(){
    return amountTeam;
  }

  public void setAmountTeam(int amountTeam){
    this.amountTeam = amountTeam;
  }

  public int getAmountWinner(){
    return amountWinner;
  }

  public void setAmountWinner(int amountWinner){
    this.amountWinner = amountWinner;
  }

  public void starMarket(int a){
    a += 1;
  }

  public void priceMarket(int a){
    a += 1;
  }
}
