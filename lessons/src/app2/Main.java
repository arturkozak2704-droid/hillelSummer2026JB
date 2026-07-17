package app2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int sumNegative = 0;
        int even = 0;
        int odd = 0;
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        int firstIndexNegative = -1;
        int sum = 0;
        int count = 0;
        double averageAfter = 0;
        Random random = new Random();
        System.out.print("Елементи масиву: ");


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 101);
            System.out.print(array[i] + " ");
            if (array[i] < 0) {
                sumNegative += array[i];
            }
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println();
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < 0) {
                if (firstIndexNegative == -1) {
                    firstIndexNegative = i;
                }
            }

        }
        if (firstIndexNegative != -1) {
            for (int i = firstIndexNegative + 1; i < array.length; i++) {
                sum += array[i];
                count++;
            }
            if(count > 0) {
                averageAfter = (double) sum / count;
            }
        }

        System.out.println();
        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних чисел: " + even);
        System.out.println("Кількість непарних чисел: " + odd);
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + averageAfter);
    }

}