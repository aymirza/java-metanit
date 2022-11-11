package glava_3.Modifikator_dostupa_i_inkapsulatsia;

public class Example002 {
    public static void main(String[] args) {
        Person2 kate = new Person2("Kate", 30);
        System.out.println(kate.getAge());
        kate.setAge(33);
        System.out.println(kate.getAge());
        kate.setAge(21321);
        System.out.println(kate.getAge());
        kate.setAge(-10);
        System.out.println(kate.getAge());

    }
}

class Person2 {
    private String name;
    private int age = 1;

    public Person2(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }
}
