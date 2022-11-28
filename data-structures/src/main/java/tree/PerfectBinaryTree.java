package tree;

/**
 * theorem for full binary tree
 * no of leaves (i+1) , (n+1)/2
 * no of nodes ( 2i+1) , (2l-1)
 * no of internal nodes (n-1)/2 ,(l-1)
 * no of leaves at most (Math.pow(2,noOfLevels-1)
 */
public class PerfectBinaryTree {
    Node root;

    static int depth(Node node) {
        int d = 0;
        while (node != null) {
            d++;
            node = node.left;
        }
        return d;
    }

    static boolean isPerfectBinaryTree(Node root, int d, int level) {
        if (root == null) {
            return true;
        }
        //depth and level not same?
        if (root.left == null && root.right == null)
            return (d == level + 1);

        if (root.left == null || root.right == null)
            return false;
        return isPerfectBinaryTree(root.left, d, level + 1)
                && isPerfectBinaryTree(root.right, d, level + 1);

    }

    static boolean isPerfectBinaryTree(Node root) {
        int d = depth(root);
        return isPerfectBinaryTree(root, d, 0);
    }


    // Create a new node
    static Node newNode(int k) {
        Node node = new Node();
        node.value = k;
        node.right = null;
        node.left = null;
        return node;
    }

    public static void main(String args[]) {
        Node root = null;
        root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        if (isPerfectBinaryTree(root) == true)
            System.out.println("The tree is a perfect binary tree");
        else
            System.out.println("The tree is not a perfect binary tree");
    }
}
