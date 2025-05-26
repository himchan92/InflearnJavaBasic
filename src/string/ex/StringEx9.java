package string.ex;

public class StringEx9 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] arr = fruits.split(",");
        String result = "->";
        System.out.println(String.join(result, arr));
    }
}
