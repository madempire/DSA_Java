package day3MultipleParameterizedGenericTypes;

public class GenMultMain {
    public static void main(String[] args) {
        GenM<String, Integer> mGT = new GenM<>("Madhu",1);
        mGT.printData();

    }
}

class GenM<T, V>{
    T a;
    V b;
    GenM(T a, V b){
        this.a = a;
        this.b = b;
    }

    void printData(){
        System.out.println(a+" "+b);
    }
}
