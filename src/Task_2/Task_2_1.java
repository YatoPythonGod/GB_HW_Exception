package Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//необходимо повторно запросить у пользователя ввод данных.
public class Task_2_1 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(inputFloat());
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }

    public static float inputFloat() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input float number: ");
        return sc.nextFloat();
    }

}
