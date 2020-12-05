package model;

public class AssistentCoach extends Coach{

  private boolean profesionalPlayer;
  private Expertice expertice;

  /**
  * Create an Assistent Coach.
  * <b> pre: </b> addEmployee was initiated <br>
  * <b> post: </b> Create an AssistentCoach.
  * @param nameEm nameEm != null.
  * @param idEm idEm != null.
  * @param salaryEm salaryEm != null
  * @param statuesEm statuesEm must be a boolean
  * @param yearExp yearExp >= 0.
  * @param profesionalPlayer profesionalPlayer must be a boolean
  * @param expertice expertice != null.
  */
  public AssistentCoach(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp, boolean profesionalPlayer, Expertice expertice){
    super(nameEm, idEm, salaryEm, statuesEm, yearExp);
    this.profesionalPlayer = profesionalPlayer;
    this.expertice = expertice;
  }

  /**
  * Return if the employee was a profesionalPlayer.
  * <b> pre: </b> showInfo was initiated <br>
  * <b> post: </b> return if the employee was a profesionalPlayer.
  * @return profesionalPlayer
  */
  public boolean getProfesionalPlayer(){
    return profesionalPlayer;
  }

  /**
  * Set the profesional player of the employee.
  * <b> pre: </b> <br>
  * <b> post: </b> set the profesional player of the employee.
  * @param profesionalPlayer profesionalPlayer != null
  */
  public void setProfesionalPlayer(boolean profesionalPlayer){
    this.profesionalPlayer = profesionalPlayer;
  }

  /**
  * Return the expertice of the employee.
  * <b> pre: </b> showInfo was initiated <br>
  * <b> post: </b> return the expertice of the employee.
  * @return expertice
  */
  public Expertice getExpertice(){
    return expertice;
  }

  /**
  * Set the expertice of the employee.
  * <b> pre: </b> <br>
  * <b> post: </b> set the expertice of the employee.
  * @param expertice expertice != null
  */
  public void setExpertice(Expertice expertice){
    this.expertice = expertice;
  }

  /**
  * Print the info of the employee.
  * <b> pre: </b> employee != null <br>
  * <b> post: </b> print the info of all employee.
  */
  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nJugador profesional: " + getProfesionalPlayer();
    msg += "\nExperticia: " + getExpertice();
    return msg;
  }
}
