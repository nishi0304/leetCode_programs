class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] prefixOnes = new int[n + 1];
        int[] suffixZeros = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (s.charAt(i) == '1' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            suffixZeros[i] = suffixZeros[i + 1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int minFlips = n;
        for (int i = 0; i <= n; i++) {
            int flips = prefixOnes[i] + suffixZeros[i];
            minFlips = Math.min(minFlips, flips);
        }
        return minFlips;
    }
}
