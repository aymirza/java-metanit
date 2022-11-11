package glava_3.staticheskie_chleni_i_modifikator_static;

public class Example002 {
    public static void main(String[] args) {
        Person2 tom = new Person2();
        Person2 bob = new Person2();

        tom.displayId();
        bob.displayId();

    }
}

class Person2{
    private int id;
    static int counter;
    static {
        counter = 105;
        System.out.println("Static initializer");
    }
    Person2(){
        id = counter++;
        System.out.println("Constructor");
    }
    public void displayId(){
        System.out.println("Id: "+id);
    }
}
