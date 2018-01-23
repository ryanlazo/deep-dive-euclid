package edu.cnm.deepdive;

public class Math {

  public static long gcd(long a, long b) { // im defining a thing called gcd with value a,b
    a = java.lang.Math.abs (a); //body of your main
    b = java.lang.Math.abs (b);
    if (a == 0) {// if statements require a boolean expression (T/F)
      return b;
    } else if (b == 0) {
      return a;
    } 
    while (a != b) {
      if (a > b) {
        a -= b; //a = a - b; another way to say the same thing called a "compound assignment operator"
      } else {
        b -= a;
      }
    }
    return a; //could have also used b, doesnt matter
  }
  
}
