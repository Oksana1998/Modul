package TaskOne;

/**
 * Created by Ксюша on 30.11.2017.
 */
public class Person {


    String name;
    int age;
    String sex;


    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
