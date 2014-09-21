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

        Set<Person> setOfSameSecondName = new HashSet<>();
        List<Person> sameSecondName = new ArrayList<>();
        List<Person> uniqueSecondName = new ArrayList<>();

        for (Person person1 : persons1) {
            for (Person person2 : persons2) {
                if (person1.getSecondName().equals(person2.getSecondName())) {
                    setOfSameSecondName.add(person1);
                    setOfSameSecondName.add(person2);
                }
            }
        }
        sameSecondName.addAll(setOfSameSecondName);
        Collections.sort(sameSecondName,new Person.Builder().build());
        uniqueSecondName.addAll(persons1);
        uniqueSecondName.addAll(persons2);
        uniqueSecondName.removeAll(sameSecondName);
        result.put("Inner", sameSecondName);
        result.put("Outer", uniqueSecondName);
        return result;
    }
    public Map<String, List<Person>> getInnerAndOuterPersons(List<Person> ... persons) {
        Map<String, List<Person>> result = new HashMap<>();
        List<Person> fullList = new ArrayList<>();
        List<Person> inner = new ArrayList<>();
        List<Person> outer = new LinkedList<>();
        Person tempPerson;

        for (List<Person> personList : persons) {
            fullList.addAll(personList);
        }
        while (fullList.size() != 0){
            tempPerson = fullList.get(0);
            fullList.remove(tempPerson);
            if (containsSecondName(tempPerson.getSecondName(), fullList)){
                for (int j = 0; j < fullList.size(); j++) {
                    if (fullList.get(j).getSecondName().equals(tempPerson.getSecondName())) {
                        inner.add(fullList.get(j));
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
        List<Person> fullList = new ArrayList<>();

        for (List<Person> personList : persons) {
            fullList.addAll(personList);
        }
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
