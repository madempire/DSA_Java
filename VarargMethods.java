public class VarargMethods {
    // declaration of vararg methods
    static void varArgObjArray(Object[] a){
        for(Object o:a){
            System.out.println(o);
        }
    }
    static  void varArgElipsis(Object... a){
        for(Object o:a){
            System.out.println(o);
        }
    }
    static void varArgArray(int[] a){
        for(int o:a){
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        int[] a =  {1};
        int[] b = {1,2,3,4};
        int[] c = {};
        System.out.println("VarArgArray");
        varArgArray(a);
        varArgArray(b);
        varArgArray(c);
        System.out.println("Elipsis");
        varArgElipsis(1);
        varArgElipsis(1,2,4,"String");
        varArgElipsis();
        System.out.println("VarArgObjArray");
        varArgObjArray(new Object[]{1});


    }
}
