package Lesson_5_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserUtils uu = new UserUtils();
        UserUtilsServiceDelegate service = new UserUtilsServiceDelegate(uu);

        ArrayList<User> left = new ArrayList<User>();
        ArrayList<User> right = new ArrayList<User>();

        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Emma")
                .age(31)
                .salary(9600)
                .sex(Sex.F)
                .build());
        left.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        left.add(new User.Builder()
                .name("Sarah")
                .age(61)
                .salary(5000)
                .sex(Sex.F)
                .build());

        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Sandra")
                .age(50)
                .salary(5790)
                .sex(Sex.F)
                .build());
        right.add(new User.Builder()
                .name("Barak")
                .age(46)
                .salary(12300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Jack")
                .age(32)
                .salary(7900)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Bob")
                .age(20)
                .salary(3300)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Mike")
                .age(25)
                .salary(10500)
                .sex(Sex.M)
                .build());
        right.add(new User.Builder()
                .name("Stive")
                .age(21)
                .salary(5500)
                .sex(Sex.M)
                .build());

        List<User> list = service.outerUnion(left, right);
        list.stream().forEach(System.out :: println);
    }

}
