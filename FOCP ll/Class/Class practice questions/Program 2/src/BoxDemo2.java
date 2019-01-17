class Box
{
	double width;
	double height;
	double depth;
    Box(double width, double height, double depth)
    {
       this.width =width;
       this.height=height;
       this.depth =depth;
    }
    Box()
    {
        this.width=0;
        this.height=0;
        this.depth=0;
    }
	void setDim()
    {
    	width = 10;
    	height = 20;
    	depth = 10;
    }
	double volume()
	{
		double volume = height*depth*width;
		return volume;
	}

}
class BoxDemo2
{
    public static void main(String[] args)
    {
    	Box var = new Box();
    	var.setDim();
    	double vol=var.volume();
    	System.out.println("Volume of object is" +vol);

        Box var2 = new Box(1,2,3);
        double vol2=var2.volume();
        System.out.println("new voume:" +vol2);
    }
}
