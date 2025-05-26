package string.ex;

public class StringEx10 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(str).reverse().toString());
    }
}
