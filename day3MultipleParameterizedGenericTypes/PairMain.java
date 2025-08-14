package day3MultipleParameterizedGenericTypes;

import java.util.Arrays;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, Integer> simplePair = new Pair<>(new String[]{"a","b"}, new Integer[]{10,100});
        System.out.println(simplePair.getKey(0));;
        System.out.println(simplePair.getKey(1));;
        System.out.println(simplePair.getValue(0));;
        System.out.println( simplePair.getValue(1));;
        simplePair.sizeOfKV();

    }
}

class Pair<K,V>{
    K[] a;
    V[] b;

    Pair(K a[],V b[]){
        this.a = a;
        this.b = b;
    }

    public void sizeOfKV(){
        System.out.println(a.length+" "+b.length);
    }
    public K getKey(int index){
        return a[index];
    }

    public V getValue(int index){
        return b[index];
    }

}
