package concat;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {
  public static int[] concat(int[] a, int[] b) {
      return IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();
  }

  public static void main(String[] args) throws Exception {
      int[] merged1 = Array.concat(new int[]{1,2,3}, new int[]{4,5,6});

      System.out.println(Arrays.toString(merged1));
  }
}

