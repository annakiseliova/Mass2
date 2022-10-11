import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Массивы 2. Задание 1
        System.out.println("Массивы 2. Задание 1");
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100_000 + (Math.random() * (200_000 - 100_000)));
        }
        String arrString = Arrays.toString(arr);
        System.out.println(arrString);
        int sumAllMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumAllMonth = sumAllMonth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumAllMonth + " рублей");

        //Массивы 2. Задание 2
        System.out.println("Массивы 2. Задание 2");

        int minSum = 200_000;
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
            if (arr[i]<minSum){
                minSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");


    }
}

