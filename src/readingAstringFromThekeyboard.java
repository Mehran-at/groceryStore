//Reading a String from the Keyboard
//
import  java.util.Scanner;
public class readingAstringFromThekeyboard {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        str = input.nextLine();
        System.out.print("Hi " + str);
    }
}
