package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OverloadingTest {

    public static void main(String[] args) {
        Test test = new Test();
        test.test("iii","uiyuiyui","uuuu");
    }

    public static class Test {
        public void test(String... name) {
            Arrays.stream(name).filter(s -> s.contains("i")).map(String::length).forEach(System.out::println);
        }

        public void test(Integer name) {
            System.out.println("integer method");
        }
    }


}
