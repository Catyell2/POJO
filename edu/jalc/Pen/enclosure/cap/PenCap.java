package edu.jalc.pen.enclosure.cap;

public class PenCap implements Attachable, Detachable{
  public boolean hasPenCap;
  public boolean capOn;

  public void PenCap(){
    this.hasPenCap = true;
    if(hasPenCap= true){toString();}

  }
  public PenCap(boolean hasPenCap){
    this.hasPenCap = hasPenCap;
  }
  public void attach(){
    capOn = true;
  }
  public void detach(){
    capOn = false;
  }


  public String toString(){
    return "This Pen has a cap";
  }

}
