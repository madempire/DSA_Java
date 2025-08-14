package day3MultipleParameterizedGenericTypes;

public class SinglePair {
    public static void main(String[] args) {
        Gen<String, String> simGen = new Gen<>("Madhu","Good");
        simGen.printData();
    }
}
class Gen<K,V>{
    K a;
    V b;
    Gen(K a, V b){
        this.a = a;
        this.b = b;
    }

    void printData(){
        System.out.println(a + " " + b);
    }
}
