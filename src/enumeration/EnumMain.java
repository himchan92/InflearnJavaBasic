package enumeration;

import java.util.Arrays;

public class EnumMain {

    public static void main(String[] args) {
        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println(Arrays.toString(values));

        //ordinal 은 비추 : 요소 추가시 자동 인덱스값으로써 변경되기에 장애 우려
        for(Grade value : values) {
            System.out.println(value.name() + ", ordinal=" + value.ordinal()); //이름, 인덱스 출력
        }
    }
}
