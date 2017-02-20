package edu.jalc.pen;

public class Pen{
   private final double LENGTH;
   private PenType penType;
   private Ink ink;

   private Pen() throws Exception{
     this.LENGTH = 0;
     this.setPenType(null);
     this.setInk(null);
   }

   Pen(double LENGTH, PenType penType, Ink ink)throws Exception{
     this.LENGTH = LENGTH;
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
