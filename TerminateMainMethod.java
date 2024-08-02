public class TerminateMainMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Begins");
		System.out.println("-------------------------");
		int[]x= {10,20,30,40,50};
		int y=2;
		try
		{
			int z=x[2]/0;
			System.out.println(z);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("catch block");
			return;//Main Method termination
		}
		finally //this block of our code will  be executed as the JVM is not terminated
		{
		System.out.println("----------------------------");
		System.out.println("Execution Ends");
		}
	}

}
