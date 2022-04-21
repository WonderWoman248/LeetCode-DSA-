class MyHashSet {
    boolean mySet[]=new boolean[1000002];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
       mySet[key]=true; 
    }
    
    public void remove(int key) {
       
            mySet[key]=false;
    }
    
    public boolean contains(int key) {
       return mySet[key]; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */