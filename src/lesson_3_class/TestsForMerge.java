package lesson_3_class;

import java.util.Arrays;

public class TestsForMerge implements Inter_TestUtils {
    @Override
    public void test() {
        System.out.println("Running test method : testMerge");

        int[] leftArray = {1, 5, 4,5, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedArray = {1, 5, 4,5, 23, 65, 32, 78, 3, 24, 54, 2, 34, 45};

        int[] returnValue = Utils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withNullLeftArray() {
        System.out.println("Running test method : testMerge_WithNullLeftArray");

        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedArray = {};

        int[] returnValue = Utils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withNullRightArray() {
        System.out.println("Running test method : testMerge_WithNullRightArray");

        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withEmptyLeftArray() {
        System.out.println("Running test method : testMerge_WithEmptyLeftArray");

        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};
        int[] expectedArray = {};

        int[] returnValue = Utils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));

    }
    @Override
    public void test_withEmptyRightArray() {
        System.out.println("Running test method : testMerge_WithEmptyRightArray");

        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));

    }
}
