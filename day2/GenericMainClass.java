package day2;

public class GenericMainClass {
    public static void main(String[] args) {
        GenericClass<Integer> stringV = new GenericClass<>(10);
        stringV.printData();
        GenericClass<String> integerV = new GenericClass<>("Hello Buddy!");
        stringV.printData();
    }
}

class GenericClass<T>{
    private  T x;
    GenericClass(T x){
        this.x =x;
    }

    void printData(){
        System.out.println(x);
    }
}