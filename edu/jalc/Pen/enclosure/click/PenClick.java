package edu.jalc.pen.enclosure.click;

public class PenClick implements Clickable{
  private boolean canClick;

  public void PenCLick(){
    this.canClick = true;
    if(canClick= true){toString();}

  }
  public PenClick(boolean canClick){
    this.canClick = canClick;
  }
  public void click(){
  this.canClick = true;
  System.out.println("I Clicked");
  }
  public String toString(){
    return "This Pen can click";
  }
}
