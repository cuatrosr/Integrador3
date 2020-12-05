package model;

public class MainCoach extends Coach implements CalculateOp{

  private int amountTeam;
  private int amountWinner;

  /**
  * Create a main coach.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Create an Employee.
  * @param nameEm nameEm != null.
  * @param idEm idEm != null.
  * @param salaryEm salaryEm != null
  * @param statuesEm statuesEm must be a boolean
  * @param yearExp yearExp >= 0.
  * @param amountTeam amountTeam != null
  * @param amountWinner amountWinner != null
  */
  public MainCoach(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp, int amountTeam, int amountWinner){
    super(nameEm, idEm, salaryEm, statuesEm, yearExp);
    this.amountTeam = amountTeam;
    this.amountWinner = amountWinner;
  }

  /**
  * Return the amount of team.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the amount of team.
  * @return amountTeam
  */
  public int getAmountTeam(){
    return amountTeam;
  }

  /**
  * Set the name of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the amount of team.
  * @param amountTeam amountTeam != null
  */
  public void setAmountTeam(int amountTeam){
    this.amountTeam = amountTeam;
  }

  /**
  * Return the amount wins.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the amount of wins.
  * @return amountWinner
  */
  public int getAmountWinner(){
    return amountWinner;
  }

  /**
  * Set the name of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the amount of team.
  * @param amountTeam amountTeam != null
  */
  public void setAmountWinner(int amountWinner){
    this.amountWinner = amountWinner;
  }

  /**
  * Calculate the price of market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the price of market.
  * @return null
  */
  public double priceMarketP(Position positionPl, int salaryEm, double averagePl, int amountGoal){
    double null1 = 0;
    return  null1;
  }

  /**
  * Calculate the price of market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the price of market.
  * @return null
  */
  public double priceMarketC(int salaryEm, int yearExp, int amountWinner){
    double price = (salaryEm * 10) + (yearExp * 100) + (amountWinner * 50);
    return price;
  }

  /**
  * Calculate the star market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the star market.
  * @return null
  */
  public double starMarketP(Position positionPl, double averagePl, int amountGoal){
    double null1 = 0;
    return null1;
  }

  /**
  * Calculate the star market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the star market.
  * @return null
  */
  public double starMarketC(int amountWinner){
    double star = 5 + (amountWinner/10);
    return star;
  }

  /**
  * Print the info of the employee.
  * <b> pre: </b> employee != null <br>
  * <b> post: </b> print the info of all employee.
  */
  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nCantidad de equipos: " + getAmountTeam();
    msg += "\nCampeonatos ganados: " + getAmountWinner();
    return msg;
  }
}
