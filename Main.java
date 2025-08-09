//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    <T> void  genericPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.genericPrint("Joy with java");
        m.genericPrint(100);
        m.genericPrint(10.00);
    }
}