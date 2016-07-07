class Circle
{
	private double radius;			//instance
	private static int count;		//class

	public Circle()				//default constructor
	{
		radius=2.0;
		count++;
	}

	
	public Circle(double b)			//paramatrized constructor
	{
		radius=b;
		count++;
	}
	
	public void setRadius(double r)		//setter
	{
		radius=r;
	}
	
	public double getRadius()		//getter
	{
		return radius;
	}

	public void areaCircle(double b)	//bussiness logic
	{
		double area;
		area=radius*radius*3.14;
		System.out.println("Area of circle"+area);                                                		
	}

	public static int getCount()		//count of object
	{
		return count;
	}

	public String toString()		//toString
	{
		return "Radius of circle"+ radius;
	}

}