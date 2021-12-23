package add;

import java.util.HashMap;
import java.util.Map;

public class Add {
  public int add(int a, int b) {
      return a + b;
  }

  public static void main(String[] args) throws Exception {
      Map<Integer, Integer> map = new HashMap<>();

      map.put(1,1);

      Map<Integer, Integer> tmp = new HashMap(map);

      tmp.put(1,0);

      System.out.println(map);
  }
}

