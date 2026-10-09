class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        boolean tracker=false;int count=0;
        for(int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if( !tracker && ch=='('){
                tracker=true;
            }else if(count==0 && ch==')'){
                tracker=false;
            }else{
                sb.append(ch);
                count+=(ch=='(')? 1 : -1;
            }
        }return sb.toString();
    }
}