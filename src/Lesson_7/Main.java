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

        list2.add(new Person.Builder()
                .firstName("Mk")
                .secondName("Smth")
                .age(21)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list2.add(new Person.Builder()
                .firstName("Bak")
                .secondName("ith")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        list2.add(new Person.Builder()
                .firstName("mm")
                .secondName("Tall")
                .age(50)
                .salary(9600)
                .sex(Sex.F)
                .build());
        list2.add(new Person.Builder()
                .firstName("Mke")
                .secondName("Smth")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        list2.add(new Person.Builder()
                .firstName("Sarah")
                .secondName("Bradley")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        System.out.println("getUniquePersonsOfSameAge");
        System.out.println();

        Map <String, List<Person>> map = new PersonUtils().getInnerAndOuterPersons(list1,list2,list0);

        for (List<Person> list : map.values()) {
            for (Person person : list) {
                System.out.println(person.getSecondName());
            }
        }

        }
//        System.out.println("__________________________________________________________");
//        Map<String, List<Person>> map = new PersonUtils().getInnerAndOuterPersons(list0, list1);
//        System.out.println("getInnerAndOuterPersons_OUTER");
//        System.out.println();
//        List<Person> outer = map.get("Outer");
//        for (Person person : outer) {
//            System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getSalary());
//        }
//        System.out.println("__________________________________________________________");
//        System.out.println("getInnerAndOuterPersons_INNER");
//        System.out.println();
//        List<Person> inner = map.get("Inner");
//        for (Person person : inner) {
//            System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getSalary());
//        }
    }

