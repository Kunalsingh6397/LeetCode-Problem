class Solution {

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num % 2 == 0) return num == 2;
        int sqrt = (int)Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

  
    private boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public int primePalindrome(int n) {
        if (n <= 11 && n >= 8) return 11;

        for (int x = n; ; x++) {
            if (isPalindrome(x) && isPrime(x)) {
                return x;
            }
            
            if (x > 11 && Integer.toString(x).length() % 2 == 0) {
                x = (int)Math.pow(10, Integer.toString(x).length()) - 1;
            }
        }
    }
}
