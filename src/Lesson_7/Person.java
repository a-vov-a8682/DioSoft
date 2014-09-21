package Lesson_7;

import java.util.Comparator;

public class Person implements Comparator<Person>{
    private final String firstName;
    private final String secondName;
    private final int age;
    private final long salary;
    private final Sex sex;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.salary = builder.salary;
        this.sex = builder.sex;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public long getSalary() {
        return salary;
    }
    public Sex getSex() {
        return sex;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.equals(o2)) {
            return 0;
        }else if(o1.salary > o2.salary){
            return 1;
        }else {
            return -1;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (age != that.age) return false;
        if (salary != that.salary) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (sex != that.sex) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return new StringBuffer("Person{").append("firstName='").append(firstName).
                append(", secondName='").append(secondName).append(", age=").
                append(age).append(", salary=").append(salary).append(", sex=").append(sex).append('}').append("\n").toString();
    }


    public static class Builder{
        private String firstName;
        private String secondName;
        private int age;
        private long salary;
        private Sex sex;

        public Builder(){

        }

        public Builder(Person original) {
            this.firstName = original.firstName;
            this.secondName = original.secondName;
            this.age = original.age;
            this.salary = original.salary;
            this.sex = original.sex;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder salary(long salary) {
            this.salary = salary;
            return this;
        }
        public Builder sex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
