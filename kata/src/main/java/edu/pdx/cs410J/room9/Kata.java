package edu.pdx.cs410J.room9;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  private  int number;
  public Kata(int i) {
    this.number = i;
  }


  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }


  public String getString() {
    String output = "";
    String test = String.valueOf(number);
    int x = number % 3;


    switch(x) {
      
      case (0): {
        output += "Foo";
        if (test.contains("3"))
          output +="Foo";
      }
    }

    int numOf3 = 0;
    for (char c:s){
      if(c == '3')
        ++numOf3;
    }

    return output;
  }
}