package edu.jalc.pen.types;
import edu.jalc.pen.enclosure.cap.PenCap;
import edu.jalc.pen.enclosure.click.PenClick;


public class PenType extends Pen{
  PenType penType = new PenType();

  PenType(){
    this.PenCap= PenCap();
    this.PenClick= PenClick();

    }
  }
