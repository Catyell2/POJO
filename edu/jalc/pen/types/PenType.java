package edu.jalc.pen.type;

public class PenType extends Pen{
  private PenCap penCap;
  private PenClick penClick;

  private PenType(){
    this.setPenCap(null);
    this.setPenClick(null);
  }
  PenType(PenCap penCap, PenClick penClick){
    this.setPenCap(penCap);
    this.setPenCLick(penClick);
  }
  PenType setPenCap( PenCap penCap){
    this.penCap = penCap;
    return this;
  }
  PenType setPenCLick(PenClick penClick){
    this.penClick = penClick;
    return this;
  }


}
