package day3MultipleParameterizedGenericTypes;

public class StaticGenMethodMain {
    public static void main(String[] args) {
        GenMethodStatic<String> genMethodStatic = new GenMethodStatic<>("Hello");
        GenMethodStatic.getData(100);
        GenMethodStatic.printData();
    }
}

class GenMethodStatic<T>{
    T a;
    GenMethodStatic(T a){
        this.a = a;
    }
    static Integer b = 1000;
    static <T> void  getData(T a){
        System.out.println(a);
        System.out.println(a.getClass().getName());
    }

    static  void printData(){
        System.out.println(b);
    }
}
