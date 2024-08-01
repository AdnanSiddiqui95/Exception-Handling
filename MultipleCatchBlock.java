public class MultipleCatchBlock 
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
		}// This catch block will be execute as we are trying to divide the index 2 value with 0
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
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
