package stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

public class StreamEx {
    public static void main(String args[]){
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3,300),
                new Student("김자바", 1,200),
                new Student("안자바", 2,100),
                new Student("박자바", 2,150),
                new Student("소자바", 1,200),
                new Student("나자바", 3,290),
                new Student("감자바", 3,180)
        );
        studentStream.sorted().
                forEach(System.out::println);
        //Stream은 일회용이기 때문의 위의 코드를 실행하면 Stream 없어짐.
        studentStream.forEach(System.out::println);

    }
}

/**
 * 스트림의 요소가 Comparable을 구현한 클래스가 아니면 예외 발생
 * ClassCastException
 */
@AllArgsConstructor
@Getter
class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    public int compareTo(Student s){
        return s.totalScore - this.getTotalScore();
    }
}
