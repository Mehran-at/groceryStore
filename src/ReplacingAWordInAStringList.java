public class ReplacingAWordInAStringList {
    public static void main(String[] args) {
        String sentence[] = {"I","LOVE","TO","TRAVEL"};
        String capitalLetters = "I WILL WIN EVERYTHING I WANT.";
        System.out.print(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3]);
        sentence[3] = "FLY";
        System.out.print("\n" + sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3]);
        System.out.print("\n" + capitalLetters.toLowerCase());
        capitalLetters = capitalLetters.replace('E', 'e');
        System.out.print("\n" + capitalLetters);
        capitalLetters=capitalLetters.replace("WIN", "own");
        System.out.print("\n" + capitalLetters);
    }
}
