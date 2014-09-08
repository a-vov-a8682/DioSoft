package lesson_3;

import lesson_3_class.Inter_TestUtils;

import java.util.Arrays;

public class TestsForMerge implements Inter_TestUtils {

    @Override
    public void test() {
        System.out.println("Running test method : testMerge");

        User[] leftArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] rightArray = {
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Barak", 46, 12300, Sex.M),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Mike", 25, 10500, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};
        User[] expectedArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F),
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Bob", 20, 3300, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};

        User[] returnValue = UserUtils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withNullLeftArray() {
        System.out.println("Running test method : testMerge_WithNullLeftArray");

        User[] leftArray = null;
        User[] rightArray = {
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Barak", 46, 12300, Sex.M),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Mike", 25, 10500, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};
        User[] expectedArray = {};

        User[] returnValue = UserUtils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withNullRightArray() {
        System.out.println("Running test method : testMerge_WithNullRightArray");

        User[] leftArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] rightArray = null;
        User[] expectedArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};

        User[] returnValue = UserUtils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withEmptyLeftArray() {
        System.out.println("Running test method : testMerge_WithEmptyLeftArray");

        User[] leftArray = {};
        User[] rightArray = {
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Barak", 46, 12300, Sex.M),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Mike", 25, 10500, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};
        User[] expectedArray = {};

        User[] returnValue = UserUtils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
    @Override
    public void test_withEmptyRightArray() {
        System.out.println("Running test method : testMerge_WithEmptyRightArray");

        User[] leftArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] rightArray = {};
        User[] expectedArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};

        User[] returnValue = UserUtils.merge(leftArray, rightArray);

        System.out.println(String.format("Result array : %s", Arrays.toString(returnValue)));
        boolean isArraysEquals = Arrays.equals(expectedArray, returnValue);
        System.out.println(String.format("Test successful : %s \n", isArraysEquals));
    }
}
