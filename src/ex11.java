//create an array with 100 elements that will hold integer values. Loop through the array and for each element, store the
// square of the element index. For example, for element [2], you would store the value of 4 in that location. For
// element [3], store 9 and so on. Print out the element number and the contents of the array to the screen as follow:
//The square number of 0 is 0
public class ex11 {
    public static void main(String[] args) {
        int squares [] = new int [100];
        int square;
        int i;
        for (i=0; i<=99; i++) {
            squares[i] = i*i;
            System.out.print("\nThe square number of " + i + " is " + squares[i]);
        }
    }
}
