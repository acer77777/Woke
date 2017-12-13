/** <h1>Hello World</h1>
*<b>Purpose of the Project</b><br>
*<p>Working with CMD, file folders, and Atom</p><br>
*<b>How to start the program</b><br>
*<p>Use the Compiler and run the bytcode</p><br>
*<br>
*@author Jack Duckworth
*@version v1.0
*@since 2017-11-15
*/

public class HelloWorld_CMD {






/**<b>Class Description: Beginning Template</b><br>
*<p>Outputs message</p>
*@param
*@return
*@throws
**/


/**<b>Class Description: Beginning Template</b><br>
*<p>Outputs message</p>
*@param args unused
*@return void
*@throws
**/

public static void main (String[] args)
  throws ArrayIndexOutOfBoundsException{
    try{
      while(args[0]==""){}
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("You must use arguments, try again with arguments");
      System.exit(0);
    }
  }
}
  System.out.println("Doing Stuff");
  for(int i=0; i<args.length; i++){
    System.out.println("Args [" + i + "]: " + args[i]);
  }
    System.out.println("Done.");
}
}
