package hello.exception.javatest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTest {

    @Test
    void testStream(){
        Integer[] input = {1, 2, 3, 4, 5};

        List<Integer> collect = Arrays.stream(input).map(in -> {
            if (in == 2) {
                throw new RuntimeException("2222222");
            }

            System.out.println(in);

            return in;
        }).collect(Collectors.toList());

        System.out.println("collect = " + collect);

    }
}
