package lesson_3_class;

import java.util.Arrays;

public class TestsForLeftUnion implements Inter_TestUtils {
    @Override
    public void test() {
        System.out.println("Running test method : testLeftUnion");

        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));

    }
    @Override
    public void test_withNullLeftArray() {
        System.out.println("Running test method : testLeftUnion_WithNullLeftArray");
        // initialize variable inputs
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        // initialize class to test

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);

        // assert return value
        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
        assert (isArraysEquals);
    }
    @Override
    public void test_withNullRightArray() {
        System.out.println("Running test method : testLeftUnion_WithNullRightArray");

        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withEmptyLeftArray() {
        System.out.println("Running test method : testLeftUnion_WithEmptyLeftArray");

        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray,returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withEmptyRightArray() {
        System.out.println("Running test method : testLeftUnion_WithEmptyRightArray");
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
}
