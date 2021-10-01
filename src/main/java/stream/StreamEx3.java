package stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    private static Util util;

    public static void main(String[] args) {
        util = new Util();
        Student[] stuArr = util.makeStudentArray();

        Stream<Student> stuStream = Stream.of(stuArr);
        stuStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr);
        IntStream stuIntStream = stuStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics stat = stuIntStream.summaryStatistics();
        System.out.println("count "+stat.getCount());
        System.out.println("sum "+stat.getSum());
        System.out.println(stat.getAverage());
        System.out.println("min "+stat.getMin());
        System.out.println("max "+stat.getMin());
    }
}
