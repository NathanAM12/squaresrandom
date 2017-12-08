import java.util.Random;

public class squaresrandom {
  public static void main(String args[]) {
    Random rand = new Random();
    for (int i = 1; i <= 10; i++) {
      int n = rand.nextInt(i*i) + 1;
      System.out.println(i + "\t" + i*i + "\t" + n);
    }
  }
}
