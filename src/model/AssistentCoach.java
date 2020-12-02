package model;

public class AssistentCoach extends Coach{

  private boolean profesionalPlayer;
  private Expertice expertice;

  public AssistentCoach(String nameEm, int idEm, int salaryEm, boolean statuesEm, int yearExp, boolean profesionalPlayer, Expertice expertice){
    super(nameEm, idEm, salaryEm, statuesEm, yearExp);
    this.profesionalPlayer = profesionalPlayer;
    this.expertice = expertice;
  }

  public boolean getProfesionalPlayer(){
    return profesionalPlayer;
  }

  public void setProfesionalPlayer(boolean profesionalPlayer){
    this.profesionalPlayer = profesionalPlayer;
  }

  public Expertice getExpertice(){
    return expertice;
  }

  public void setExpertice(Expertice expertice){
    this.expertice = expertice;
  }

  @Override
  public String showInfo(){
    String msg = super.showInfo() + "\nJugador profesional: " + getProfesionalPlayer();
    msg += "\nExperticia: " + getExpertice();
    return msg;
  }
}
