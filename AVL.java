class AVLNode {

    int key;
    int height;
    AVLNode left, right;

    AVLNode(int key) {
        this.key = key;
        this.height = 1;
    }
}

public class AVL {

    // Height of node
    int height(AVLNode node) {
        return (node == null) ? 0 : node.height;
    }

    // Maximum of two numbers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Balance factor
    int getBalance(AVLNode node) {

        if (node == null)
            return 0;

        return height(node.left) - height(node.right);
    }

    // Right Rotation (LL Case)
    AVLNode rightRotate(AVLNode y) {

        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left),
                height(y.right)) + 1;

        x.height = max(height(x.left),
                height(x.right)) + 1;

        return x;
    }

    // Left Rotation (RR Case)
    AVLNode leftRotate(AVLNode x) {

        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left),
                height(x.right)) + 1;

        y.height = max(height(y.left),
                height(y.right)) + 1;

        return y;
    }

    // Insert Node
    AVLNode insert(AVLNode node, int key) {

        if (node == null)
            return new AVLNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);

        else if (key > node.key)
            node.right = insert(node.right, key);

        else
            return node;

        node.height = 1 + max(
                height(node.left),
                height(node.right));

        int balance = getBalance(node);

        // LL Rotation
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // RR Rotation
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // LR Rotation
        if (balance > 1 && key > node.left.key) {

            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Rotation
        if (balance < -1 && key < node.right.key) {

            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Search Node
    boolean search(AVLNode root, int key) {

        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return search(root.left, key);

        return search(root.right, key);
    }

    // Inorder Traversal
    void inorder(AVLNode root) {

        if (root != null) {

            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}