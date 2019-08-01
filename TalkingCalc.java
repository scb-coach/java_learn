package Learn2;
import java.util.Scanner; 
public class TalkingCalc {
	
	public static void main (String[] args)
	{
		Scanner inputTaker = new Scanner(System.in);
		System.out.println("Enter the first number");
		int first =inputTaker.nextInt();
		System.out.println("Enter the second number");
		int second =inputTaker.nextInt();
		System.out.println ("What operation do you want to execute- Add/Subtract/Divide/Multiply/Exponents");
		String inputCmd = inputTaker.next() ;
	
		if (	   inputCmd.equalsIgnoreCase("Add") 
				|| inputCmd.equalsIgnoreCase("Subtract")
				|| inputCmd.equalsIgnoreCase("Multiply")
				|| inputCmd.equalsIgnoreCase("Divide")
				|| inputCmd.equalsIgnoreCase("Exponents"))
		{	
		
			int result = 0;
			
			if (inputCmd.equalsIgnoreCase("ADD"))
				result =  addNumbers(first,second) ;
			
			if (inputCmd.equalsIgnoreCase("SUBTRACT"))
				result = subtractNumbers(first,second) ;
			
			if (inputCmd.equalsIgnoreCase("multiply"))
				result = multiplyNumbers(first,second) ;
			
			if (inputCmd.equalsIgnoreCase("divide"))
			{
				
				if (second ==0 )
					System.out.println("You cannnot divide by zero");
				else
					result = divideNumbers(first,second);
			}
			
			if (inputCmd.equalsIgnoreCase("Exponents"))
				result = myWayExponets(first,second) ;
				
	
			System.out.println("Result = " + result);			
		}
		else 
			System.out.println ("Invalid Method (YOU STUPID BROOOOO) ");
		
		inputTaker.close();
		
}
	
	
	public static int addNumbers(int first,int second) {
		return first + second;
	
	}
	
	
	
	public static int subtractNumbers(int first,int second) {
		return first - second;
	
	}
	
	
	
	
	public static int multiplyNumbers(int first,int second) {
		return first * second;
	
	}
		
	
	public static int divideNumbers(int first,int second) {
		return first / second;
	
	}
	
	
	
	public static double Exponets(int number,int exponent) {
		
		return Math.pow(number, exponent);
	}
	
	public static int myWayExponets(int base,int power) {
		int result=1; 
		for(int i=1; i<=power; i=i+1)
		{
			result = result * base;
			
		}
		return result; 

	}

}

