class Solution {
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    public int maximumPrimeDifference(int[] nums) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                if (first == -1) first = i; 
                last = i;                    
            }
        }
        if (first == -1 || last == -1 || first == last) return 0;

        return last - first;
    }
}
