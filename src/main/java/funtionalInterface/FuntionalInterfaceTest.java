package funtionalInterface;
@FunctionalInterface
public interface FuntionalInterfaceTest<T> {
    int testing();

    //equals는 Obejct의 메서드로 추상메서드 제외
    boolean equals(Object o);

    String toString();
}
