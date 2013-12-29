import java.util.Stack;

public class Parentheses
{
	public static void main(String[] args)
	{
		String parentheses = args[0];
		Stack<Integer> s = new Stack<Integer>();
		char[] parenthsArray = parentheses.toCharArray();
		for (int i = 0; i < parenthsArray.length; i++) {
			if (parenthsArray[i] == '(') {
				s.push(0);
			}
			else if (parenthsArray[i] == ')') {
				if (s.size() > 0) {
					s.pop();
				}
				else {
					System.out.println("Not balanced correctly! Position=" + i);
					System.exit(1);
				}
			}
		}
		System.out.println("Balanced correctly!");
	}
}