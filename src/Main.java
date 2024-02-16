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
        int maxPay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxPay) ;
            {
                maxPay = arr[i];
            }
        }
        int minPay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minPay > arr[i]) ;
        }
        System.out.println("Минимальная сумма трат за день составляет " + minPay + " рублей." +
                " \nМаксимальная сумма трат за день составила " + maxPay + " рублей.");
        //Задача 3
        System.out.println("задача 3");
        int[] pay = generateRandomArray();
        //float averageCons = 0;
        //for (int i = 0; i < pay.length; i++) {
        //    averageCons += pay[i];
        //    averageCons = averageCons/pay.length;
        //}
        //System.out.println("Средняя сумма трат за месяц: " + averageCons + " рублей");
        //Не могу понять почему тут выдаёт среднюю разницу за месяц,вместо средней траты?
        //Если не сложно можете прокоментирвать? я что то загнался. Вроде как цикл прогоняет поочередно все ячейки массива,
        //дальше к tоtal добавляю значение каждого значения массива,потом все это делю на общее количество ячеек в массиве.
        float averageCons = 0;
        if (pay.length > 0) {
            float summa = 0;
            for (int i = 0; i < pay.length; i++) {
                summa += pay[i];
            }
            averageCons = summa / pay.length;
            System.out.println("Средняя сумма трат за месяц: " + averageCons + " рублей");
            //Задача 4
            System.out.println("Задача 4");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            //System.out.println(Arrays.toString(reverseFullName));
            for (int i = reverseFullName.length - 1; i >= 0; i--)
                System.out.print(reverseFullName[i]);

        }
    }
}








