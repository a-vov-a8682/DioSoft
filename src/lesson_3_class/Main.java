package lesson_3_class;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = {1, 5, 4,5, 23, 65, 32, 78};
        int[] secondArray = {3, 5, 24, 54, 1, 2, 34, 45, 32};

        System.out.println("L E F T  U N I O N");
        System.out.println(Arrays.toString(Utils.leftUnion(firstArray, secondArray)));
        System.out.println("----------------------------------------------------------");
        new TestsForLeftUnion().test();
        new TestsForLeftUnion().test_withNullLeftArray();
        new TestsForLeftUnion().test_withNullRightArray();
        new TestsForLeftUnion().test_withEmptyLeftArray();
        new TestsForLeftUnion().test_withEmptyRightArray();
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("I N N E R  U N I O N");
        System.out.println(Arrays.toString(Utils.innerUnion(firstArray, secondArray)));
        System.out.println("----------------------------------------------------------");
        new TestsForInnerUnion().test();
        new TestsForInnerUnion().test_withNullLeftArray();
        new TestsForInnerUnion().test_withNullRightArray();
        new TestsForInnerUnion().test_withEmptyLeftArray();
        new TestsForInnerUnion().test_withEmptyRightArray();
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("O U T E R  U N I O N");
        System.out.println(Arrays.toString(Utils.outerUnion(firstArray, secondArray)));
        System.out.println("----------------------------------------------------------");
        new TestsForOuterUnion().test();
        new TestsForOuterUnion().test_withNullLeftArray();
        new TestsForOuterUnion().test_withNullRightArray();
        new TestsForOuterUnion().test_withEmptyLeftArray();
        new TestsForOuterUnion().test_withEmptyRightArray();
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("M E R G E");
        System.out.println(Arrays.toString(Utils.merge(firstArray, secondArray)));
        System.out.println("----------------------------------------------------------");
        new TestsForMerge().test();
        new TestsForMerge().test_withNullLeftArray();
        new TestsForMerge().test_withNullRightArray();
        new TestsForMerge().test_withEmptyLeftArray();
        new TestsForMerge().test_withEmptyRightArray();
    }
   }

