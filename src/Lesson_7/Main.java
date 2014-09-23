package Lesson_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> list0 = new ArrayList<>();
        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();
        list0.add(new Person.Builder()
                .firstName("Mike")
                .secondName("aaa")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list0.add(new Person.Builder()
                .firstName("Barak")
                .secondName("bbb")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        list0.add(new Person.Builder()
                .firstName("Emma")
                .secondName("sss")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        list0.add(new Person.Builder()
                .firstName("Mike")
                .secondName("hhh")
                .age(25)
                .salary(10600)
                .sex(Sex.M)
                .build());
        list0.add(new Person.Builder()
                .firstName("Sarah")
                .secondName("aaa")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        list1.add(new Person.Builder()
                .firstName("Jack")
                .secondName("ddd")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Sandra")
                .secondName("eee")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        list1.add(new Person.Builder()
                .firstName("Barak")
                .secondName("bbb")
                .age(50)
                .salary(14300)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Jack")
                .secondName("jjj")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Bob")
                .secondName("aaa")
                .age(50)
                .salary(3300)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Rick")
                .secondName("uuu")
                .age(25)
                .salary(101500)
                .sex(Sex.M)
                .build());
        list1.add(new Person.Builder()
                .firstName("Stive")
                .secondName("jjj")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        list2.add(new Person.Builder()
                .firstName("Mk")
                .secondName("nnn")
                .age(21)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list2.add(new Person.Builder()
                .firstName("Bak")
                .secondName("vvv")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        list2.add(new Person.Builder()
                .firstName("mm")
                .secondName("bbb")
                .age(50)
                .salary(9600)
                .sex(Sex.F)
                .build());
        list2.add(new Person.Builder()
                .firstName("Mke")
                .secondName("aaa")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list2.add(new Person.Builder()
                .firstName("Sarah")
                .secondName("eee")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

//        System.out.println("getInnerAndOuterPersons_INNER");
//        System.out.println();
//        List<Person> inner0 = new PersonUtils().getInnerAndOuterPersons(list0, list1, list2).get("Inner");
//        for (Person person : inner0) {
//            System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getSalary());
//        }

//        System.out.println("__________________________________________________________");
//        System.out.println("getInnerAndOuterPersons_OUTER");
//        System.out.println();
//        List<Person> outer0 = new PersonUtils().getInnerAndOuterPersons(list0, list1, list2).get("Outer");
//        for (Person person : outer0) {
//            System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getSalary());
//        }

//        System.out.println("__________________________________________________________");
//        System.out.println("getUniquePersonsOfSameAge");
//        System.out.println();
//        List<Person> sameAge0 = new PersonUtils().getUniquePersonsOfSameAge(25, list1, list0);
//        for (Person person : sameAge0) {
//            System.out.println(person.getFirstName() + " "+ person.getSecondName() + " " + person.getAge() + " " + person.getSalary());
//        }

//        System.out.println("__________________________________________________________");
//        System.out.println("getUniquePersonsOfSameAge");
//        System.out.println();
//        List<Person> sameAge1 = new PersonUtils().getUniquePersonsOfSameAge(25, list1, list2, list0);
//        for (Person person : sameAge1) {
//            System.out.println(person.getFirstName() + " "+ person.getSecondName() + " " + person.getAge() + " " + person.getSalary());
//        }

        System.out.println("__________________________________________________________");
        Map<String, List<Person>> map = new PersonUtils().getInnerAndOuterPersons(list0, list1);
        System.out.println("getInnerAndOuterPersons_OUTER");
        System.out.println();
        List<Person> outer1 = map.get("Outer");
        for (Person person : outer1) {
            System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getSalary());
        }
//
//        System.out.println("__________________________________________________________");
//        System.out.println("getInnerAndOuterPersons_INNER");
//        System.out.println();
//        List<Person> inner1 = map.get("Inner");
//        for (Person person : inner1) {
//            System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getSalary());
//        }
    }
}



