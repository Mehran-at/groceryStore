public class ComparingTwoStrings {
    public static void main(String[] args) {
        String str1 = "apples are my favorite fruit.";
        String str2 = "apricots are delicious.";
        String str3 = "insects are gross.";
        System.out.print(str1);
        System.out.print("\n" + str2);
        System.out.print("\n");
        System.out.print(str3);
        if (str3.compareTo(str2) > 0) System.out.print("\nStr1 comes before str2");
        if (str3.compareTo(str2) < 0) System.out.print("\nStr1 comes before str2");
        if (str3.compareTo(str2) ==0) System.out.print("\nStr1 is equal to str2");
    }
}
