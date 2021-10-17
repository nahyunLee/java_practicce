package thread;

public class ThreadEx2 {
    public static void main(String[] args){
        ThreadEx2_1 thread = new ThreadEx2_1();
        thread.start();
    }
}

/**
 * 고의로 exception발생시켜보면
 * 호출 스택 첫번째 메서드가 main이 아니라 run메서드임을 확인
 */

class ThreadEx2_1 extends Thread{
    public void run(){
        throwException();
    }

    public void throwException(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
