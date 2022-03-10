package tree;

public class CompleteBinaryTree {

    Node root;

    int countNumberNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return (1 + countNumberNodes(root.left) + countNumberNodes(root.right));
    }

    boolean isCompleteBinaryTree(Node node, int index, int numOfNodes) {
        if (root == null) {
            return true;
        }

        if (index >= numOfNodes) {
            return false;
        }

        return (isCompleteBinaryTree(root.left, 2 * index + 1, numOfNodes)
                && isCompleteBinaryTree(root.right, 2 * index + 2, numOfNodes));

    }

    public static void main(String args[]) {
        CompleteBinaryTree tree = new CompleteBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(6);

        int node_count = tree.countNumberNodes(tree.root);
        int index = 0;

        if (tree.isCompleteBinaryTree(tree.root, index, node_count))
            System.out.println("The tree is a complete binary tree");
        else
            System.out.println("The tree is not a complete binary tree");
    }

}
