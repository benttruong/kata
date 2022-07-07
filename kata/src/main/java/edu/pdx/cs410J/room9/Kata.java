package edu.pdx.cs410J.room9;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    String s = "";
    int num = Integer.valueOf(args[0]);

    //check if divisible
    if (num % 3 == 0) {
      s += "Foo";
    }
    if (num % 5 == 0) {
      s += "Bar";
    }
    if (num % 7 == 0) {
      s += "Qix";
    }
    //check if args contains 3, 5, 7
    for (int i = 0; i < args[0].length(); i++) {
      if (args[0].charAt(i) == '3') {
        s += "Foo";
      }
      if (args[0].charAt(i) == '5') {
        s += "Bar";
      }
      if (args[0].charAt(i) == '7') {
        s += "Qix";
      }
  }

    System.err.println(s);
  }
}