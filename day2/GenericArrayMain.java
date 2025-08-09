package day2;

public class GenericArrayMain {
    public static void main(String[] args) {
        Integer x[] = {1,5,2,8,2,4,6,1};
        GenericArray<Integer> aInt = new GenericArray<>(x);
        aInt.printData(aInt);
        aInt.reverseArray(aInt);
        aInt.printData(aInt);
    }
}
class GenericArray<T>{
    T a[];

    GenericArray(T a[]){
        this.a = a;
    }

    T getData(int index){
        return a[index];
    }

    void printData(GenericArray<T> b){
        for (int i = 0;i<b.a.length;i++){
            System.out.print(b.getData(i)+" ");
        }
         System.out.println();
    }
    void reverseArray(GenericArray<T> b){
        int front = 0, rear = b.a.length-1;
        T temp;
        while (front<rear){
            temp = b.a[rear];
            b.a[rear] = b.a[front];
            b.a[front] = temp;
            front++;
            rear--;
        }
    }
}
