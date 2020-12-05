package model;

public class Player extends Employee implements CalculateOp{

  private int dorsalPl;
  private int amountGoal;
  private double averagePl;
  private Position positionPl;

  /**
  * Create a player.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Create a player.
  * @param nameEm nameEm != null.
  * @param idEm idEm != null.
  * @param salaryEm salaryEm != null
  * @param statuesEm statuesEm must be a boolean
  * @param dorsalPl dorsalPl != null
  * @param amountGoal amountGoal != null
  * @param averagePl averagePl != null
  * @param positionPl positionPl != null
  */
  public Player(String nameEm, int idEm, int salaryEm, boolean statuesEm, int dorsalPl, int amountGoal, double averagePl, Position positionPl){
    super(nameEm, idEm, salaryEm, statuesEm);
    this.dorsalPl = dorsalPl;
    this.amountGoal = amountGoal;
    this.averagePl = averagePl;
    this.positionPl = positionPl;
  }

  /**
  * Return the dorsal of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the dorsal of employee.
  * @return dorsalPl
  */
  public int getDorsalPl(){
    return dorsalPl;
  }

  /**
  * Set the dorsal of player.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the dorsal of employee.
  * @param dorsalPl dorsalPl != null
  */
  public void setDorsalPl(int dorsalPl){
    this.dorsalPl = dorsalPl;
  }

  /**
  * Return the amount goal of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the amount goal of employee.
  * @return amountGoal
  */
  public int getAmountGoal(){
    return amountGoal;
  }

  /**
  * Set the amount goals of player.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the amount goal of employee.
  * @param amountGoal amountGoal != null
  */
  public void setAmountGoal(int amountGoal){
    this.amountGoal = amountGoal;
  }

  /**
  * Return the average of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the average of employee.
  * @return averagePl
  */
  public double getAveragePl(){
    return averagePl;
  }

  /**
  * Set the average of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the average of employee.
  * @param averagePl averagePl != null
  */
  public void setAveragePl(double averagePl){
    this.averagePl = averagePl;
  }

  /**
  * Return the position of employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the position of employee.
  * @return positionPl
  */
  public Position getPositionPl(){
    return positionPl;
  }

  /**
  * Set the position of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the position of employee.
  * @param positionPl positionPl != null
  */
  public void setPositionPl(Position positionPl){
    this.positionPl = positionPl;
  }

  /**
  * Calculate the price of market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the price of market.
  * @return null
  */
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

  /**
  * Calculate the price of market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the price of market.
  * @return null
  */
  public double priceMarketC(int salaryEm, int yearExp, int amountWinner){
    double null1 = 0;
    return null1;
  }

  /**
  * Calculate the star market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the star market.
  * @return null
  */
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

  /**
  * Calculate the star market.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> calculate the star market.
  * @return null
  */
  public double starMarketC(int amountWinner){
    double null1 = 0;
    return null1;
  }

  /**
  * Print the info of the employee.
  * <b> pre: </b> employee != null <br>
  * <b> post: </b> print the info of all employee.
  */
  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nDorsal: " + getDorsalPl();
    msg += "\nCantidad de goles: " + getAmountGoal();
    msg += "\nPromedio de jugador: " + getAveragePl();
    msg += "\nPosicion: " + getPositionPl();
    return msg;
  }
}
