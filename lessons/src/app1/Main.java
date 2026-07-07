package app1;

public class Main {
    public static void main(String[] args) {
        double income = 25000;
        double tax = 0;

        if (income <= 10000) {
            tax = income * 2.5 / 100;
        } else {
            tax += 10000 * 2.5 / 100;
            if (income <= 25000) {
                tax += (income - 10000) * 4.3 / 100;
            } else {
                tax += (25000 - 10000) * 4.3 / 100;
                tax += (income - 25000) * 6.7 / 100;
            }
        }


        double netIncome = income - tax;

        System.out.println("Income after taxes: " + netIncome);
        System.out.println("Tax withheld: " + tax);
    }
}
