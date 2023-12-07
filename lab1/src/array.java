
public class array {
    public static void array () {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += arr[i];
        }
        int mean = sum / arr.length;
        System.out.println("Задание 1.");
        System.out.print("Сумма: ");
        System.out.println(sum);
        System.out.print("Среднее: ");
        System.out.println(mean);
    }
}
