package funtionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 완죠니 재밌는 예제
 */
public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.println("consumer=" + i);
        Function<Integer, Integer> f = i -> i / 10 * 10;
        Predicate<Integer> p = i -> i % 2 == 0;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        System.out.println(list);
        List<Integer> newList = doSometing(f, list);
        System.out.println(newList);

    }

    static <T> List<T> doSometing(Function<T, T> f, List<T> list) {
        List<T> tmpList = new ArrayList<>(list.size());
        for (T i : list) {
            tmpList.add(f.apply(i));
        }
        return tmpList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.println("[");
        for (T i : list) {
            if (p.test(i))
                c.accept(i);
        }
        System.out.println("]");

    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
