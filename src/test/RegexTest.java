package test;

public class RegexTest {
    public static void main(String[] args) {
        String s = "(){}";
        System.out.println(s.matches("^.*[\\(\\)][\\{\\}].*$"));
    }
}
