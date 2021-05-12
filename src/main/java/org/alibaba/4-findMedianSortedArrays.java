package org.alibaba;

class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1Length = nums1.length;
        int n2Length = nums2.length;
        int[] nums = new int[n1Length + n2Length];

        if (n1Length == 0) {
            if (n2Length % 2 == 0) {
                return (nums2[n2Length / 2 - 1] + nums2[n2Length / 2]) / 2.0;
            } else {
                return nums2[n2Length / 2];
            }
        }
        if (n2Length == 0) {
            if (n1Length % 2 == 0) {
                return (nums1[n1Length / 2 - 1] + nums1[n1Length / 2]) / 2.0;
            } else {
                return nums1[n1Length / 2];
            }
        }

        int count = 0;
        int n1Index = 0, n2Index = 0;
        while (count != (n1Length + n2Length)) {
            if (n1Index == n1Length) {
                while (n2Index != n2Length) {
                    nums[count++] = nums2[n2Index++];
                }
                break;
            }
            if (n2Index == n2Length) {
                while (n1Index != n1Length) {
                    nums[count++] = nums1[n1Index++];
                }
                break;
            }

            if (nums1[n1Index] < nums2[n2Index]) {
                nums[count++] = nums1[n1Index++];
            } else {
                nums[count++] = nums2[n2Index++];
            }
        }

        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }
}
