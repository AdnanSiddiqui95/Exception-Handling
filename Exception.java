import java.util.Scanner;
public class Exception 
{
	//Enter first number: 10
	//Enter Second number: 0
	//------Divide Operation Result--------
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//	at Exception.main(Exception.java:13)
	
	public static void main(String[] args) 
	{
		System.out.println("Execution Begin");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number:");
		int num2=sc.nextInt();
		System.out.println("------Divide Operation Result--------");
		int res1=num1/num2;
		System.out.println(res1);
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
