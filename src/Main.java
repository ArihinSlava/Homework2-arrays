import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //Задание 1
        System.out.println(" Задание 1");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; }
                System.out.println("Сумма трат за месяц составила " + sum + " рублей ");


        //Задание 2
        System.out.println(" Задание 2");
        int maxExpense = arr[0];
        int minExpense = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей ");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " Рублей ");

        //Задание 3
        System.out.println(" Задание 3");
        double allExpenses = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + allExpenses + " рублей ");

        //Задача 4
        System.out.println(" Задача 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}









