public class Rectangle
{

	private int length;			//instance
	private int breadth;			//instance
	private static int count;		//class
	
	public Rectangle()			//default constructor
	{
		length=2;
		breadth=2;
		count++;
	}

	public Rectangle(int a,int b)		//paramatrized constructor		
	{
		length=a;
		breadth=b;
		count++;
	}
	 
	public void setRectangleDimension(int a,int b)	//setter
	{
		length=a;
		breadth=b;
		
	}
	

	public void setLength(int a)		//setter
	{
		length=a;
		
		
	}

	public void setBreadth(int b)		//setter
	{
		breadth=b;
		fv 
	}

	public String getRectangleDimension()	//getter
	{
		return length +" "+ breadth;
	}
	

	public int getLength()			//getter
	{
		return length;
		
	}

	public int  getBreadth()		//getter
	{
		return breadth;
	}

	public int rectangleArea(int l ,int b)	//Bussiness logic
	{
	return l*b;

	}
	
	public static int count()		//count
	{
		return count;
	}

	public String toString()		//toString
	{
		return(length+" "+breadth);
	}

}

