package day3MultipleParameterizedGenericTypes;

import java.util.Arrays;
import java.util.Date;

public class SimpleWithData {
    public static void main(String[] args) {
        String[] t= {"A","B","C"};
        Student[] s = new Student[3];
        s[0] = new Student("Madhu", new int[]{60,70,85});
        s[1] = new Student("Ram", new int[]{30,30,45});
        s[2] = new Student("Raman", new int[]{70,80,95});

        GenArray<String, Student> arrayData = new GenArray<>(t,s);
        System.out.println(arrayData.getDataT(0));;
        System.out.println(arrayData.getDataS(0));;
        arrayData.printDataT(arrayData);
        arrayData.printDataS(arrayData);
        arrayData.reverseArrayT(t);
        arrayData.reverseArrayS(s);
    }
}

class Student{
    String name;
    int[] marks;

    Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    void printData(){
        System.out.println("Name "+name);
        System.out.println("Score "+marks[0]+" "+marks[1]+" "+marks[2]);
    }
}

class GenArray<T, S>{
    T[] a;
    S[] b;

    GenArray(T[] a, S[] b){
        this.a=a;
        this.b=b;
    }

    T getDataT(int i){
        return a[i];
    }

    S getDataS(int i){
        return  b[i];
    }

    void printDataT(GenArray<T, S> t){
        for (int i = 0;i<t.a.length;i++){
            System.out.println(t.getDataT(i));
        }
    }

    void printDataS(GenArray<T, S> t){
        for (int i = 0; i < t.b.length; i++){
            System.out.println(t.getDataS(i));
        }
    }

    void reverseArrayT(T t[]){
        int front = 0, rear = t.length - 1;
        T temp;
        while(front<rear){
            temp = t[front];
            t[front] = t[rear];
            t[rear] = temp;
            front++;
            rear--;
        }
        for(T a:t)
            System.out.println(a);
    }

    void reverseArrayS(S t[]){
        int front = 0, rear = t.length - 1;
        S temp;
        while(front<rear){
            temp = t[front];
            t[front] = t[rear];
            t[rear] = temp;
            front++;
            rear--;
        }
        for(S a:t)
            System.out.println(a);
    }

}