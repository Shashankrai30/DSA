package Tree;

public class deletionandinsertionBST {
    static class Node {
        int key;
        Node left, right;
        Node(int key) { this.key = key; }
    }

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key) node.left = insertRec(node.left, key);
        else if (key > node.key) node.right = insertRec(node.right, key);
        // ignore duplicates
        return node;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node node, int key) {
        if (node == null) return null;

        if (key < node.key) {
            node.left = deleteRec(node.left, key);
        } else if (key > node.key) {
            node.right = deleteRec(node.right, key);
        } else {

            if (node.left == null) return node.right;        // case: only right or no child
            else if (node.right == null) return node.left;   // case: only left child

            // case: two children -> replace with inorder successor (min in right subtree)
            node.key = minValue(node.right);
            node.right = deleteRec(node.right, node.key);
        }
        return node;
    }

    private int minValue(Node node) {
        int min = node.key;
        while (node.left != null) {
            node = node.left;
            min = node.key;
        }
        return min;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.key + " ");
        inorderRec(node.right);
    }

    public static void main(String[] args) {
        deletionandinsertionBST tree = new deletionandinsertionBST();
        // Insert
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.print("Inorder: ");
        tree.inorder(); // 20 30 40 50 60 70 80

        // Delete leaf
        tree.delete(20);
        System.out.print("After delete 20: ");
        tree.inorder();

        // Delete node with one child
        tree.delete(30);
        System.out.print("After delete 30: ");
        tree.inorder();

        // Delete node with two children
        tree.delete(50);
        System.out.print("After delete 50: ");
        tree.inorder();
    }
}

