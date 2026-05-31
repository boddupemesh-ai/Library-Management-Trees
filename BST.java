class BSTNode {
    int bookId;
    BSTNode left, right;

    BSTNode(int id) {
        bookId = id;
    }
}

class BST {

    BSTNode insert(BSTNode root, int id) {

        if (root == null)
            return new BSTNode(id);

        if (id < root.bookId)
            root.left = insert(root.left, id);
        else
            root.right = insert(root.right, id);

        return root;
    }

    boolean search(BSTNode root, int id) {

        if (root == null)
            return false;

        if (root.bookId == id)
            return true;

        return id < root.bookId ?
                search(root.left, id)
                : search(root.right, id);
    }
}
    
