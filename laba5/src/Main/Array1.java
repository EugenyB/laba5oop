package Main;

import java.io.File;
import java.io.IOException;
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
        try (Scanner in = new Scanner(new File(getFileName()))) {
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
        try (Scanner in = new Scanner(new File(fileName))) {
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
    public double[][] readTwoDimensionalArray(File file) {
        double[][] arr;
        try (Scanner scanner = new Scanner(new File(getFileName()))) {
            int n = scanner.nextInt();
            arr = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scanner.nextDouble();
                }
            }
        }catch(IOException ex){
            System.err.println("Error reading file");
            return null;
        }
        return arr;
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        double[][] arr;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int n = scanner.nextInt();
            arr = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scanner.nextDouble();
                }
            }
        }catch(IOException ex){
            System.err.println("Error reading file");
            return null;
            }
        return arr;
        }
    }


