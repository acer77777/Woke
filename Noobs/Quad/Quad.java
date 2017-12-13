import java.util.*; //Imports scanner and other needed items

public class Quad{

    private int divisor (int numA) {
  return 2*numA;
    }
    private int discriminate(int numA, int numB, int numC){
      return (numB*numB)-(4*numA*numC); //negatives are -1

    }
    private int negativeB(int numB) {
      return -1*numB;
    }

public static void main (String[] args) throws NumberFormatException {

  System.out.println("Welcome to my Quad Analyzer.\n" +
                     "Just so you know, we use that ax^2 + bx +c = 0 thing");

  Scanner input = new Scanner (System.in);
  System.out.println("Type an 'A' value.");
  String stringA = input.nextLine();
  stringA = stringA.trim();
int numA = 0;
  //anyone tries to do sommething dumb, it will throw a exception
  try{
   numA = Integer.parseInt(stringA);
}
catch(NumberFormatException eA1){
  System.out.println("Put a number smartass");
System.exit(1);
}
///////////////////////////////////////////////

  System.out.println("Type an 'B' value.");
  String stringB = input.nextLine();
  stringB = stringB.trim();
int numB = 0;
  //anyone tries to do sommething dumb, it will throw a exception
  try{
   numB = Integer.parseInt(stringB);
}
catch(NumberFormatException eA2){
  System.out.println("Put a number smartass");
System.exit(1);
}

  //////////////////////////////////////////////

  System.out.println("Type an 'C' value.");
  String stringC = input.nextLine();
  stringC = stringC.trim();
int numC = 0;
  //anyone tries to do sommething dumb, it will throw a exception
  try{
   numC = Integer.parseInt(stringC);
  }
  catch(NumberFormatException eA3){
  System.out.println("Put a number smartass");
  System.exit(1);
  }


  // not allowed to copy paste ya nerd, do better
  Quad obj = new Quad();
  int bottom = obj.divisor(numA);
  int dis = obj.discriminate(numA, numB, numC);
  int negB = obj.negativeB(numB);
  double sqroot = Math.sqrt(dis);


  //Catch a linear function with division through "2a"
  //Also give feedback that the quadratic is valid
  if(Math.abs(bottom) == 0){
    System.out.println("\nThis is not a valid quad bro, ya a value is " +
                        numA + "A can't be zero my dude, try again.");
    System.out.println("Seems you entered a linear equation, check your numbers fool");
    System.exit(0);
  } else {
    System.out.println("\n:Thinking: This is indeed a valid Quadratic.\n");
  }


  //Catch the type and number of roots using the discriminate
  //Options are complex root, 1-root, and 2-roots
  //NaN: Not a number, not a "real number"
  //Output what the value of the discriminate is
  if(dis < 0){//is dis less than 0
    if(Double.isNaN(sqroot)){ //also check the square root
      System.out.println("Yeah, so your discriminate's square root \n" +
                          "doesn't work");
    }
    System.out.println("Your discriminate be this yo: " + dis + ". Try another quad, you know if you want to.\n" +
                        "not like I want you to or anything.");

      System.exit(1);//
  }else if (Math.abs(dis) == 0){
    System.out.println("The discriminate equals: " + dis +
                        "\nThus, one root is estimated.");

  }else {
    System.out.println("The discriminate equal: " + dis +
                        "Thus two roots are estimated.");
  }


  //Calculate the roots using the entire quadratic formula
  if(Math.abs(dis) == 0){
    System.out.println("The single root is equal to: " + (negB + sqroot) / bottom);

  }else if(dis > 0){
    System.out.println("The first root be: " + (negB + sqroot) / bottom);
    System.out.println("The next root gonna be: " + (negB - sqroot) / bottom);

  }else{
    System.out.println("somethings broken m8 please try later");
    System.exit(0);
  }



  //End the program with a salutation
  System.out.println("thanks for using me fam, hope you enjoyed");
}
}
