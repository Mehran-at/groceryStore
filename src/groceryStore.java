class groceryStore {
    int numberOfApplesSoldPerYEAR;
    double retailPriceOfEachApple;
    int numberOfOrangesSoldPerYear;
    double retailPriceOfEachOrange;
    groceryStore (int a, double b, int c, double d) {
        numberOfApplesSoldPerYEAR = a;
        retailPriceOfEachApple = b;
        numberOfOrangesSoldPerYear = c;
        retailPriceOfEachOrange = d;
    }
    double grossRevenue () {
        double revenue;
        revenue = (numberOfApplesSoldPerYEAR * retailPriceOfEachApple) + (numberOfOrangesSoldPerYear * retailPriceOfEachOrange);
        return revenue;
    }
    double appleRevenueTarget(double revenue) {
        return revenue/retailPriceOfEachApple;
    }
    double orangeRevenueTarget(double revenue) {
        return revenue/retailPriceOfEachOrange;
    }
}
