package model;

public class LineUp{

  private String dateLineUp;
  private Tactic tactic;
  private String formationLine;

  public LineUp(String dateLineUp, Tactic tactic, String formationLine){
    this.dateLineUp = dateLineUp;
    this.tactic = tactic;
    this.formationLine = formationLine;
  }

  public String getDateLineUp(){
    return dateLineUp;
  }

  public void setDateLineUp(String dateLineUp){
    this.dateLineUp = dateLineUp;
  }

  public Tactic getTactic(){
    return tactic;
  }

  public void setTactic(Tactic tactic){
    this.tactic = tactic;
  }

  public String getFormationLine(){
    return formationLine;
  }

  public void setFormationLine(String formationLine){
    this.formationLine = formationLine;
  }
}
