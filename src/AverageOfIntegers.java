// Getting average of numbers
import java.util.Scanner;
public class AverageOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstGrade = 1.0;
        double secondGrade = 1.0;
        double thirdGrade = 1.0;
        double average = 1.0;
        System.out.print("Hi, please give the first grade.\n");
        firstGrade = input.nextDouble();
        System.out.print(" now give me the second grade.\n");
        secondGrade = input.nextDouble();
        System.out.print("and now give me the third grade. \n");
        thirdGrade = input.nextDouble();
        System.out.print("Thank you, your first, second and third grades are " + firstGrade + ", " + secondGrade + " and " + thirdGrade + ".\n");
        average = getAverage(firstGrade, secondGrade,thirdGrade);
        System.out.print("average of your grade is " + average);
    }
    private static double getAverage (double a, double b, double c) {
        return (a+b+c)/3.0;
    }
}
