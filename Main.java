public class Main {

    public static void main(String[] args) {

        // ---------------- BST ----------------

        System.out.println("BST Operations");

        BST bst = new BST();
        BSTNode bstRoot = null;

        bstRoot = bst.insert(bstRoot, 50);
        bstRoot = bst.insert(bstRoot, 30);
        bstRoot = bst.insert(bstRoot, 70);

        System.out.println("Search 30: "
                + bst.search(bstRoot, 30));

        // ---------------- AVL ----------------

        System.out.println("\nAVL Operations");

        AVL avl = new AVL();

        AVLNode root = null;

        root = avl.insert(root, 30);
        root = avl.insert(root, 20);
        root = avl.insert(root, 10);

        System.out.println(
                "AVL Tree created with LL Rotation");

        // ---------------- B-Tree ----------------

        System.out.println("\nB-Tree Operations");

        BTree btree = new BTree();

        btree.insert(100);
        btree.insert(200);
        btree.insert(300);

        System.out.println(
                "Search 200: "
                + btree.search(200));

        // ---------------- B+ Tree ----------------

        System.out.println("\nB+ Tree Operations");

        BPlusTree bplus = new BPlusTree();

        bplus.insert(1, "Java");
        bplus.insert(2, "Python");
        bplus.insert(3, "C++");

        System.out.println(
                "Book ID 2 : "
                + bplus.search(2));

        System.out.println("\nProgram Executed Successfully");
    }
}
