package app2;

public class Main {
    public static void main(String[] args) {
        int Num = 0;
        for(int i = 1; i <= 6; i++){
            Num += i;
            System.out.println("Num is " + i + ", sum is " + Num);
        }
        System.out.println("-------------");
        System.out.println("Sum of numbers is " + Num);
    }
}
