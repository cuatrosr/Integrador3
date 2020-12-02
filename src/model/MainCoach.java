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

  public double priceMarketP(Position positionPl, int salaryEm, double averagePl, int amountGoal){
    double null1 = 0;
    return  null1;
  }

  public double priceMarketC(int salaryEm, int yearExp, int amountWinner){
    double price = (salaryEm * 10) + (yearExp * 100) + (amountWinner * 50);
    return price;
  }

  public double starMarketP(Position positionPl, double averagePl, int amountGoal){
    double null1 = 0;
    return null1;
  }

  public double starMarketC(int amountWinner){
    double star = 5 + (amountWinner/10);
    return star;
  }

  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nCantidad de equipos: " + getAmountTeam();
    msg += "\nCampeonatos ganados: " + getAmountWinner();
    return msg;
  }
}
