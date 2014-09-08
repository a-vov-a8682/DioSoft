package lesson_2;

import java.util.Arrays;

//Создайте POJO класс
//Создайте POJO класс, поля которого являются final (Person)
//Создайте Enum который характеризует экзмпляр POJO класса (Должность:DIRECTOR, DEVELOPER, QA)
//Добавьте Enum как поле в POJO
//Cгенерируйте equals/hashcode методы
//Создайте Main класс, в main методе которого проведите сравнение экземпляров по ссылке и через метод equals

//Создайте два массива элементами которых Являются ранее созданные Pojo объекты
//Создайте Main класс, в main методе которого проведите распечатку в консоль и сравнение двух масивов

public class Main {
    public static void main(String[] args) {
        Person p0 = new Person("Mike" , 25, 'M', Position.DEVELOPER);
        Person p1 = new Person("Bill" , 43, 'M', Position.DIRECTOR);
        Person p2 = new Person("Barbara" , 31, 'F', Position.QA);
        Person p3 = new Person("Sam" , 23, 'M', Position.DEVELOPER);
        Person p4 = new Person("Jane" , 21, 'F', Position.DEVELOPER);
        Person p5 = new Person("Bob" , 39, 'M', Position.QA);
        Person p6 = new Person("Linda" , 42, 'M', Position.DIRECTOR);

        Person[] personArray0 = new Person[4];
        personArray0[0] = p0;
        personArray0[1] = p1;
        personArray0[2] = p2;
        personArray0[3] = p3;

        Person[] personArray1 = new Person[3];
        personArray1[0] = p4;
        personArray1[1] = p5;
        personArray1[2] = p6;

        System.out.println(Arrays.toString(personArray0));
        System.out.println(Arrays.toString(personArray1));
        System.out.println(personArray0 == personArray1);
        System.out.println(Arrays.equals(personArray0, personArray1));
    }
}
