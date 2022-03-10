package tree;

public class TreeTravesal {
    Node root;

    TreeTravesal() {
        root = null;
    }

    void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " -> ");
    }

    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " -> ");
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " -> ");
        inOrder(node.left);
        inOrder(node.right);
    }

    public static void main(String[] args) {
        TreeTravesal tree = new TreeTravesal();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        tree.inOrder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postOrder(tree.root);
    }
}

//applications
//AVL tree
//binary tree search
