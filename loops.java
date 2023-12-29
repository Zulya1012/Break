public class loops {
  public static void main(String[] arg) {
    for (int i = 1; i <= 3; i++) {
      System.out.println(i);
      for (int a = 1; a <= 10; a++) {
        System.out.println(a);
        if (a == 2)
          break;
      }
    }
  }
}
