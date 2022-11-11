package glava_3.klass_i_obiekti;

public class Example001 {
    public static void main(String[] args) {
        Person m = new Person();
        m.displayInfo();

        m.name = "Mike";
        m.age = 30;
        m.displayInfo();

        System.out.println("///////////////////////////");
        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam",25);
        sam.displayInfo();


    }

}

class Person {
    String name;
    int age;

    public Person() {
        this("Undefined",19);
    }
    public Person(String n) {
        name=n;
        age = 18;
    }
    public Person(String n, int a) {
        name=n;
        age =a;
    }

    void displayInfo() {
        System.out.println("name: " + name + "\n" + "Age: " + age);
    }
}
