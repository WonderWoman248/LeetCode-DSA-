class Trie{
    class Node{
        boolean isWord=false;
        List<Node>children=Arrays.asList(new Node[26]);
    };
    Node root,curr;
    List<String>result;
    
    void dfs(Node curr, String word){
        if(result.size()==3)return;
        
        if(curr.isWord)
            result.add(word);
        
        for(char A='a';A<='z';A++){
            if(curr.children.get(A-'a')!=null){
                dfs(curr.children.get(A-'a'),word+A);
            }
        }
    }
    
    Trie(){
        root=new Node();
    }
    
    void insert(String s){
        curr=root;
        
        for(char c:s.toCharArray()){
            if(curr.children.get(c-'a')==null){
                curr.children.set(c-'a',new Node());
            }
            curr=curr.children.get(c-'a');
        }
        
        curr.isWord=true;
    }
    
    List<String>getWords(String prefix){
        curr=root;
        result=new ArrayList<String>();
        
        for(char c: prefix.toCharArray()){
            if(curr.children.get(c-'a')==null)
                return result;
            curr=curr.children.get(c-'a');
        }
        dfs(curr,prefix);
        return result;
    }
};
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie=new Trie();
        List<List<String>>res=new ArrayList<>();
        
        for(String w:products){
            trie.insert(w);
        }
        
        String prefix=new String();
        
        for(char c:searchWord.toCharArray()){
            prefix+=c;
            res.add(trie.getWords(prefix));
        }
        return res;
    }
}