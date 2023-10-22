class RandomizedSet {
    Set<Integer>st ;
    public RandomizedSet() {
        st = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
       if(!st.contains(val)){
           st.add(val);
           return true;
       } 
       return false;
    }
    
    public boolean remove(int val) {
        if(st.contains(val)){
            st.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Object []nums= st.toArray();
        // if(nums.length==1)
        //     return(int)nums[0];
        Random rand = new Random();
        int random = rand.nextInt(nums.length);
        return (int)nums[random];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */