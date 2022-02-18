package test;

import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class EmployeeTest {
    private static String value = "India is my country. India";
    public static int number;

    public static void main(String[] args) {
        HashMap<Employee, String> employeeStringHashMap = new HashMap<>();
        Employee employee = new Employee("Sahana","32");
        Employee employee2 = new Employee("Soumya","39");
        Employee employee3 = new Employee("Geetha","66");
        employeeStringHashMap.put(employee, "1");
        employeeStringHashMap.put(employee2, "2");
        employeeStringHashMap.put(employee3, "3");
        System.out.println(number);
        char[] chars = value.toCharArray();
        List<Integer> intList = new ArrayList<>();
        intList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(value.chars().filter(value1 -> value1 == 'n').count());
        System.out.println(employeeStringHashMap.size());
    }

    public static class Employee {
        private String name;
        private String age;

        public Employee(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
           return true;
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }
}
