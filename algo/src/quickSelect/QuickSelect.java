package quickSelect;

import java.util.Arrays;

public class QuickSelect {
    public static void swap(int p, int q, int[] nums) {
        int tmp = nums[p];

        nums[p] = nums[q];
        nums[q] = tmp;
    }

    public static int partition(int start, int end, int[] nums) {
        int left = start;

        int pivot = nums[end];

        for (int i = start ; i < end ; i++) {
            int n = nums[i];

            if (n < pivot) {
              swap(i, left, nums);
              left++;
            }
        }

        swap(left, end, nums);

        return left;
    }  

    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{2,4,5,6,1,3, 10};

        int p = partition(2, arr.length - 1, arr);

        System.out.println(p);
        System.out.println(Arrays.toString(arr));
    }
}
