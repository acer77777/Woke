import java.util.Scanner;

public class TestingS{
  public static void main(String[] args){
    System.out.println("Type Something");
    Scanner input = new Scanner(System.in);
    String statement = input.nextLine();
    
    System.out.println(statement);
  }
}
