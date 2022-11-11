package glava_3.Modifikator_dostupa_i_inkapsulatsia;

public class Example001 {
    public static void main(String[] args) {
        Person kate = new Person("Kate",32,"Baker Street","+2365936");
        kate.displayName();   // норм, метод public
        kate.displayAge();    // норм, метод имеет модификатор по умолчанию
        kate.displayPhone();  // норм, метод protected
//        kate.displayAddress(); // ! Ошибкаб метод private

        System.out.println("///////////\n"+kate.name); // норм, модификатор по умолчанию
        System.out.println(kate.address); // норм, модификатор public
        System.out.println(kate.age);    // норм, модификатор protected
//        System.out.println(kate.phone);  // ! Ошибка, модификатор private
    }
}

class Person{
    String name;
    protected int age;
    public String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName(){
        System.out.println("Name: "+name);
    }
    void displayAge(){
        System.out.println("Age: "+age);
    }
    private void displayAddress(){
        System.out.println("Address: "+address);
    }
    protected void displayPhone(){
        System.out.println("Phone: "+phone);
    }
}
