class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int balance = 0; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                balance++; 
            } else { 
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
              
                    i++; 
                } else {
                    insertions++;
                }

                if (balance > 0) {
                    balance--; 
                } else {
                    insertions++;
                }
            }
        }
        insertions += balance * 2;

        return insertions;
    }
}
