package Lesson_7;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PersonUtilsTest {

    @Test
    public void testGetInnerAndOuterPersons() throws Exception {
        List<Person> list0 = new ArrayList<>();
        List<Person> list1 = new ArrayList<>();
        List<Person> inner = new ArrayList<>();
        List<Person> outer = new ArrayList<>();
        Map<String, List<Person>> expectedMap = new HashMap<>();
        list0.add(new Person.Builder()
                .firstName("Mike")
                .secondName("Smith")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list0.add(new Person.Builder()
                .firstName("Barak")
                .secondName("Smith")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        list0.add(new Person.Builder()
                .firstName("Emma")
                .secondName("Tailor")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        list0.add(new Person.Builder()
                .firstName("Mike")
                .secondName("Smith")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list0.add(new Person.Builder()
                .firstName("Sarah")
                .secondName("Bradley")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        list1.add(new Person.Builder()
                .firstName("Jack")
                .secondName("Milman")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Sandra")
                .secondName("Bullok")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        list1.add(new Person.Builder()
                .firstName("Barak")
                .secondName("Smith")
                .age(50)
                .salary(14300)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Jack")
                .secondName("Tailor")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Bob")
                .secondName("Garcia")
                .age(50)
                .salary(3300)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Rick")
                .secondName("Smith")
                .age(27)
                .salary(101500)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Stive")
                .secondName("Jobs")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        outer.add(new Person.Builder()
                .firstName("Sarah")
                .secondName("Bradley")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());
        outer.add(new Person.Builder()
                .firstName("Jack")
                .secondName("Milman")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        outer.add(new Person.Builder()
                .firstName("Sandra")
                .secondName("Bullok")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        outer.add(new Person.Builder()
                .firstName("Bob")
                .secondName("Garcia")
                .age(50)
                .salary(3300)
                .sex(Sex.M)
                .build());
        outer.add(new Person.Builder()
                .firstName("Stive")
                .secondName("Jobs")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        inner.add(new Person.Builder()
                .firstName("Jack")
                .secondName("Tailor")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        inner.add(new Person.Builder()
                .firstName("Emma")
                .secondName("Tailor")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        inner.add(new Person.Builder()
                .firstName("Mike")
                .secondName("Smith")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        inner.add(new Person.Builder()
                .firstName("Barak")
                .secondName("Smith")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        inner.add(new Person.Builder()
                .firstName("Barak")
                .secondName("Smith")
                .age(50)
                .salary(14300)
                .sex(Sex.M)
                .build());
        inner.add(new Person.Builder()
                .firstName("Rick")
                .secondName("Smith")
                .age(27)
                .salary(101500)
                .sex(Sex.M)
                .build());

        expectedMap.put("Inner", inner);
        expectedMap.put("Outer", outer);


        PersonUtils spu = mock(PersonUtils.class);
        when(spu.getInnerAndOuterPersons(list0, list1)).thenReturn(expectedMap);
//        verify(spu).getInnerAndOuterPersons(list0, list1);
        Assert.assertEquals(expectedMap, spu.getInnerAndOuterPersons(list0, list1));
    }
    @Test
    public void testGetUniquePersonsOfSameAge() throws Exception {

    }
}