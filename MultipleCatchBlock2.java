public class MultipleCatchBlock2 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Begins");
		System.out.println("-------------------------");
		int[]x= {10,20,30,40,50};
		int y=2;
		try
		{
			int z=x[6]/2;
			System.out.println(z);
		}// This catch block will be execute as index 6 is not present
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			
		}
		finally //this block of our code will be executed when the program is terminated
		{
		System.out.println("----------------------------");
		System.out.println("Execution Ends");
		}
	}

}
