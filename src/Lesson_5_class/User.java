package Lesson_5_class;

import java.util.Comparator;

public class User implements Comparator<User>{
    private final String name;
    private final int age;
    private final long salary;
    private final Sex sex;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
        this.sex = builder.sex;
    }

    public String getName() {
        return name;
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
    public int compare(User o1, User o2) {
        if(o1.equals(o2)) {
            return 0;
        }else if(o1.getAge() < o2.getAge()){
            return -1;
        }else {
            return 1;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (salary != user.salary) return false;
        if (!name.equals(user.name)) return false;
        if (sex != user.sex) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        result = 31 * result + sex.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", sex=" + sex +
                '}';
    }

    public static class Builder{

        private String name;
        private int age;
        private long salary;
        private Sex sex;

        public Builder() {

        }

        public Builder(User original) {
            this.name = original.name;
            this.age = original.age;
            this.salary = original.salary;
            this.sex = original.sex;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder salary(long salary){
            this.salary = salary;
            return this;
        }
        public Builder sex(Sex sex){
            this.sex = sex;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
