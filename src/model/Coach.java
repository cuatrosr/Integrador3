package model;

public abstract class Coach extends Employee{

  private int yearExp;

  public Coach(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp){
    super(nameEm, idEm, salaryEm, statuesEm);
    this.yearExp = yearExp;
  }

  public int getYearExp(){
    return yearExp;
  }

  public void setYearExp(int yearExp){
    this.yearExp = yearExp;
  }

  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nAños Exp: " + getYearExp();
    return msg;
  }
}
