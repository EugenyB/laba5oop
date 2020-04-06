package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array2Test {

    private Array1 array1;
    private Array2 array2;
    @BeforeEach
    void setUp() {
        array1 = new Array1();
        array2 = new Array2();
    }

    @Test
    void calculate() {
        double expected = -1371;
        double[] array = array1.readOneDimensionalArray("lana5.txt");
        double result = array2.calculate(array);;
        assertEquals(expected, result);
    }

    @Test
    void calculatearr() {
        int expected = 100;
        double[][] array = array1.readTwoDimensionalArray("lana51.txt");
        int result = array.length;
        assertEquals(expected, result);
        assertEquals(245.0, array[99][99], 1e-6);
    }
}