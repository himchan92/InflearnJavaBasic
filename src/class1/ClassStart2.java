package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        Student student = new Student(); //메모리할당, 인스턴스화, 객체생성
        student.name = "학생1"; //참조변수통해서 필드접근해 값 할당
        student.age = 19;
        student.grade = 100;

        Student student1 = new Student();
        student1.name = "학생2";
        student1.age = 18;
        student1.grade = 90;

        System.out.println(student.name + ", " + student.age + ", " + student.grade);
        System.out.println(student1.name + ", " + student1.age + ", " + student1.grade);
    }
}
