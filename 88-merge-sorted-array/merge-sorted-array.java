class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i = 0;i<nums2.length;i++){
        int temp = nums1[m];
        nums1[m] = nums2[i];
        nums2[i] = temp;
        m++;
        }
        Arrays.sort(nums1);
    }
}