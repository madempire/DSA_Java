package day3MultipleParameterizedGenericTypes;

public class SomeError {
    public static void main(String[] args) {

    }
}

class GenError<T>{
    T[] array;

    GenError(T[] t){
        array = t;
    }

    double average(){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
//            sum + array[i].doubleValue();// this gives me an error
        }
        return  sum/array.length;
    }
}
