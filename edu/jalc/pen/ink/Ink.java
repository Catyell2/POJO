package edu.jalc.pen.ink;

  public class Ink{
  private Color color;
  private IsFull isFull;

  private Ink(){
    this.setColor(null);
    this.setIsFull(null);
  }

  Ink(Color color, IsFull isFull){
    this.setColor(color);
    this.setIsFull(isFull);
  }

  Ink setColor (Color color){
    this.color= color;
    return this;
  }

  Ink setIsFull(IsFull isFull){
    this.isFull = isFull;
    return this;
  }


}
