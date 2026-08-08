class Solution { //Pattern: Modular Arithmetic
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            --columnNumber; //for 0 based indexing 
            sb.append((char) (columnNumber%26+'A'));
            columnNumber/=26; //uptading the number
        }return sb.reverse().toString();
    }
}