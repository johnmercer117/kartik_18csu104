import java.util.*;
 class circle
{
	private double radius;
	private String color;

	public circle()
	{
       this.radius=1.0;
       this.color="red";
	}
	
	public circle(double r, String c)
	{
       this.radiud=r;
       this.color=c;
	}
	public circle(double r)
	{
       this.radius=r;
       this.color="red";
	}

	public double getradius()
	{
		return radius;
	}
	public void setradius(radius)
	{
       this.radius=r;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String c)
	{
		color=c;
	}
	public double setarea()
	{
		return 3.14*radius*radius;
	}
}