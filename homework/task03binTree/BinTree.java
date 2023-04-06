package homework.task03binTree;

public class BinTree {
    Node root;
    public BinTree() {
        root = null;
    }
    public void insert(int value) {
        root = insertRec(root, value);
    }
    public Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data)
            root.left = insertRec(root.left, value);
        else if (value > root.data)
            root.right = insertRec(root.right, value);
        return root;
    }
    public void inorderTraversal() {
        inorderTraversalRec(root);
    }
    public void inorderTraversalRec(Node root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);

        tree.inorderTraversal(); // 1 3 5 7 9
    }
}
