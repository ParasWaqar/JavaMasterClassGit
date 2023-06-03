/*Shared Digit
        Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

        EXAMPLE INPUT/OUTPUT:
        hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
        hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
        hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers*/

package ControlFlow;

class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit (int firstNumber, int secondNumber){
        if((firstNumber>=10 && firstNumber<=99) && (secondNumber>=10 && secondNumber<=99)){
            int digit2Number1 = firstNumber%10;
            int digit1Number1 = firstNumber/10;

            int digit2Number2 = secondNumber%10;
            int digit1Number2 = secondNumber/10;

            if((digit2Number1 == digit2Number2) || (digit2Number1 == digit1Number2) || (digit1Number1 == digit2Number2) || (digit1Number1 == digit1Number2))
                return true;
        }
        return false;
    }
}