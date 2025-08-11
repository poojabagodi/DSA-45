package DAY40;

public class LeafNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public int sumOfLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }

    public static void main(String[] args) {
        LeafNodes tree = new LeafNodes();

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        int sum = tree.sumOfLeafNodes(root);
        System.out.println("Sum of leaf nodes: " + sum);
    }
}

