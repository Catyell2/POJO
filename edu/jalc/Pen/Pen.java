package edu.jalc.pen;

public class Pen{
   private final double length;
   private PenType penType;
   private Ink ink;

   private Pen() throws Exception{
     this.lenght = 0;
     this.setPenType(null);
     this.setInk(null);
   }

   Pen(double lenght, PenType penType, Ink ink)throws Exception{
     this.lenght = lenght;
     this.setPenType(penType);
     this.setInk(ink);
   }
   Pen setPenType(PenType penType)throws Exception{
     if (penType == null) throw new Exception("PenType must have a value!");
     this.penType = penType;
     return this;
   }
   Pen setInk (Ink ink){
     this.ink = ink;
     return this;
   }



}
