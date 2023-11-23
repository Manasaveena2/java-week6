package mytest;
import shapes.*;
import java.util.*;
public class find
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    square s=new square();
    triangle t=new triangle();
    circle c=new circle();
    System.out.println("Enter 1-square,2-triangle,3-circle to find area and perimeter:");
    int i=sc.nextInt();
    switch(i)
    {
      case 1:
             System.out.println("Enter side of a square:");
             int a=sc.nextInt();
             s.area(a);
             s.perimeter(a);
             break;
      case 2:
             System.out.println("Enter 3 sides respectively:");
             int e=sc.nextInt();
             int f=sc.nextInt();
             int d=sc.nextInt();
             t.area(e,f);
             t.perimeter(e,f,d);
             break;
      case 3:
             System.out.println("Enter radius:");
             int r=sc.nextInt();
             c.area(r);
             c.perimeter(r);
             break;
    }
}
}
             
