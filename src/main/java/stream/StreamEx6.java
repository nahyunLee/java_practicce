package stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamEx6 {
    public static void main(String[] args) {
        Util util = new Util();
        Student[] stuArr = util.makeStudentArray();

        List<String> names = Stream.of(stuArr)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);


        Student[] stuArr2 = Stream.of(stuArr)
                .toArray(Student[]::new);
        for (Student s : stuArr2) {
            System.out.println(s);
        }


        //p->p 항등함수 Fuction.identity()로 대체 가능
        Map<String, Student> stuMap = Stream.of(stuArr)
                .collect(Collectors.toMap(s -> s.getName(), p -> p));
        for (String name : stuMap.keySet()) {
            System.out.println(name + " - " + stuMap.get(name));
        }


        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr)
                .collect(summingInt(Student::getTotalScore));
        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScore);


        totalScore = Stream.of(stuArr)
                .collect(reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println(totalScore);


        //Optional --> get
        Optional<Student> topStudent = Stream.of(stuArr)
                .collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println(topStudent.get());


        IntSummaryStatistics stat = Stream.of(stuArr)
                .collect(summarizingInt(Student::getTotalScore));
        System.out.println(stat);


        String stuName = Stream.of(stuArr)
                .map(Student::getName)
                .collect(joining(",","{","}"));
        System.out.println(stuName);
    }
}
