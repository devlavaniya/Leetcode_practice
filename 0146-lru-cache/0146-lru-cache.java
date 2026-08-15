class LRUCache {
    // ArrayList<int[]> list = new ArrayList<>();
    // int capacity;
    // public LRUCache(int capacity) {
    //     this.capacity = capacity;
    //     list = new ArrayList<>();
        
    // }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> map = new HashMap<>();

    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);

    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);

        remove(node);
        add(node);

        return node.value;
       
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;

            remove(node);
            add(node);
            return ;
        }
        Node node = new Node(key , value);
        add(node);
        map.put(key , node);

        if(map.size() > capacity){
            Node lru = head.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
    private void add(Node node){
        Node last = tail.prev;
        last.next = node;
        node.next = tail;
        node.prev = last;
        tail.prev = node;
    }
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */