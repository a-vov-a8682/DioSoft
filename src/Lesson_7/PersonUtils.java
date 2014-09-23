package Lesson_7;

import java.util.*;

public class PersonUtils {

    private boolean containsSecondName (String secondName, List<Person> list){
        for (Person person : list) {
            if (secondName.equals(person.getSecondName())){
                return true;
            }
        }
        return false;
    }
    private boolean containsAge (int age, List<Person> list){
        for (Person person : list) {
            if (age == person.getAge()){
                return true;
            }
        }
        return false;
    }

    public Map<String, List<Person>> getInnerAndOuterPersons(List<Person> persons1, List<Person> persons2) {
        Map<String, List<Person>> result = new HashMap<>();
        List<Person> inner = new ArrayList<>();
        List<Person> outer = new ArrayList<>();
        List<Person> fullList = new ArrayList<>();
        Person tempPerson;
        fullList.addAll(persons1);
        fullList.addAll(persons2);

        while (fullList.size() != 0){
            tempPerson = fullList.get(0);
            fullList.remove(tempPerson);

            if (containsSecondName(tempPerson.getSecondName(), fullList)) {
                for (int i = 0; i < fullList.size(); i++) {
                    if(fullList.get(i).getSecondName().equals(tempPerson.getSecondName())){
                        inner.add(fullList.get(i));
                    }
                }
                inner.add(tempPerson);
                fullList.removeAll(inner);
            } else{
                outer.add(tempPerson);
                fullList.removeAll(outer);
            }
        }
        result.put("Inner", inner);
        result.put("Outer", outer);
        return result;
    }
    public Map<String, List<Person>> getInnerAndOuterPersons(List<Person> ... persons) {
        Map<String, List<Person>> result = new HashMap<>();
        List<Person> fullList = new ArrayList<>();
        List<Person> inner = new ArrayList<>();
        List<Person> outer = new ArrayList<>();
        Person tempPerson;

        for (List<Person> personList : persons) {
            fullList.addAll(personList);
        }
        while (fullList.size() != 0){
            tempPerson = fullList.get(0);
            fullList.remove(tempPerson);
            if (containsSecondName(tempPerson.getSecondName(), fullList)){
                for (int i = 0; i < fullList.size(); i++) {
                    if (fullList.get(i).getSecondName().equals(tempPerson.getSecondName())) {
                        inner.add(fullList.get(i));
                    }
                }
                inner.add(tempPerson);
                fullList.removeAll(inner);
            } else {
                outer.add(tempPerson);
                fullList.removeAll(outer);
            }
        }
        result.put("Inner", inner);
        result.put("Outer", outer);
        return result;
    }
    public List<Person> getUniquePersonsOfSameAge(int age, List<Person> persons1, List<Person> persons2){
        List<Person> result = new ArrayList<>();
        Map<String, List<Person>> map = getInnerAndOuterPersons(persons1, persons2);
        List<Person> uniqueSecondNames = map.get("Outer");
        for (int i = 0; i < uniqueSecondNames.size(); i++) {
            if(uniqueSecondNames.get(i).getAge() == age){
                result.add(uniqueSecondNames.get(i));
            }
        }
        return result;
    }
    public List<Person> getUniquePersonsOfSameAge(int age, List<Person> ... persons){
        List<Person> result = new ArrayList<>();
        List<Person> tempList = new ArrayList<>();

        for (List<Person> personList : persons) {
            tempList.addAll(personList);
        }

        Map<String, List<Person>> m = getInnerAndOuterPersons(tempList);
        List<Person> fullList = m.get("Outer");

        if(containsAge(age, fullList)){
            for (int i = 0; i < fullList.size(); i++) {
                if(fullList.get(i).getAge() == age){
                    result.add(fullList.get(i));
                }
            }
        }
        return result;
    }
}
