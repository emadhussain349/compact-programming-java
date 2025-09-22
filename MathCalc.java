
public class MathCalc {
    public static void main(String[] args) {
      double sund = 865000.0;
      double earthd = 7600.0;
      double X,Y,Z;
      // int feet = 0 ;
      // int inches = 0;
      
      // radius = Math.sqrt(circleArea / Math.PI);
      // feet = (int)Math.floor(radius);
      // inches = (int) Math.round(12.0* (radius - feet));
      
      X = (double) 4 * Math.PI * (Math.pow(sund/2,3)/3); 
      Y = (double) 4 * Math.PI * (Math.pow(earthd/2,3)/3);
      
      Z = (double) X / Y;
      
      // System.out.println(X+", "+Y+" , "+Z);
      
      System.out.printf("The volume of the Earth is %.2f cubic miles, \nthe volume of the sun is %.2f"+
                  " cubic miles,\nand the ratio of the volume of the Sun to the volume of the Earth is %.2f", X,Y,Z);
    }
  }