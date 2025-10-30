class Solution {
    public String reverseWords(String s) {
        
        String[] sb = s.trim().split("\\s+");
        String output = "";
        for (int i = sb.length - 1; i >= 0; i--) {
            output += sb[i];
            if (i > 0) output += " ";
        }
        
        return output;
    }
}
