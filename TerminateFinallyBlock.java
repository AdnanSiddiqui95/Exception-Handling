public class TerminateFinallyBlock 
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
			System.exit(0);//JVM termination
		}
		finally //this block of our code will not be executed as the JVM is terminated
		{
		System.out.println("----------------------------");
		System.out.println("Execution Ends");
		}
	}

}
