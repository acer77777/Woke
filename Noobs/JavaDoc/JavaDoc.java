/**<h1>Project Title: AddNum</h1>
*<b>Purpose of the Project</b><br>
*<p>Supply CMD line arguments and change string to ints</p><br>
*<b>How to start the program</b><br>
*<p>Use the Compiler and run the bytcode</p><br>
*<br>
*@author Jack Duckworth
*@version v1.0
*@since 2017-11-17
**/


public class JavaDoc{


  /**<b>Class Description: Required Class</b><br>
  *<p>Outputs sum of two numbers</p>
  *@param
  *@return
  *@throws
  **/

  /**<b>Method Description: addNum is adder</b><br>
  *<p>Adds two nums</p>
  *@param numA/numB holding two nums
  *@return sum of two nums
  *@throws
  **/


public int addNum(int numA, int numB){
return numA +numB;
}

/**<b>Method Description: Driver</b><br>
*<p>Collecting two nums in args</p>
*@param args[0]/args[1] getting two nums
*@return N/A
*@throws
*@exception NumberFormatExcemption args is not a number
**/


public static void main(String args[]) throws NumberFormatException {
  try{
    for(int i=0; i<args.length; i++){
    System.out.println("Args [" + i + "]: " + args[i]);
  }//Not Needed debugging only
  int numA = Integer.parseInt(args[0]);
  int numB = Integer.parseInt(args[1]);
  JavaDoc obj = new JavaDoc();
  int sum = obj.addNum(numA, numB);
  System.out.println("Sum of " + args[0] + " and " + args[1] + " is " + sum);
}
catch(NumberFormatException nfe){
  //Tell user to use a number not letter
  System.out.println("Put a number not a letter Scrub");
  System.exit(1);
}
}
}
