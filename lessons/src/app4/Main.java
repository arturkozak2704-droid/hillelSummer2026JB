package app4;

import java.util.Random;

public class Main {

    private static final int SIZE = 4;

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Матриця 4x4: ");

        int sumEven = 0;
        int sumOdd = 0;
        long prodEven = 1;
        long prodOdd = 1;

        int[][] matrix = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(1, 51);
                System.out.print(matrix[i][j] + "\t");

                if (i % 2 == 0) {
                    sumEven += matrix[i][j];
                } else {
                    sumOdd += matrix[i][j];
                }

                if (j % 2 == 0) {
                    prodEven *= matrix[i][j];
                } else {
                    prodOdd *= matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Сума елементів у парних рядках: (0, 2): " + sumEven);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOdd);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prodEven);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prodOdd);

        // Перевірка на магічний квадрат
        if (isMagicSquare(matrix)) {
            System.out.println("Матриця є магічним квадратом!");
        } else {
            System.out.println("Матриця НЕ є магічним квадратом.");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int targetSum = 0;

        for (int j = 0; j < size; j++) {
            targetSum += matrix[0][j];
        }

        for (int i = 1; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) return false;
        }

        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != targetSum) return false;
        }

        int mainDiagSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagSum += matrix[i][i];
        }
        if (mainDiagSum != targetSum) return false;

        int sideDiagSum = 0;
        for (int i = 0; i < size; i++) {
            sideDiagSum += matrix[i][size - 1 - i];
        }
        if (sideDiagSum != targetSum) return false;

        return true;
    }
}

