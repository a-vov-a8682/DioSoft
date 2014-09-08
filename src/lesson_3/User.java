package lesson_3;


public class User {
    private final String Name;
    private final int age;
    private final long salary;
    private final Sex sex;

    public User(String name, int age, long salary, Sex sex) {
        Name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
    }

    public String getName() {
        return Name;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (salary != user.salary) return false;
        if (Name != null ? !Name.equals(user.Name) : user.Name != null) return false;
        if (sex != user.sex) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return new StringBuffer("User{").append("Name='").append(Name).append(", age=").
                append(age).append(", salary=").append(salary).append(", sex=").
                append(sex).append("} \n").toString();
    }
}
