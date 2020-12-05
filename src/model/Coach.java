package model;

public abstract class Coach extends Employee{

  private int yearExp;

  /**
  * Create a Coach.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Create a Coach.
  * @param nameEm nameEm != null.
  * @param idEm idEm != null.
  * @param salaryEm salaryEm != null
  * @param statuesEm statuesEm must be a boolean
  * @param yearExp yearExp >= 0.
  */
  public Coach(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp){
    super(nameEm, idEm, salaryEm, statuesEm);
    this.yearExp = yearExp;
  }

  /**
  * Return the coach year experience.
  * <b> pre: </b> showInfo was initiated <br>
  * <b> post: </b> return if the employee was a profesionalPlayer.
  * @return yearExp
  */
  public int getYearExp(){
    return yearExp;
  }

  /**
  * Set coach year experience.
  * <b> pre: </b> <br>
  * <b> post: </b> set the profesional player of the employee.
  * @param yearExp yearExp != null
  */
  public void setYearExp(int yearExp){
    this.yearExp = yearExp;
  }

  /**
  * Print the info of the employee.
  * <b> pre: </b> employee != null <br>
  * <b> post: </b> print the info of all employee.
  */
  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nAños Exp: " + getYearExp();
    return msg;
  }
}
