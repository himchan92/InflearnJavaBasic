package string;

public class StringBuilderMain {
    public static void main(String[] args) {
        // String 연산보다 메모리 사용적고 성능향상되어 추천
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse(); //뒤집기
        System.out.println("reverse = " + sb);

        String str = sb.toString();
        System.out.println(str);
    }
}
