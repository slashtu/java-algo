package sort;

import java.util.Arrays;

public class Sort {
    public void arraySort() {
        Integer[] arr = new Integer[]{10, 1,2,3,4,5,6};

        Arrays.sort(arr, (a, b) -> b - a);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) throws Exception {
        Sort s = new Sort();
        s.arraySort();
    }
}
