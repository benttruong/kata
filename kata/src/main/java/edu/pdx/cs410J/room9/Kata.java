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
    StringBuilder s = new StringBuilder();
    int num = Integer.parseInt(args[0]);

    //check if divisible
    if (num % 3 == 0) {
      s.append("Foo");
    }
    if (num % 5 == 0) {
      s.append("Bar");
    }
    if (num % 7 == 0) {
      s.append("Qix");
    }
    //check if args contains 3, 5, 7
    for (int i = 0; i < args[0].length(); i++) {
      if (args[0].charAt(i) == '3') {
        s.append("Foo");
      }
      if (args[0].charAt(i) == '5') {
        s.append("Bar");
      }
      if (args[0].charAt(i) == '7') {
        s.append("Qix");
      }
  }
    if(s.length() == 0) {
      System.err.println(args[0]);
    }
    else {
      System.err.println(s);
    }
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