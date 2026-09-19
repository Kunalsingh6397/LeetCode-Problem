public class Solution {
    public int numDifferentIntegers(String word) {
                word = word.replaceAll("[a-z]", " ");
        String[] parts = word.trim().split("\\s+");
        
        Set<String> set = new HashSet<>();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                part = part.replaceFirst("^0+", "");
                if (part.isEmpty()) part = "0"; 
                set.add(part);
            }
        }
        
        return set.size();
    }
    
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(sol.numDifferentIntegers("leet1234code234"));
        System.out.println(sol.numDifferentIntegers("a1b01c001"));
    }
}
