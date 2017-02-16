package lab.pen;

public class Pen{
   private final double LENGTH;
   private PenCap penCap;
   private Ink ink;

   private Pen() throws Exception{
     this.LENGTH = 0;
     this.setPenCap(null);
     this.ink= null;
   }

   Pen(double LENGTH, PenCap penCap, Ink ink)throws Exception{
     this.LENGTH = LENGTH;
     this.setPenCap(penCap);
     this.setInk(ink);
   }
   Pen setPenCap(PenCap penCap)throws Exception{
     if (penCap == null) throw new Exception("PenCap must have a value!");
     this.penCap = penCap;
     return this;
   }
   Pen setInk (Ink ink){
     this.ink = ink;
     return this;

   }



}
