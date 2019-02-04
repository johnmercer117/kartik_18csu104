import java.lang.Exception;
class Ex2
{
	public static void main(String [] args)
	{
	try
	 {
	  Ex2 ref =new Ex2();
	  ref=null;
	  ref.method(); 
	 }
	 catch(NullPointerException e)
	 {
	 System.out.println(e);
	 }
	}
	void method()
	{
	  System.out.println("error!!!!");
	}
}