import java.util.TreeMap;

class BPlusTree {

    TreeMap<Integer,String> books =
            new TreeMap<>();

    void insert(int id, String name) {
        books.put(id, name);
    }

    String search(int id) {
        return books.get(id);
    }
}