import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Массивы 2. Задание 3
        System.out.println("Массивы 2. Задание 3");
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100_000 + (Math.random() * (200_000 - 100_000)));
        }
        String arrString = Arrays.toString(arr);
        System.out.println(arrString);

        double averageOfMonths = 0;
        int sumMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumMonth = sumMonth +arr[i];
            averageOfMonths = sumMonth/arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageOfMonths +" рублей");
    }
}

