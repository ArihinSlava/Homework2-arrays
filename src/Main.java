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
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (i == generateRandomArray().length - 1)
                System.out.println("Сумма трат за месяц составила " + IntStream.of(generateRandomArray()).sum() + " рублей ");
            
        }
    }
}