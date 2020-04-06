package main;

import java.io.*;
import java.util.Scanner;

public class Array1 implements DoubleArrayReader {

    private String fileName;
    private File file;


    private String getFileName() {
        return fileName;
    }

    public File getFile() {
        return file;
    }


    @Override
    public double[] readOneDimensionalArray(File file) {
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return readOneDimensionalArray(new File(fileName));
    }


//    @Override
//    public double[][] readTwoDimensionalArray(File file) {
//        try (Scanner scanner = new Scanner(file)) {
//            int n = scanner.nextInt();
//            double[][] arr = new double[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    arr[i][j] = scanner.nextDouble();
//                }
//            }
//            return arr;
//        } catch (IOException ex) {
//            System.err.println("Error reading file");
//            return null;
//        }
//    }


    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int n = Integer.parseInt(reader.readLine());
            double[][] arr = new double[n][n];
            for (int i = 0; i < n; i++) {
                String[] split = reader.readLine().split(" +");
                for (int j = 0; j < split.length; j++) {
                    arr[i][j] = Double.parseDouble(split[j]);
                }
            }
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        return readTwoDimensionalArray(new File(fileName));
    }

}
