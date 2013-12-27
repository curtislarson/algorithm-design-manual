public class IntegerDivision
{
	public static void main(String[] args)
	{
		int numerator = Integer.parseInt(args[0]);
		int denom = Integer.parseInt(args[1]);
		int result = 0;
		while(numerator >= denom)
		{
			numerator -= denom;
			result++;
		}

		System.out.println("The division result is " + result);
	}
}