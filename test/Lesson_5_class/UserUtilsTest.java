package Lesson_5_class;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserUtilsTest {
    @Test
    public void testMerge() throws Exception {
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        expectedList.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.merge(left, right);
        Collections.sort(returnValue, new User.Builder().build());
        Collections.sort(expectedList, new User.Builder().build());

        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testMerge_WithNullLeftList() throws Exception{
        ArrayList<User> left = null;
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.merge(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testMerge_WithNullRightList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = null;
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());


        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.merge(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testMerge_WithEmptyLeftList(){
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> resultValue = uusd.merge(left, right);
        Assert.assertEquals(expectedList, resultValue);
    }
    @Test
    public void testMerge_WithEmptyRightList(){
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> resultValue = uusd.merge(left, right);

        Collections.sort(expectedList, new User.Builder().build());
        Collections.sort(resultValue, new User.Builder().build());
        Assert.assertEquals(expectedList, resultValue);
    }

    @Test
    public void testInnerUnion() throws Exception {
        ArrayList<User> leftList = new ArrayList<User>();
        ArrayList<User> rightList = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        leftList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        leftList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        leftList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        leftList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        leftList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        rightList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        rightList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.innerUnion(leftList, rightList);

        Collections.sort(expectedList, new User.Builder().build());
        Collections.sort(returnValue, new User.Builder().build());

        Assert.assertEquals(expectedList,returnValue);
    }
    @Test
    public void testInnerUnion_WithNullLeftList() throws Exception{
        ArrayList<User> left = null;
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.innerUnion(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testInnerUnion_WithNullRightList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = null;
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.innerUnion(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testInnerUnion_WithEmptyLeftList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.innerUnion(left, right);
        Assert.assertEquals(expectedList, returnValue);

    }
    @Test
    public void testInnerUnion_WithEmptyRightList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.innerUnion(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }

    @Test
    public void testOuterUnion() throws Exception{
        ArrayList<User> leftList = new ArrayList<User>();
        ArrayList<User> rightList = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        leftList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        leftList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        leftList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        leftList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        leftList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        rightList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        rightList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        rightList.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());


        expectedList.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.outerUnion(leftList, rightList);

        Collections.sort(returnValue, new User.Builder().build());
        Collections.sort(expectedList, new User.Builder().build());

        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testOuterUnion_WithNullLeftList() throws Exception{
        ArrayList<User> left = null;
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.outerUnion(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testOuterUnion_WithNullRightList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = null;
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.outerUnion(left, right);
        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testOuterUnion_WithEmptyLeftList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        expectedList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.outerUnion(left, right);

        Assert.assertEquals(expectedList, returnValue);
    }
    @Test
    public void testOuterUnion_WithEmptyRightList() throws Exception{
        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();
        ArrayList<User> expectedList = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        List<User> returnValue = uusd.outerUnion(left, right);

        Assert.assertEquals(expectedList, returnValue);
    }


    @Test
    public void testMockMerge() throws Exception{
        ArrayList<User> left = new ArrayList<>();
        ArrayList<User> right = new ArrayList<>();
        ArrayList<User> expectedList = new ArrayList<>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        expectedList.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        expectedList.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        UserUtils uu = mock(UserUtils.class);
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        when(uu.merge(left, right)).thenReturn(expectedList);
        Assert.assertEquals(expectedList, uusd.merge(left, right));
    }
    @Test
    public void testMockInnerUnion() throws Exception{
        ArrayList<User> left = new ArrayList<>();
        ArrayList<User> right = new ArrayList<>();
        ArrayList<User> expectedList = new ArrayList<>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        expectedList.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        expectedList.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());

        UserUtils uu = mock(UserUtils.class);
        UserUtilsServiceDelegate uusd = new UserUtilsServiceDelegate(uu);

        when(uu.innerUnion(left, right)).thenReturn(expectedList);
        verify(uu).innerUnion(left,right);
        Assert.assertEquals(expectedList, uusd.innerUnion(left, right));
    }
}