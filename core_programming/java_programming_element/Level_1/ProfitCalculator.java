package java_programming_element.Level_1;

public class ProfitCalculator {
    public static void main(String[] args) {
        int cost = 129, selling = 191;
        int profit = selling - cost;
        double profitPercent = (profit / (double) cost) * 100;
        System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + selling
                + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
