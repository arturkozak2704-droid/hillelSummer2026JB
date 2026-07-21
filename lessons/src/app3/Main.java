package app3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        System.out.println("Початковий вигляд масиву: [ ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 101);
            System.out.print(array[i] + " ");

        }
        System.out.println("]");

        insertionSort(array);

        System.out.println("Відсортований масив: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("]");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число для пошуку: ");
        int target = scanner.nextInt();


        int index = binarySearch(array, target);

        if(index != -1){
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else
            System.out.println("Число " + target + " не знайдено у масиві");

    }

        public static void insertionSort(int[] array){
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;
            }
        }


    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}



