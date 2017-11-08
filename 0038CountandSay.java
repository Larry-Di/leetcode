class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res="";
        String last = this.countAndSay(n-1);
        
        for(int i=0;i<last.length();i++){
            int j=1;
            while(i+1<last.length()&&last.charAt(i)==last.charAt(i+1)){
                j++;
                i++;                
            }
            res=res+j+""+last.charAt(i);
        }
        return res;
    }
} 
