package day2;

public class MainClassInt {
    public static void main(String[] args) {
        SpecificArrayInt a =new SpecificArrayInt(new int[]{1,2,3,4,5,6});
        a.printInt();
        a.reverseInt();
        a.printInt();
    }
}

class SpecificArrayInt{
    int a[];
    SpecificArrayInt(int a[]){
        this.a =a;
    }

    void printInt(){
        for(int x:a){
            System.out.println(x);
        }
    }

    void reverseInt(){
        int j = a.length-1;
        for(int i=0;i<j;i++){
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }
}
