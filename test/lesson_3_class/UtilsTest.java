package lesson_3_class;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void testLeftUnion() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testLeftUnion_WithNullLeftArray() throws Exception{
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testLeftUnion_WithNullRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testLeftUnion_WithEmptyLeftArray() throws Exception{
        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testLeftUnion_WithEmptyRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.leftUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }


    @Test
    public void testInnerUnion(){
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {5, 4, 1, 32};

        int[] returnValue = Utils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_WithNullLeftArray() throws Exception{
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_WithNullRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;
        int[] expectedArray = {};

        int[] returnValue = Utils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_withEmptyLeftArray() throws Exception{
        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_withEmptyRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {};
        int[] expectedArray = {};

        int[] returnValue = Utils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }


    @Test
    public void testOuterUnion(){
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {23, 65, 78, 3, 24, 2, 34, 45};

        int[] returnValue = Utils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_WithNullLeftArray() throws Exception{
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_WithNullRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;
        int[] expectedArray = {};

        int[] returnValue = Utils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_withEmptyLeftArray() throws Exception{
        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] returnValue = Utils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_withEmptyRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }


    @Test
    public void testMerge(){
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 54, 1, 2, 34, 45, 32, 5, 2};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78, 3, 24, 54, 2, 34, 45};

        int[] returnValue = Utils.merge(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_WithNullLeftArray() throws Exception{
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.merge(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_WithNullRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = null;
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.merge(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_withEmptyLeftArray() throws Exception{
        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArray = {};

        int[] returnValue = Utils.merge(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_withEmptyRightArray() throws Exception{
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {};
        int[] expectedArray = {1, 5, 4, 23, 65, 32, 78};

        int[] returnValue = Utils.merge(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
}
