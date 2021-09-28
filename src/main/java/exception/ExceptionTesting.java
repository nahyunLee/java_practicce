package exception;

import lombok.extern.slf4j.Slf4j;

/**
 * 자바의 정석 책에 나온 예제가 아닌 내가 테스트 해보고 싶은 것.
 */
public class ExceptionTesting {
    public static void main(String[] args) {
//        this.exceptionThrowTest(22);
        //this는 생성자의 이름으로 쓰인다. 생성자는 인스턴스 변수에만 접근할 수 있으므로 this로 접근 불가
        try {
            exceptionThrowTest(20);
        } catch (Exception e) {
            System.out.println("e:" + e);
            System.out.println("e.getMessage" + e.getMessage());
        }
    }

    static public void exceptionThrowTest(int expectedAge) throws Exception {
        int nahyunAge = 26;
        try {
            if (nahyunAge > expectedAge)
                throw new NahyunException("너무 적어욥");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new NahyunException(e.getMessage() + " 던져~");
        }
    }
}
