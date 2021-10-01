package stream;

import lombok.AllArgsConstructor;

import java.util.stream.Stream;

@AllArgsConstructor
public class Util {
    public Student[] makeStudentArray(){
        Student[] studentStream = {
                new Student("이자바", 3,300),
                new Student("김자바", 1,200),
                new Student("안자바", 2,100),
                new Student("박자바", 2,150),
                new Student("소자바", 1,200),
                new Student("나자바", 3,290),
                new Student("감자바", 3,180)
    };
        return studentStream;
    }
}
