class BTree {

    int[] keys = new int[10];
    int size = 0;

    void insert(int key) {
        keys[size++] = key;
    }

    boolean search(int key) {

        for(int i=0;i<size;i++)
            if(keys[i] == key)
                return true;

        return false;
    }
}