package mytest;

public class VariableTest {
    private static String initTest = null;
    private static String noInit;
    private static String init = "hello";
    public static void main(String[] args){
        System.out.println(initTest);
        System.out.println(noInit);
        System.out.println(init);
    }
}
