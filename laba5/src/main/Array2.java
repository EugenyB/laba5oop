package main;

public class Array2 implements ArrayProcessor {
    public Array2() {

    }

    @Override
    public double calculate(double[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
               if(i%2 != 0) {
                   sum+=array[i];
               }
        }
        return sum;
    }

    @Override
    public double calculatearr(double[][] array) {
        int n = array.length;
        double min = array[0][n/2], max = array[0][n/2];
        for (int i = 0; i < n / 2; i++) {
            for (int j = n / 2; j < n - i; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
            for (int i = n / 2; i < n; i++) {
                for (int j = n / 2; j <= i; j++) {
                    if (min > array[i][j]) {
                        min = array[i][j];
                    }
                    if (max < array[i][j]) {
                        max = array[i][j];
                    }
                }
            }
            return min + max;
        }


    @Override
    public void processArray(double[] array) {
    }

    @Override
    public void processArray(double[][] array) {

    }
}
