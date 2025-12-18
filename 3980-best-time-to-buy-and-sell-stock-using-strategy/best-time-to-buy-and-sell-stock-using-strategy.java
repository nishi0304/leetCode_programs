class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        long originalProfit = 0;
        for (int i = 0; i < n; i++) {
            originalProfit += (long) strategy[i] * prices[i];
        }

        
        long[] A = new long[n]; 
        long[] B = new long[n]; 
        for (int i = 0; i < n; i++) {
            A[i] = (long) strategy[i] * prices[i];
            B[i] = (long) (1 - strategy[i]) * prices[i];
        }

        int half = k / 2;

       
        long sumA = 0, sumB = 0;
        for (int i = 0; i < half; i++) sumA += A[i];
        for (int i = half; i < k; i++) sumB += B[i];

        long maxGain = -sumA + sumB;

    
        for (int l = 1; l + k <= n; l++) {
        
            sumA -= A[l - 1];
            sumB -= B[l + half - 1];
            sumA += A[l + half - 1];
            sumB += B[l + k - 1];

            long gain = -sumA + sumB;
            maxGain = Math.max(maxGain, gain);
        }

        return originalProfit + Math.max(0, maxGain);
    }
}
