public class groceryStore {
    public static void main(String[] args) {
        groceryStore houseStone = new groceryStore(534, 0.99, 429, 0.87);
        groceryStore seatleStore = new groceryStore(774,5,6,8);
        groceryStore orlandoStore = new groceryStore(405,56,45,33);
//        houseStone.numberOfApplesSoldPerYEAR = 534;
//        houseStone.retailPriceOfEachApple = 0.99;
//        houseStone.numberOfOrangesSoldPerYear = 429;
//        houseStone.retailPriceOfEachOrange = 0.87;
        System.out.print("\nHuston store sells " + houseStone.numberOfApplesSoldPerYEAR +
                "apples per year and the retail price for every apple is " + houseStone.retailPriceOfEachApple + " Euro/cent.");
        System.out.print("\nSeatle store sells " + seatleStore.numberOfApplesSoldPerYEAR +
                "apples per year and the retail price for every apple is " + seatleStore.retailPriceOfEachApple + " Euro/cent.");
        System.out.print("\nOrlando store sells " + orlandoStore.numberOfApplesSoldPerYEAR +
                "apples per year and the retail price for every apple is " + orlandoStore.retailPriceOfEachApple + " Euro/cent.");
        System.out.print("\n\nGross revenue for Huston Store is " + houseStone.grossRevenue());
        System.out.print("\nGross revenue for Seatle Store is " + seatleStore.grossRevenue());
        System.out.print("\nGross revenue for Orlando Store is " + orlandoStore.grossRevenue());
        System.out.print("\n\nTo make 1000$ on apples, Houston Store must sell qty " + houseStone.appleRevenueTarget(1000));
        System.out.print("\nTo make 1000$ on apples, Seatle Store must sell qty " + seatleStore.appleRevenueTarget(1000));
        System.out.print("\nTo make 1000$ on apples, Orlando Store must sell qty " + orlandoStore.appleRevenueTarget(1000));
        System.out.print("\n\nTo make 1000$ on oranges, Houston Store must sell qty " + houseStone.orangeRevenueTarget(1000));
        System.out.print("\nTo make 1000$ on oranges, Seatle Store must sell qty " + seatleStore.orangeRevenueTarget(1000));
        System.out.print("\nTo make 1000$ on oranges, Orlando Store must sell qty " + orlandoStore.orangeRevenueTarget(1000));
    }
}

