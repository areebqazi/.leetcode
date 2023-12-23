class LRUCache {

    HashMap<Integer,Node>map= new HashMap<>();
    int capacity;
    Node left ;
    Node right;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        left = new Node();
        right = new Node();
        left.next = right;
        right.prev = left;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            delete(temp);
            add(temp);
            return temp.value;
        }
            return -1;
    }
    
    public void put(int key, int value) {
       if(map.containsKey(key)){
           Node temp = map.get(key);
           delete(temp);
           temp.value= value;
           add(temp);
       } else {
           if(map.size() == capacity){
               map.remove(left.next.key);
               delete(left.next);
           }
           Node node = new Node();
           node.key = key;
           node.value = value;
           map.put(key,node);
           add(node);
       }
    }
    
    public void add(Node node){
        Node prev = right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = right;
        right.prev = node;
    }
    
    public void delete(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    class Node {
        int key ;
        int value ;
        Node next ; 
        Node prev;        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */