package glava_3.staticheskie_chleni_i_modifikator_static;

public class Example001 {
    public static void main(String[] args) {

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();
        bob.displayId();
        System.out.println(Person.counter);

        Person.counter = 8;
        Person sam = new Person();
        sam.displayId();

        double radius = 60;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.PI * radius);
    }
}

class Person {
    private int id;
    static int counter = 1;

    public Person() {
        id = counter++;
    }

    public void displayId() {
        System.out.println("Id: " + id);
    }
}

class Math {
    public static final double PI = 3.14;
}
