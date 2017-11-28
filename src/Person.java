public class Person {

    private String name;

    public String getName() {
    return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name + "!");
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person personA = new Person("William");
        System.out.println(personA.getName());
    }
}


