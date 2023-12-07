
import java.util.InputMismatchException;
import java.util.Scanner;

public class maxmin {
    public static void maxmin () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Задание 2.");
        System.out.print("Введите длину массива: ");

        int n = 0;

        try {
            n = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Введен неверный формат числа");
        }

        if (n != 0) {
            System.out.print("Введите элементы массива: ");

            boolean err = false;
            sc.nextLine();
            String[] line = sc.nextLine().split(" ");

            int[] arr0 = new int[line.length];
            for (int i = 0; i < line.length; i++) {
                try {
                    arr0[i] = Integer.parseInt(line[i]);
                }
                catch (NumberFormatException exception) {
                    System.out.println("Введен неверный формат числа");
                    err = true;
                }

            }

            if (line.length != n) {
                System.out.println("Введено неверное количество элементов");
                err = true;
            }

            if (!err) {

                int sum1 = 0, sum2 = 0, i1 = 0, i2 = 0, min1 = 100000, min2 = 100000, max1 = -100000, max2 = -100000;

                do {
                    sum1 += arr0[i1];
                    if (arr0[i1] < min1) {
                        min1 = arr0[i1];
                    }
                    if (arr0[i1] > max1) {
                        max1 = arr0[i1];
                    }
                    i1++;
                } while (i1 < n);
                System.out.println("Сумма, минимум, максимум (do while): " + sum1 + ", " + min1 + ", " + max1);

                while (i2 < n) {
                    sum2 += arr0[i2];
                    if (arr0[i2] < min2) {
                        min2 = arr0[i2];
                    }
                    if (arr0[i2] > max2) {
                        max2 = arr0[i2];
                    }
                    i2++;
                }
                System.out.println("Сумма, минимум, максимум (while): " + sum2 + ", " + min2 + ", " + max2);
            }
        }
    }
}
