class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int totalel = nums1.length + nums2.length;
        int leftsize = (totalel + 1) / 2;
        int left = 0;
        int right = nums1.length;

        while (left <= right) {
            int cut1 = left + (right - left) / 2;
            int cut2 = leftsize - cut1;
            int l1, l2, r1, r2;
            if (cut1 == 0) {
                l1 = Integer.MIN_VALUE;
            } else {
                l1 = nums1[cut1 - 1];
            }
            if (cut1 == nums1.length) {
                r1 = Integer.MAX_VALUE;
            } else {
                r1 = nums1[cut1];
            }
            if (cut2 == 0) {
                l2 = Integer.MIN_VALUE;
            } else {
                l2 = nums2[cut2 - 1];
            }
            if (cut2 == nums2.length) {
                r2 = Integer.MAX_VALUE;
            } else {
                r2 = nums2[cut2];
            }

            if (l1 <= r2 && l2 <= r1) {
                if (totalel % 2 != 0) {
                    return Math.max(l1, l2);
                }

                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }

            else if (l1 > r2) {
                right = cut1 - 1;
            } else {
                left = cut1 + 1;
            }
        }
        return 0.0;
    }
}