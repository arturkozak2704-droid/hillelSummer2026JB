package app;


public class Main {
    public static void main(String[] args) {

        int clients = 1;
        String product = "Smartphone";
        double price = 2430.68;
        int days = 5;
        int sales = 5;

        double total = sales * price;

        double DailySales = total / days;

        System.out.printf("Product No 1: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product, days, total, DailySales);

        clients = 2;
        product = "laptop";
        price = 1498.12;
        days = 7;
        sales = 7;

        double total3 = sales * price;

        double DailySales2 = total / days;
        System.out.printf("Product No 2: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product, days, total3, DailySales2);
    }
}
