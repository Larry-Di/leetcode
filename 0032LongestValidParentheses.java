public class Solution { 
    public int longestValidParentheses(String s) {
        if(s.length()==0) return 0;        
        Stack<String> st = new Stack<String>();
        for(int i=0;i<s.length();i++){
            char tmp = s.charAt(i);
            if(tmp==')' && !st.empty() && st.peek().charAt(0)=='('){
                st.pop();
                continue;    
            }
            st.push(tmp+""+i);
        }        
        if(st.empty()) return s.length();
        int length = 0;
        int last = s.length();
        while(!st.empty()){    
            int n = Integer.valueOf(st.pop().substring(1));             
            length = last-n-1>length?last-n-1:length;
            last = n;            
        }
        length = last>length?last:length;
        return length;
    }
}
