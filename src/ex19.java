public class ex19 {
    public static void main(String[] args) {
        String favoriteMeal = "I really love good pasta.";
        String favoriteDrink = "I love to drink ice tea.";
        System.out.print(favoriteMeal);
        System.out.print(favoriteDrink);
        System.out.print("\n");
        System.out.print(favoriteMeal.charAt(10));
        System.out.print("\n" + favoriteDrink.charAt(0));
        for (int i=0; i<=favoriteDrink.length()-1; i++) {
            System.out.print("\n" + favoriteDrink.charAt(i));
        }
    }
}
