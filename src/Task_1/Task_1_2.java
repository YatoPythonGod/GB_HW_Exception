package Task_1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class Task_1_2 {
    public static void main(String[] args) {
        int [] ar_a = new int[] {1, 2, 3};
        int [] ar_b = new int[] {1, 2};
        try {
            System.out.println(Arrays.toString(getDivArray(ar_a, ar_b)));
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] getDivArray(int [] ar_a, int [] ar_b) throws NullPointerException, IndexOutOfBoundsException {
        if (ar_a.length != ar_b.length) throw new IndexOutOfBoundsException(String.format("the length of arrays is not equal, %s and %s", ar_a.length, ar_b.length));
        int [] result = new int[ar_a.length];
        for(int i = 0; i < ar_a.length; i++) {
            result[i] = ar_a[i] - ar_b[i];
        }
        return  result;
    }
}
