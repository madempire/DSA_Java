package day2;

public class GenericMainWithObj {
    public static void main(String[] args) {
        Generic<Student> studentGeneric = new Generic<>(new Student("madhu",450));
        System.out.println(studentGeneric.read().toString());
        Generic<String> stringGeneric = new Generic<>("hello");
        System.out.println(stringGeneric.obj);
    }
}
class Generic<T>{
    T obj;
    Generic(T any){
        obj = any;
    }

    T read(){
        return (T) this.obj;
    }


}

class Student{
    String name;
    int marks;
    Student(String a, int b){
     name = a;
     marks = b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}