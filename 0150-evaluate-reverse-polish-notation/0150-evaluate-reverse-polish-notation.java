class Solution {
    
    public int evalRPN(String[] tokens) {
      Set<String>op = new HashSet<String>();
      op.add("+");
      op.add("-");
      op.add("/");
      op.add("*");

      Stack<Integer>st = new Stack<>();

      for(String s:tokens){
          if(op.contains(s)){
              int first = st.pop();
              int second = st.pop();
              if(s.equals("+"))
                st.push(first + second);
              else if(s.equals("-"))
                st.push(second - first);
              else if(s.equals("*"))
                st.push(first * second);
              else
                st.push(second/first);
          }
          else{
              st.push(Integer.parseInt(s));
          }
      }

      return st.peek();   
    }
}