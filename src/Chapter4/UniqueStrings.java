import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UniqueStrings
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("B");
		list.add("E");
		list.add("A");
		list.add("E");

		// So we can do this a few ways.
		// We can hash the string values and check to see if they exist but
		// that could be costly and there could always be collisions.

		// Or we could sort and then go through them since we know that unique
		// ones will not have a following item.

		Collections.sort(list);

		Iterator<String> firstIt = list.iterator();
		Iterator<String> secondIt = list.iterator();
		String first = secondIt.next();
		Iterator<String> thirdIt = list.iterator();
		thirdIt.next();
		String second = thirdIt.next();

		if (!first.equals(second)) {
			System.out.println(first);
			if (!thirdIt.hasNext()) {
				System.out.println(second);
				return;
			}
		}

		// We could do a check here for an array of < 4 elements
		// but for now we are going to assume > 4

		String firstValue = "";
		String secondValue = "";
		String thirdValue = "";
		while (thirdIt.hasNext()) {
			firstValue = firstIt.next();
			secondValue = secondIt.next();
			thirdValue = thirdIt.next();

			if (!secondValue.equals(firstValue) && !secondValue.equals(thirdValue)) {
				System.out.println(secondValue);
			}
		}

		if (!thirdValue.equals(secondValue)) {
			System.out.println(thirdValue);
		}

	}
}