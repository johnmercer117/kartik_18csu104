import java.util.*;
import java.lang.Math;
class quadratic
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the valus of a,b and c in ");
		System.out.println("aX^2 + bX + c");

		System.out.println("Value of a:");
		int a = z.nextInt();
		System.out.println("Value of b:");
		int b = z.nextInt();
		System.out.println("Value of c:");
		int c = z.nextInt();

		System.out.println("The entered quadratic equation is:" +a+"X^2+"+b+"x+"+c);
		
		 int d = (b*b) - (4*a*c);

		 if(d==0)
		 {
            System.out.println("Only one real root exists");
            int x = -b/(2*a);
            System.out.println("X=" +x);   
		 }
		 else if(d<0)
		 {
            System.out.println("No real roots exists");
		 }
		 else if(d>0)
		 {
            double x1 = (-b+Math.sqrt(d))/(2*a);
            double x2 = (-b-Math.sqrt(d))/(2*a);
              System.out.println("X="+x1+";X="+x2);
		 }
	}
}