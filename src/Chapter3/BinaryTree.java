public class BinaryTree
{
	public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.run();
    }

    BinaryTree()
    {

    }

    public void run()
    {
        Node root = new Node(10);
        insert(root, new Node(1));
        insert(root, new Node(3));
        insert(root, new Node(12));
        insert(root, new Node(4));

        printInorder(root);
    }

    public void insert(Node parent, Node newNode)
    {
        if (parent == null) {
            System.out.println("This should never happen");
            return;
        }

        if (parent.getData() > newNode.getData()) {
            if (parent.getLeft() != null) {
                insert(parent.getLeft(), newNode);
            }
            else {
                parent.setLeft(newNode);
                System.out.println("Set parent node " + parent + " left to " + newNode);
            }
        }
        else if (parent.getData() <  newNode.getData()) {
            if (parent.getRight() != null) {
                insert(parent.getRight(), newNode);
            }
            else {
                parent.setRight(newNode);
                System.out.println("Set parent node " + parent + " right to " + newNode);
            }
        }
    }


    public void printInorder(Node n)
    {
        if (n != null) {
            printInorder(n.getLeft());
            System.out.println(n.getData());
            printInorder(n.getRight());
        }
    }

    private class Node
    {
        Node mLeft = null;
        Node mRight = null;
        int mData = -1;

        Node(int data)
        {
            mData = data;
        }

        int getData()
        {
            return mData;
        }

        void setLeft(Node left)
        {
            mLeft = left;
        }

        void setRight(Node right)
        {
            mRight = right;
        }

        Node getLeft()
        {
            return mLeft;
        }

        Node getRight()
        {
            return mRight;
        }

        @Override
        public String toString() {
            return "" + mData;
        }
    }
}