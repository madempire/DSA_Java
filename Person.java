public class Person {
    // swap on objects
    String name;
    float marks;

    public Person(float marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    static void swap(Object a, Object b){
        Object temp = a;
        a = b;
        b = temp;
        System.out.println("person = "+a.toString()+", Float = "+b.toString());
    }

    public static void main(String[] args) {
        Person person = new Person(46.2f,"Madhu");
        Float aDouble = Float.valueOf(45.2f);
        System.out.println("person = "+person.toString()+", Float = "+aDouble);
        swap(person, aDouble);
    }
}
