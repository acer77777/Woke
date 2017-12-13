import java.util.Random;
public class SquareRandom{
  public static void main(String[] args){
    int i = 1;
    int w = 1;
    Random rand = new Random();
    for(i = 1; i <= 10; i++){
      System.out.println(i + " :Number");
      double m = Math.pow(i, 2);
      int c = (int)m;
      System.out.println(c + " :Number Squared");
      int  n = rand.nextInt(c) + 1;
      System.out.println(n + " :Random Number between 1 and Number");
      System.out.println("\n");
    }
  }
}
