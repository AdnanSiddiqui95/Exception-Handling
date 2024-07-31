import java.util.Scanner;
public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Begin");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number:");
		int num2=sc.nextInt();
		System.out.println("------Divide Operation Result--------");
		try 
		{
			int res1=num1/num2;
			System.out.println(res1);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("------Multiply Operation Result--------");
		int res2=num1*num2;
		System.out.println(res2);
		System.out.println("------Add Operation Result--------");
		int res3=num1+num2;
		System.out.println(res3);
		System.out.println("------Sub Operation Result--------");
		int res4=num1-num2;
		System.out.println(res4);
		System.out.println("Execution Ends");
	}

}
