package Task_1;

import java.util.Arrays;

public class Task_1_3 {
    public static void main(String[] args) {
        int [] ar_a = new int[] {1, 2, 3};
        int [] ar_b = new int[] {1, 2, 0};
        try {
            System.out.println(Arrays.toString(getDivArray(ar_a, ar_b)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static double[] getDivArray(int [] ar_a, int [] ar_b) throws  RuntimeException {
        if (ar_a == null || ar_b == null) throw new RuntimeException("argument with null value");
        if (ar_a.length != ar_b.length) throw new RuntimeException(String.format("the length of arrays is not equal, %s and %s", ar_a.length, ar_b.length));
        double [] result = new double[ar_a.length];
        for(int i = 0; i < ar_a.length; i++) {
            if (ar_b[i] == 0) throw new RuntimeException(String.format("Array b have zero value. Index: %d", i));
            result[i] = (double) ar_a[i] / (double) ar_b[i];
        }
        return  result;
    }


}
