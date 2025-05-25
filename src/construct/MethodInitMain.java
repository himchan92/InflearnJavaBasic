package construct;

import java.lang.reflect.Member;

public class MethodInitMain {

    public static void main(String[] args) {
        MemberInit m = new MemberInit();
        initMember(m, "user1", 15, 90);

        MemberInit m2 = new MemberInit();
        initMember(m2, "user2", 25, 70);

        MemberInit[] members = {m, m2};

        for(MemberInit s : members) {
            System.out.println(s.name + ", " + s.age + ", " + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
