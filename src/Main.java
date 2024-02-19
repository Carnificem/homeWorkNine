import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        //Задача 1
        System.out.println("задача 1");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);
        //Задача 2
        System.out.println("Задача 2");
        int minPay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPay) {
                minPay = arr[i];
            }
        }
        int maxPay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxPay < arr[i]) {
                maxPay = arr[i];
            }
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println("Минимальная сумма трат за день составляет " + minPay + " рублей." +
                " \nМаксимальная сумма трат за день составила " + maxPay + " рублей.");
        //Задача 3
        System.out.println("задача 3");
        int[] pay = generateRandomArray();
        float averageCons = 0;
        float summa = 0;
        for (int i = 0; i < pay.length; i++) {
            summa += pay[i];
        }
        averageCons = summa / pay.length;
        System.out.println("Средняя сумма трат за месяц: " + averageCons + " рублей");
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}









