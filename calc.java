import calculator.*;
import java.util.*;
class calc{
  public static void main(String args[])
  {
    calculate obj=new calculate();
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1-add,2-sub,3-mul,4-div,5-modulo");
     int c=sc.nextInt();
    System.out.println("Enter any two integer values:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    switch(c)
    {
      case 1:
            obj.add(a,b);
            break;
      case 2:
            obj.sub(a,b);
            break;
      case 3:
            obj.mul(a,b);
            break;
      case 4:
            obj.div(a,b);
            break;
      case 5:
            obj.modulo(a,b);
            break;
    }
}
}
