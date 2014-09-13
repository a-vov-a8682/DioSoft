package Lesson_7;

import java.util.*;

public class PersonUtils {

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
        List<Integer> ages = new LinkedList<>();
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons[i].size(); j++) {
                ages.add(persons[i].get(j).getAge());
            }
        }
        return result;
    }
}
