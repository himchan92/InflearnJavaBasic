package construct;

import java.lang.reflect.Member;

public class MethodInitMain {

    public static void main(String[] args) {
        MemberInit2 m = new MemberInit2("user1", 10, 20);
        MemberInit2 m2 = new MemberInit2("user2", 14, 99);

        MemberInit2[] members = {m, m2};

        for(MemberInit2 s : members) {
            System.out.println(s.name + ", " + s.age + ", " + s.grade);
        }
    }
}
