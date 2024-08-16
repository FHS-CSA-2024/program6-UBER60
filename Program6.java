//Your code here
//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6{
    public static void main(String[] args){
      Scanner S = new Scanner(System.in);
      final double pi = Math.PI
      System.out.println("Enter the radius:");
      System.out.println();
      double r = S.nextDouble();
      System.out.println();
      System.out.println("The Radius of the circle = " + Math.round(r*1000)/1000.0);
      System.out.println();
      System.out.println("The Diameter of the circle = " + Math.round(r*2*1000)/1000.0);
      System.out.println();
      System.out.println("The Area of the circle = " + Math.round(((pi)*(r*r))*1000)/1000.0);
      System.out.println();
      System.out.println("The Circumference of the circle = " + Math.round((pi*r*2)*1000)/1000.0);
    }
}
//Paste console output below:
/*
Enter the radius:

3.712

The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 43.288

The Circumference of the circle = 23.323

*/
