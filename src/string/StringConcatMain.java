package string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result = a.concat(b); //문자열 결합
        System.out.println(result);

        boolean flag = a.equals(b); //값 자체를 비교, ==은 주소값도 비교하기에 String 참조타입은 주소가 달라 값같아도 false
        System.out.println(flag);

        String phoneNumber = "01063565572";
        String change = phoneNumber.replaceAll(phoneNumber.substring(0, phoneNumber.length() - 4), "*******");
        System.out.println(change);
    }
}