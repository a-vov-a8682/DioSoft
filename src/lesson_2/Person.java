package lesson_2;

public class Person {
    private final String name;
    private final int age;
    private final char sex;
    private final Position post;

    public Person( String name, int age, char sex, Position post) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.post = post;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }
    public Position getPost() {
        return post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (sex != person.sex) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (post != person.post) return false;

        return true;
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (int) sex;
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return new StringBuffer("Person{").append("name=").
                append(name).append(", age=").append(age).
                append(", sex=").append(sex).append(", post=").
                append(post).append("}").toString();

    }
}
