package edu.jalc.pen.color;

public class Color{
  private byte red;
  private byte blue;
  private byte green;

  private Color(){
    this.red=0;
    this.blue=0;
    this.green=0;
  }
  public Color(byte red,byte blue, byte green){
    this.red=red;
    this.blue=blue;
    this.green=green;
  }
  public Color getRed(){
    return red;
  }
  public Color getBlue(){
    return blue;
  }
  public Color getGreen(){
    return green;
  }



}
