class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int lo = 0;
        int hi = m;

        while (lo <= hi) {

            int i = (lo + hi) / 2; // Partition nums1
            int j = (m + n + 1) / 2 - i; // Partition nums2

            int left1  = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int right1 = (i < m) ? nums1[i] : Integer.MAX_VALUE;

            int left2  = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int right2 = (j < n) ? nums2[j] : Integer.MAX_VALUE;

            // Correct partition
            if (left1 <= right2 && left2 <= right1) {
                // Odd total length
                if ((m + n) % 2 == 1){
                    return Math.max(left1, left2);
                }

                // Even total length
                return (Math.max(left1, left2)
                        + (long) Math.min(right1, right2)) / 2.0;
            }

            // nums1 partition is too far right
            if (left1 > right2) {
                hi = i - 1;
            }

            // nums1 partition is too far left
            else {
                lo = i + 1;
            }
        }

        return 0.0; // Unreachable for valid input
    }
}