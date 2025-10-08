package com.code.java.practice.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExapmle1 {
    public static void main(String[] args) {

        //using stream, filter find the employee who is manager and salary is grator then 90k
        List<Employee> list = Arrays.asList(new Employee("Sunil","Developer","30000"),
                new Employee("Arun", "Manager","990000"),
                new Employee("Uday", "Senior Developer", "600000"),
                new Employee("Alok", "Senior Developer", "60000"),
                new Employee("Prasanna", "Manager", "990000"));
        System.out.println("All employee details  :" + list.toString());
        List<Employee> manager = list.stream().filter(e -> e.getDesignation().equals("Manager")
                && Integer.valueOf(e.getSalary()) > 90000).collect(Collectors.toList());
        System.out.println("Manager details "  + manager);
        System.out.println("*************************************");
        //filter manager with salary > 90k and group by designation
        Map<String, List<Employee>> manager1 = list.stream().filter(e -> e.getDesignation().equalsIgnoreCase("Manager")
                        && Integer.valueOf(e.getSalary()) > 90000)
                .collect(Collectors.groupingBy(Employee::getDesignation));
        //System.out.println(manager1);
        manager1.forEach((designation, empList) -> {
            System.out.println(designation);
            empList.forEach(System.out::println);
        });
        System.out.println("*************************************");
        //show the details of employee grouping by designation
        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDesignation));
        collect.forEach((designation, empList) -> {
            System.out.println("-------------------------------------------");
            System.out.println(designation);
            System.out.println("-------------------------------------------");
            empList.forEach(System.out::println);
        });
        System.out.println("*************************************");
        //using collector.toMap show name and salary
        Map<String, String> collect1 = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        collect1.forEach((empName, empSalary) -> {
            System.out.println(empName + " ----> " + empSalary);
        });

        System.out.println("*************************************");
        //find the even number and multiply by 5
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(10);
        System.out.println("before multiplication : " + limit);
        List<Integer> collect2 = limit.filter(x -> x % 2 == 0).map(x -> x * 5).collect(Collectors.toList());
        System.out.println("after multiplication : " + collect2);
        System.out.println("*************************************");
        
        //count character oocurance
        String str ="welcometothisworld";
        Map<Character, Long> collect3 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Character frequency :" + collect3);
        System.out.println("*************************************");

        //count letters only case-sernsitive skip special character
        String strr = "Hello, World ! Java 8 Stream.";
        Map<Character, Long> collect4 = strr.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Character frequency (letter Only) : "+collect4);

        System.out.println("*************************************");
        //COUNT word occurance in String
        String input = "Java is great and Java is powerful";
        Map<String, Long> collect5 = Arrays.stream(input.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Word frequency : " + collect5);
        System.out.println("*************************************");
        //word count with punctuation removed + sorted by frequency
        String input1 = "Java is grate ! Java is powerful, and java is popular";
        Map<String, Long> collect6 = Arrays.stream(input1.replaceAll("[^a-zA-z\\s]", "").split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("word frequency after pinctution remived : "+collect6);
        System.out.println("*************************************");
        //How do you find the color with the most occurances
        List<String> colorList = Arrays.asList("blue", "yellow", "green", "yellow", "blue", "purple", "green", "yellow");
        Map<String, Long> collect7 = colorList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect7);
        Optional<Map.Entry<String, Long>> max1 = collect7.entrySet().stream().max(Map.Entry.comparingByValue());

        Optional<Map.Entry<String, Long>> max = Arrays.asList("blue", "yellow", "green", "yellow", "blue", "purple", "green", "Yellow")
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max);
        System.out.println(max1);

        System.out.println("*************************************");
        

    }
}
