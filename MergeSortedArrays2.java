import java.util.Arrays;

public class MergeSortedArrays2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("Ok");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertPosition = m+n-1;
        int firstArrayIndex = m - 1;
        int secondArrayIndex = n - 1;

        while (secondArrayIndex >= 0) {
            if (nums1[firstArrayIndex] < nums2[secondArrayIndex]) {
                nums1[insertPosition] = nums2[secondArrayIndex];
                secondArrayIndex-=1;
                insertPosition--;
            }
            else {
                nums1[insertPosition] = nums1[firstArrayIndex];
                firstArrayIndex-=1;
                insertPosition--;
            }
        }

    }
}
