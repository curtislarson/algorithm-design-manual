import java.util.LinkedList;
import java.util.ListIterator;

public class MiddleNode
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(2);
        ll.add(73);
        ll.add(39);
        ll.add(21);
        ll.add(8901);

        System.out.println("The middle node is " + middleNode(ll));
	}

    public static Integer middleNode(LinkedList<Integer> ll)
    {
        // Since the built in linked list for Java makes this to easy,
        // lets use the list iterator.
        // Assume no duplicate values
        // 1 2 3 4 5 6 7 8 9
        // 1 1 2 2 3 3 4 4 5
        boolean hasSize = false;
        if (hasSize) {
            ListIterator<Integer> iterator = ll.listIterator(0);
            ListIterator<Integer> endIterator = ll.listIterator(ll.size());

            while (iterator.hasNext() && endIterator.hasPrevious()) {
                int first = iterator.next();
                int second = endIterator.previous();
                if (first == second) {
                    return first;
                }
            }
        }
        else {
            // This is if we don't know about size.
            ListIterator<Integer> iterator = ll.listIterator(0);
            int prevIndexCount = 0;
            int indexCount = 1;
            int index = 1;
            int currentMiddle = -1;
            ListIterator<Integer> middleIterator = ll.listIterator(0);
            while(iterator.hasNext()) {
                index++;
                int next = iterator.next();
                if (index % 2 != 0) {
                    indexCount++;
                }
                if (prevIndexCount != indexCount) {
                    // We know that we need to update the currentMiddle
                    currentMiddle = middleIterator.next();
                }

                prevIndexCount = indexCount;
            }
            return currentMiddle;
        }
        return -1;
    }
}