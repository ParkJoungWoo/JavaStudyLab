public class Variable{
    public static void main(String[] args) {
        // Numeric 끼리의 형변환
        // 1바이트
        byte byte_num = 127;
        // 2바이트
        short short_num = 32767;
        // 2바이트 char은 양수다.
        char char_num = 65535;
        // 4바이트
        int int_num = 2147483647;
        // 8바이트 long의 초기화는 숫자 + L으로 한다.
        long long_num = 9223372036854775807L;
        
        // 이진수, 8진수, 16진수
        int binary = 0b10100;
        int octal = 0206;
        int hexa = 0xDD;

        // 16진수 String을 변환하는 방법
        int hexaParseTest = Integer.parseInt("DD", 16);
        System.out.println(hexaParseTest);
        // 7진수 String을 변환하는 방법
        int octalParseTest = Integer.parseInt("55", 7);
        System.out.println(octalParseTest);
        /*
        n진수 String을 변환하는 방법
        int NParseTest = Integer.parseInt(str, n);
        System.out.println(NParseTest);
        */

        // 4바이트 소수점 7자리
        float float_num = 0.01f;
        // 8바이트 소수점 15자리
        double double_num = 0.01d;
        
        boolean boolean_num = true;
        

        //타입 변환 허용 범위
        // byte < short < int < long < float < double
        // -> 작은 허용 범위가 큰 허용 범위로 변환 가능
        // 큰 것을 작은 것으로 강제로 바꾸는 것을 강제 타입 변환이라고 한다.
        // 실수형 타입의 정수형 강제 타입 변환은 소숫점 이하 부분 버리기로 적용

        //자동 타입 변환
        byte x = 1;
        byte y = 2;
        // byte z = x + y; -> x,y가 int형으로 자동 변환 되기 때문에 byte에 int를 넣는 상황이므로
        // 타입 에러가 발생한다.
        byte z = 1 + 2; // -> 1 + 2 를 먼저 연산하고 3을 byte로 변환

        // 실수의 경우에는 double이 기본형
        float xf = 1.3f; // 1.3이 double이기 때문에 리터럴을 사용한다.
        float yf = 2.3f;
        float zf = xf + yf;
        //
    }
}