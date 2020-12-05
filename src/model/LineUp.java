package model;

public class LineUp{

  private String dateLineUp;
  private Tactic tactic;
  private String formationLine;

  /**
  * Create a Line Up.
  * <b> pre: </b> edit team was initiated <br>
  * <b> post: </b> Create a line up.
  * @param dateLineUp dateLineUp != null.
  * @param tactic tactic != null.
  * @param formationLine formationLine != null
  */
  public LineUp(String dateLineUp, Tactic tactic, String formationLine){
    this.dateLineUp = dateLineUp;
    this.tactic = tactic;
    this.formationLine = formationLine;
  }

  /**
  * Return the date of Employee.
  * <b> pre: </b> <br>
  * <b> post: </b> return the date of line up.
  * @return dateLineUp
  */
  public String getDateLineUp(){
    return dateLineUp;
  }

  /**
  * Set the line up date.
  * <b> pre: </b> <br>
  * <b> post: </b> set the line up date.
  * @param dateLineUp dateLineUp != null.
  */
  public void setDateLineUp(String dateLineUp){
    this.dateLineUp = dateLineUp;
  }

  /**
  * Return the date of Employee.
  * <b> pre: </b> <br>
  * <b> post: </b> return the date of line up.
  * @return tactic
  */
  public Tactic getTactic(){
    return tactic;
  }

  /**
  * Set the line up tactic.
  * <b> pre: </b> <br>
  * <b> post: </b> set the line up tactic.
  * @param tactic tactic != null.
  */
  public void setTactic(Tactic tactic){
    this.tactic = tactic;
  }

  /**
  * Return the formation line.
  * <b> pre: </b> <br>
  * <b> post: </b> return the formation line up.
  * @return formationLine
  */
  public String getFormationLine(){
    return formationLine;
  }

  /**
  * Set the line up formation.
  * <b> pre: </b> <br>
  * <b> post: </b> set the line up formation.
  * @param formationLine formationLine != null.
  */
  public void setFormationLine(String formationLine){
    this.formationLine = formationLine;
  }
}
