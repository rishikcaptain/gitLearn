import  java.util.*;

abstract class Shape{
  abstract public void area();
  abstract public void perimeter();
}

  class Circle extends Shape{
    double r;
   public void area(){
  double val = Math.PI*r*r;
System.out.println("Area of Circle "+val);
}

public void perimeter(){
  double val = 2*Math.PI*r;
  System.out.println("Perimeter of Cirle "+val);
}
}

 class Rectangle extends Shape{
   double l,b;
   public void area(){
    double val = l*b;
      System.out.println("Area of Rectangle "+val);
  }

  public void perimeter(){
    double val = 2*(l+b);
      System.out.println("Perimeter of Rectangle "+val);
  }
}

public class AbstractMethod{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Rectangle rec = new Rectangle();
    rec.l=sc.nextDouble();
    rec.b=sc.nextDouble();
    rec.area();
    rec.perimeter();
    System.out.println();
    Circle cir = new Circle();
    cir.r=sc.nextDouble();
    cir.area();
    cir.perimeter();


  }
}
