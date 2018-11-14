// Finding the maximum value in an number array.
public class EX10 {
    public static void main(String[] args) {
        double grades[] = {96.5,23.5,23.6,12.2,33.33,103.88};
        int numbers[] = new int[10];
        double maxNum;
        int b;
        maxNum = grades[0];
        for (b=0; b<=5; b++) {
            if (grades[b]>maxNum) maxNum = grades[b];
        }
        System.out.print("The maximum grade in the class is: " + maxNum);
        int i;
        int a = 0;
        for(i=1; i<=6; i++) {
                System.out.print("\n Grade number " + i + " is " + grades[a]);
                a+= 1;
        }
        for(i=0; i<=9; i++) {
            numbers[i] = i + 10;
        }
        for(i=0; i<=9; i++) {
            System.out.print("\n" + numbers[i]);
        }
    }
}
