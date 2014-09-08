package lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User[] firstArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] secondArray = {
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Barak", 46, 12300, Sex.M),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Mike", 25, 10500, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};

        System.out.println("I N N E R  U N I O N");
        System.out.println(Arrays.toString(UserUtils.innerUnion(firstArray, secondArray)));
        System.out.println("--------------------------------------------------------------");
        new TestsForInnerUnion().test();
        new TestsForInnerUnion().test_withNullLeftArray();
        new TestsForInnerUnion().test_withNullRightArray();
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("M E R G E");
        System.out.println(Arrays.toString(UserUtils.merge(firstArray, secondArray)));
        System.out.println("--------------------------------------------------------------");
        new TestsForMerge().test();
        new TestsForMerge().test_withNullLeftArray();
        new TestsForMerge().test_withNullRightArray();
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("O U T E R  U N I O N");
        System.out.println(Arrays.toString(UserUtils.outerUnion(firstArray, secondArray)));
        System.out.println("--------------------------------------------------------------");
        new TestsForOuterUnion().test();
        new TestsForOuterUnion().test_withNullLeftArray();
        new TestsForOuterUnion().test_withNullRightArray();
        new TestsForOuterUnion().test_withEmptyLeftArray();
        new TestsForOuterUnion().test_withEmptyRightArray();
    }
}
