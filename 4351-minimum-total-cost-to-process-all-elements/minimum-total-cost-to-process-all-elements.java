class Solution {
    public int minimumCost(int[] nums, int k) {
        final long MOD = 1_000_000_007L;
        final long INV2 = 500000004L; 

        long cost = 0;
        long operationNumber = 1;
        long resources = k;

        for (int x : nums) {

            if (resources < x) {
                long need = x - resources;

                long operations = (need + k - 1L) / k;

                long first = operationNumber;
                long last = operationNumber + operations - 1;

           
                long a = (first + last) % MOD;
                long b = operations % MOD;

                long sum = (((a * b) % MOD) * INV2) % MOD;

                cost = (cost + sum) % MOD;

                operationNumber += operations;
                resources += operations * (long) k;
            }

            resources -= x;
        }

        return (int) cost;
    }
}

 