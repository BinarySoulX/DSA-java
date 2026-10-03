class Solution { //Pattern: Recursion/Backtracking
    private static List<String> solve(int open,int close,StringBuilder sb,ArrayList<String> list){
        if(open==0 && close==0){  //base case 
            list.add(sb.toString());
            return list;
        }
        if(open>0){
            sb.append( '(' );
            solve(open-1,close,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close>open){
            sb.append( ')' );
            solve(open,close-1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        return list;
    }
    public List<String> generateParenthesis(int n) {
        return solve(n,n,new StringBuilder(),new ArrayList<>());
    }
}