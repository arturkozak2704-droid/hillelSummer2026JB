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

        int clientS = 2;
        String product2 = "laptop";
        double prices = 1498.12;
        int day = 7;
        int saless = 7;

        double total3 = saless * prices;

        double DailySales2 = total / days;
        System.out.printf("Product No 2: %s,%ntotal sales for %d days is EUR %.2f,%nsales by day is EUR %.2f.%n",
                product2, day, total3, DailySales2);
    }
}
