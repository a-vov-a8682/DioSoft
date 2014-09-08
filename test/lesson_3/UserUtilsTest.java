package lesson_3;

import org.junit.Assert;
import org.junit.Test;

public class UserUtilsTest{

    @Test
    public void testMerge() throws Exception {
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
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_withNullLeftArray() throws Exception{
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

        User[] returnValue = new UserUtils().merge(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_withNullRightArray() throws Exception{
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
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_withEmptyLeftArray() throws Exception {
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
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testMerge_withEmptyRightArray() throws Exception {
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
        Assert.assertArrayEquals(expectedArray, returnValue);
    }


    @Test
    public void testInnerUnion() throws Exception {
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
        User[] expectedArray = {new User("Mike", 25, 10500, Sex.M), new User("Barak", 46, 12300, Sex.M )};

        User[] returnValue = UserUtils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_withNullLeftArray() throws Exception{
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

        User[] returnValue = UserUtils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_withNullRightArray() throws Exception{
        User[] leftArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] rightArray = null;
        User[] expectedArray = {};

        User[] returnValue = UserUtils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_withEmptyLeftArray() throws Exception{
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

        User[] returnValue = UserUtils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testInnerUnion_withEmptyRightArray() throws Exception{
        User[] leftArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] rightArray = {};
        User[] expectedArray = {};

        User[] returnValue = UserUtils.innerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }


    @Test
    public void testOuterUnion() throws Exception {
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
                new User("Emma", 31, 9600, Sex.F),
                new User("Sarah", 61, 5000, Sex.F),
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};

        User[] returnValue = UserUtils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_withNullLeftArray() throws Exception{
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

        User[] returnValue = UserUtils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_withNullRightArray() throws Exception{
        User[] leftArray = {
                new User("Mike", 25, 10500, Sex.M),
                new User("Barak", 46, 12300, Sex.M ),
                new User("Emma", 31, 9600, Sex.F),
                new User("Mike", 25, 10500, Sex.M),
                new User("Sarah", 61, 5000, Sex.F)};
        User[] rightArray = null;
        User[] expectedArray = {};

        User[] returnValue = UserUtils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_withEmptyLeftArray() throws Exception{
        User[] leftArray = {};
        User[] rightArray = {
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Barak", 46, 12300, Sex.M),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Mike", 25, 10500, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};
        User[] expectedArray ={
                new User("Jack", 32, 7900, Sex.M),
                new User("Sandra", 50, 5790, Sex.F),
                new User("Barak", 46, 12300, Sex.M),
                new User("Jack", 32, 7900, Sex.M),
                new User("Bob", 20, 3300, Sex.M),
                new User("Mike", 25, 10500, Sex.M),
                new User("Stive", 21, 5500, Sex.M)};

        User[] returnValue = UserUtils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
    @Test
    public void testOuterUnion_withEmptyRightArray() throws Exception{
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

        User[] returnValue = UserUtils.outerUnion(leftArray, rightArray);
        Assert.assertArrayEquals(expectedArray, returnValue);
    }
}