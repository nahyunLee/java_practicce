package stream;

import java.io.File;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"),
                new File("Ex1.txt")
        };

        Stream fileStream = Stream.of(fileArr);

//        Stream<String> fileNameStream = fileStream.map(File::getName);
        //peek()는 스트림 소모 x
//        fileNameStream.peek(System.out::println);
        //forEeach()는 스트림 소모
//        fileNameStream.forEach(System.out::println);

//        IntStream

    }
}
