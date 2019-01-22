class pointdemo
{
	public static void main(String[] args)
	{
	point p1 = new point();
	point p2 = new point(10,15);
	double distance = p1.caldistance(p1,p2);
	System.out.println("Distance is" +distance);
	}
}