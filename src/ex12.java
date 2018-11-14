//Finding the largest and smallest value in an integer arrays
public class ex12 {
    public static void main(String[] args) {
        int largArrays[] = {12,45,0,-99,9,5,78,8,-85,8452,65,-5};
        int smallest = largArrays[0];
        int larrgest = largArrays[0];
        int i;
        for (i=0; i<=10; i++) {
            if (smallest>largArrays[i]) smallest=largArrays[i];
            if (larrgest<largArrays[i]) larrgest=largArrays[i];
        }
        System.out.print("The smallest number between our numbers is: " + smallest +
                " and the largest number is: " + larrgest + ".");
    }
}
