package construct;

public class MemberInit2 {
    String name;
    int age;
    int grade;

    public MemberInit2(String name, int age, int grade) {
        //this : 멤버변수 자신을 대상으로 하기위해 참조
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
