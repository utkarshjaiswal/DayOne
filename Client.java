class Client
{
	public static void main(String args[])
	{
		Circle circle = new Circle();
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle();
		circle2.areaCircle(9);
		System.out.println(Circle.getCount());
	}
	
	
	/*public static void main(String args[])
	{
		Date date = new Date();
		date.setDate(12,12,2000);
		date.setDay(18);
		System.out.println(date.getDay());
		date.getDate();
	}


	public static void main(String args[])
	{
		Account account = new Account();
		Account account1 = new Account("utkarsh",12345,500);
		System.out.println(Account.getCount());

		
	}

	public static void main(String args[])
	{
		Math math=new Math();
		System.out.println(math.add(10,30));
		System.out.println(math.add(10,30));


	}


	public static void main(String args[])
	{
		Rectangle rectangle=new Rectangle(5,7);
		System.out.println(rectangle);
		


	}*/
}