package model;

public abstract class Employee{

  private String nameEm;
  private int idEm;
  private int salaryEm;
  private boolean statuesEm;

  /**
  * Create an Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Create an Employee.
  * @param nameEm nameEm != null.
  * @param idEm idEm != null.
  * @param salaryEm salaryEm != null
  * @param statuesEm statuesEm must be a boolean
  */
  public Employee(String nameEm, int idEm, int salaryEm, boolean statuesEm){
    this.nameEm = nameEm;
    this.idEm = idEm;
    this.salaryEm = salaryEm;
    this.statuesEm = statuesEm;
  }

  /**
  * Return the name of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the name of employee.
  * @return nameEm
  */
  public String getNameEm(){
    return nameEm;
  }

  /**
  * Set the name of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the name of employee.
  * @param nameEm nameEm != null
  */
  public void setNameEm(String nameEm){
    this.nameEm = nameEm;
  }

  /**
  * Return the id of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the id of employee.
  * @return idEm
  */
  public int getIdEm(){
    return idEm;
  }

  /**
  * Set the id of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the id of employee.
  * @param idEm idEm != null
  */
  public void setIdEm(int idEm){
    this.idEm = idEm;
  }

  /**
  * Return the salaryEm of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the salary of employee.
  * @return salaryEm
  */
  public int getSalaryEm(){
    return salaryEm;
  }

  /**
  * Set the salary of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the salary of employee.
  * @param salaryEm salaryEm != null
  */
  public void setSalaryEm(int salaryEm){
    this.salaryEm = salaryEm;
  }

  /**
  * Return the statuesEm of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> return the statuesEm of employee.
  * @return statuesEm
  */
  public boolean getStatuesEm(){
    return statuesEm;
  }

  /**
  * Set the statuesEm of Employee.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Set the statuesEm of employee.
  * @param statuesEm statuesEm != null
  */
  public void setStatuesEm(boolean statuesEm){
    this.statuesEm = statuesEm;
  }

  /**
  * Print the info of the employee.
  * <b> pre: </b> employee != null <br>
  * <b> post: </b> print the info of all employee.
  */
  public String showInfo(){
    String msg = "\nNombre: " + getNameEm();
    msg += "\nId: " + getIdEm();
    msg += "\nSalario: " + getSalaryEm();
    msg += "\nStatues: " + getStatuesEm();
    return msg;
  }
}
