package thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        /**
         * Thread클래스를 상속받으면 자손 클래스에서 조상인 Thread클래스의 메서드를 직접 호출할 수 있지만
         * Runnable을 구현하면 Thread클래스의 staitc 메서드인 currnetThread()를 호출하여 스레드에 대한 참조를 얻어 와야만 호출이 가능.
         */
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            //Thread.currentThread() --> 현재 실행중인 스레드 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}