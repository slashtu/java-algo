package add;

public class Add {
  public int add(int a, int b) {
      return a + b;
  }

  public static void main(String[] args) throws Exception {
      Add add = new Add();

      int res = add.add(4, 5);

      System.out.println(res);
  }
}

