package day3MultipleParameterizedGenericTypes;

public class ParameterNotPrimitive {
    public static void main(String[] args) {
        GenDemo<Integer> singleInteger = new GenDemo<>(1444);
        singleInteger.printData();
//        GenDemo<int> singleInt = new GenDemo<int>(4000);  // we can't use primitive types as parameter
//        singleInt.printData();
    }
}

class GenDemo<T>{
    T any;
    GenDemo(T a){
        this.any = a;
    }

    public void printData(){
        System.out.println(any);
    }
}