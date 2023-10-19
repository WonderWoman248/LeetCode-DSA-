class Solution {
    private String afterBackspace(String s){
         Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#')
                st.add(s.charAt(i));
            else{
                if(!st.empty())
                    st.pop();
            }
        }
        String sN ="";
        while(!st.empty()){
            sN+=st.peek();
            st.pop();
        }
        return sN;
    }
    public boolean backspaceCompare(String s, String t) {
        String sN = afterBackspace(s);
        String tN = afterBackspace(t);
        System.out.println(sN+"->"+tN);
       return afterBackspace(s).equals(afterBackspace(t));
    }
}