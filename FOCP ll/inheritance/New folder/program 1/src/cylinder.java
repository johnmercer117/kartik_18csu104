class cylinder extends circle
{
	private double height;
    
    public cylinder()
    {
    	super();
    	this.height=1.0;
    }
    public cylinder(double radius )
    {
        super(radius);
        this.height=1.0;
    }
    public cylinder(double radius, double height)
    {
    	super(radius);
    	this.height=height;
    }
    public cylinder(double radius, double height, String color)
    {
    	super(radius);
    	super(color);
    	this.height=h;
    }

    public double getheight()
    {
       return height;
    }
    public void setheight(double height)
    {
       this.height=height;  
    }
    public double setvolume()
    {
    	return super.getarea()*height;
    }

}