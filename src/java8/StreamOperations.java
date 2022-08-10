package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("abc", 100),
                new Employee("def", 300),
                new Employee("ghi", 500),
                new Employee("jkl", 400),
                new Employee("mno", 200)
        );

        //sort using comparator
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        employeeList.forEach(System.out::println);

        //sort list in reverse oder using stream
        employeeList.stream()
                .sorted(((o1, o2) -> o2.getSalary() - o1.getSalary())).forEach(System.out::println);

        //filter the student w.r.t salary
        employeeList.stream().filter(emp -> emp.getSalary()>200).forEach(System.out::println);

        //takes only the salary list into new list
        List<Integer> salaryList = employeeList.stream().map(emp -> emp.getSalary()).collect(Collectors.toList());
        salaryList.forEach(System.out::println);

    }
}
