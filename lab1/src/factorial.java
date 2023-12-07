
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class factorial {
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 5.");
        System.out.print("Введите число: ");
        try {
            int number = sc.nextInt();
            System.out.print(fact(number));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено слишком большое число");
        }
    }
    public static BigInteger fact(int num) {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }
}
