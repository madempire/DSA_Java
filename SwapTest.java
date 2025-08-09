public class SwapTest {
    public static <T> void swap(T x, T y){
        T temp = x;
        x = y;
        y = temp;

        System.out.println("x = "+x+", y = "+y);
    }
    public static void main(String[] args) {
        swap(10, 20);
        swap("hello","bye");
    }
}
