class LRUCache {
    ArrayList<int[]> list = new ArrayList<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
        
    }
    
    public int get(int key) {
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i)[0]  == key){
                int value = list.get(i)[1];

                list.remove(i);
                list.add(new int [] {key , value});

                return value;
                
            }
        }
            return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i)[0]  == key){

                list.remove(i);
                list.add(new int [] {key , value});

                return;
                
            }
        }
        if(list.size()==capacity){
            list.remove(0);
        }
         list.add(new int [] {key , value});
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */