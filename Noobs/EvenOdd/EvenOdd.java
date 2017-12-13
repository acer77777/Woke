import javax.swing.JOptionPane;


public class EvenOdd{


  public static void main(String[] args){

    String input = JOptionPane.showInputDialog ("Please put a number and I will tell you if it is Even or Odd");
  //  int input = in%1;
  //  if(input == 0){
    int result = Integer.parseInt(input);
    int x = (result % 2);
    if(x == 0){
      System.out.println(input + " is an even number.");
    }else{
      System.out.println(input + " is an odd number.");
    }
//  }else{
    //System.out.println("Please Use A whole number instead of a decimal.");
  //  String in = JOptionPane.showInputDialog ("Please put a number and I will tell you if it is Even or Odd");
//  }

  }
}
