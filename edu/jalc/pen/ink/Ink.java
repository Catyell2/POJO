package edu.jalc.pen.ink;

  public class Ink implements Fillable{
    public void getInk(){
      this.fill();
      System.out.println("I have Ink");
    }
    public void fill(){
      System.out.println("Fills up the Ink");
    }


}
