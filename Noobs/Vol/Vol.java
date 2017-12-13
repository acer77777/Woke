//@Author: Jack
//@Date
import java.util.Scanner; //Must import this
import javax.swing.JOptionPane;

public class Vol {
  /**<b>Class Description: Driver Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

     String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much " +
            "money you have.\n Please enter only dollars and cents, \n" +
            "For Example: \'\' 14.50 \'\'");
     Double moneyYouHave_double = 0.0;

     try{
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
     }
     catch (NumberFormatException ne1) {
       System.out.println ("Please enter a dolars and cents value\n" +
                           "For example: \' 14.50 \'");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dolars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("User failed a second attempt for " +
                            "the total money to spend");
         System.exit(0);
       }
     }

     double totalMoneyIn = moneyYouHave_double;
     System.out.println("The money to spent here is %.2f" + totalMoneyIn);

     //Double input_double = Double.parseDouble(input_string);

     //System.out.println(input_double+2.50);

     //JOptionPane.showMessageDialog (null, "$" + input_string, "You told me " +
     //           " you have: ", JOptionPane.ERROR_MESSAGE);
     //INFORMATION_MESSAGE
     //ERROR_MESSAGE
     //WARNING_MESSAGE
     //QUESTION_MESSAGE

     //System.out.println("$" + input_double);




   }
}

//Scanner input = new Scanner ( System.in );
//String statement = input.nextLine();

//String input = JOptionPane.showInputDialog ("Press 1 for Monday");
