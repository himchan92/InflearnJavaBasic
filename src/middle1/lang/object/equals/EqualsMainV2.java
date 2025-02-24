package middle1.lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println(user1 == user2); //단순 비교 : 메모리 달라 다름
        System.out.println(user1.equals(user2)); //문자열 비교
    }
}
