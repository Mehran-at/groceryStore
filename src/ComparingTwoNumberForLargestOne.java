//Comparing two numbers to fund the largest one using method
import java.util.Scanner;
public class ComparingTwoNumberForLargestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
        int largerNumber;
        System.out.print("PLease give me a number between 1 and 100\n");
        number1 = input.nextInt();
        System.out.print("Your first number is " + number1 + "\n");
        System.out.print("PLease give me a second number between 1 and 100\n");
        number2 = input.nextInt();
        System.out.print("Your second number is " + number2 + "\n");
        largerNumber = whichOneIsTheLargerNumber (number1, number2);
        System.out.print("The larger number of your two numbers is " + largerNumber);
    }
    private static int whichOneIsTheLargerNumber (int a, int b) {
        if(a>=b) return a;
        else return b;
    }
}