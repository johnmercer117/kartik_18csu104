class testcylinder
{
	public static void main(String[] args)
	{
		cylinder c=new cylinder();
		double r=c.getradius();
		System.out.println("radius=" +r);

		double h=c.getheight();
         System.out.println("height" +h);

        double area=c.getarea();
        System.out.println("area=" +area);

        double vol=c.getvolume();
        System.out.println("vol=" +vol); 		
	}
}