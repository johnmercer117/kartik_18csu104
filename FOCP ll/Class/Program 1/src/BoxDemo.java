class Box
{
	double width;
	double height;
	double depth;
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
class BoxDemo
{
    public static void main(String[] args)
    {
    	Box var = new Box();
    	var.setDim();
    	double vol=var.volume();
    	System.out.println("Volume of object is" +vol);
    }
}
