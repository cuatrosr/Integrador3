package model;

public abstract class Employee{

  private String nameEm;
  private int idEm;
  private int salaryEm;
  private boolean statuesEm;

  public Employee(String nameEm, int idEm, int salaryEm, boolean statuesEm){
    this.nameEm = nameEm;
    this.idEm = idEm;
    this.salaryEm = salaryEm;
    this.statuesEm = statuesEm;
  }

  public String getNameEm(){
    return nameEm;
  }

  public void setNameEm(String nameEm){
    this.nameEm = nameEm;
  }

  public int getIdEm(){
    return idEm;
  }

  public void setIdEm(int idEm){
    this.idEm = idEm;
  }

  public int getSalaryEm(){
    return salaryEm;
  }

  public void setSalaryEm(int salaryEm){
    this.salaryEm = salaryEm;
  }

  public boolean getStatuesEm(){
    return statuesEm;
  }

  public void setStatuesEm(boolean statuesEm){
    this.statuesEm = statuesEm;
  }

  public String showInfo(){
    String msg = "\nNombre: " + getNameEm();
    msg += "\nId: " + getIdEm();
    msg += "\nSalario: " + getSalaryEm();
    msg += "\nStatues: " + getStatuesEm();
    return msg;
  }
}
