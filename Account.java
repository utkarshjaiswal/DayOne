public class Account
{

	private String accountHolderName;  		//instance
	private int accountNumber;	  		//instance
	private double balance;				//instance	
	private static int count;			//class

	public Account() 				//Default Constructor
	{
		accountHolderName="ram";  
		accountNumber=1;
		balance=1;
		count++;		
	
	}

	
	public Account(String n,int a,double b)	   	//Paramatrize Constructor
	{
		accountHolderName=n;  
		accountNumber=a;
		balance=b;
		count++;		
	
	}


	
	public void setAccountNumber(int a)   	 	//setter 
	{
		accountNumber= a;
		
		
	}

	public void setAccountHolderName(String a)    	//setter 
	{
		accountHolderName= a;
				
	}

	public void setBalance(double a)    		//setter 
	{
		balance= a;
	
		
	}


	public void setAccountDetail(String n, int a , int c)  //setter
	{
		accountHolderName = n;
		accountNumber= a;
		balance=c;
		
	}


	public void getAccountDetail()			//getter
	{
		System.out.println(accountHolderName +" :: "+accountNumber+" :: "+balance);
	}

	public int getAccountNumber()			//getter
	{
		return accountNumber;
	}

	public String getAccountHolderName()		//getter
	{
		return accountHolderName;
	}
	
	public double getAccountBalance()		//getter
	{
		return balance;
	}
	
	public void withdrawlAmount(int b)		//Bussiness Logic
	{
		if(b<balance){
		balance= balance-b;
		System.out.println(balance);
		}
		else
		System.out.println("Withdrawl not possible due to insufficient fund");

	}

	public void depositAmount(int b)		//Bussiness Logic
	{
		balance= balance+b;
		System.out.println(balance);
	}

	public static int getCount()			//Object Creation Count
	{
		return count;
	}

	public String toString()			//toString
	{
		return accountNumber+" "+accountHolderName+" "+balance;
	}
	
}