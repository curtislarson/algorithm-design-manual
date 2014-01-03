public class ReverseString
{
	public static void main(String[] args)
	{
		String stringToReverse = args[0];
		String reversedString = reverse(stringToReverse);

		System.out.println("Original String: " + stringToReverse + "\nReversed String: " + reversedString);
	}

	public static String reverse(String stringToReverse)
	{
		char[] charArray = stringToReverse.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];
			charArray[charArray.length - i - 1] = temp;
		}
		String reversedString = new String(charArray);
		String[] words = reversedString.split(" ");
		StringBuffer returnString =  new StringBuffer();
		for (String word : words) {
			char[] wordCharArray = word.toCharArray();
			for (int i = 0; i < wordCharArray.length / 2; i++) {
				char temp = wordCharArray[i];
				wordCharArray[i] = wordCharArray[wordCharArray.length - i - 1];
				wordCharArray[wordCharArray.length - i - 1] = temp;
			}
			returnString.append(wordCharArray);
			returnString.append(" ");
		}
		returnString.deleteCharAt(returnString.length() - 1);
		return returnString.toString();
	}
}