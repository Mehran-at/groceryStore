//Create an eight elements array with the following data 12, 43, 54, 2, 7, 33, 65, 4.
//Use an enhanced for Loop to search through this array and print out the maximum and minimum elements of the array.
public class ex16 {
    public static void main(String[] args) {
        int numbers[] = {12,43,54,-2,7,33,65,4,54,789,8};
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int element : numbers) {
            if(element<smallest) smallest = element;
            if (element>largest) largest = element;
        }
        System.out.print("The smallest number in this collection is: " + smallest + " and the largest number is: " + largest);
    }
}
