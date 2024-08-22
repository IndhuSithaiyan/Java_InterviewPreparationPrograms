package com.program.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        List<Student> collect = studentList.stream().filter(age -> age.getAge() < 30).collect(Collectors.toList());
        System.out.println(collect);

        // sort the student name based on the AGE
        List<String> collect1 = studentList.stream().sorted((e1,e2)->Integer.compare(e1.getAge(), e2.getAge())).map(Student::getFirstName).collect(Collectors.toList());
        System.out.println("---> "+collect1);

        // sort the student name based on the AGE
        List<String> studentNameRankList = studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).map(Student::getFirstName).collect(Collectors.toList());
        System.out.println("studentRanList NAME ---> "+studentNameRankList);

        // sort the list based on the Rank
        List<Student> studentRanList = studentList.stream().sorted((s1, s2) -> Integer.compare(s1.getRank(), s2.getRank())).collect(Collectors.toList());
        System.out.println("studentRanList NAME ---> "+studentRanList);

// find the average rank
        double avgRank = studentList.stream().mapToDouble(Student::getRank).average().getAsDouble();
        System.out.println(avgRank);


        /**
         *   1. Find the list of students whose rank is in between 50 and 100
         */

        List<Student> students = studentList.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100)
                .collect(Collectors.toList());
        List<String> studentName = studentList.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).map(Student::getFirstName)
                .collect(Collectors.toList());
//        System.out.println(studentName);
//        System.out.println(students);

        /**
         *   2. Find the Students who stays in Karnataka and sort them by their names
         */

        List<Student> studentsByCity = studentList.stream()
                .filter(student -> student.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName,Comparator.naturalOrder()))
                .collect(Collectors.toList());

        List<String> studentsByCity1 = studentList.stream()
                .filter(student -> student.getCity().equals("Karnataka"))
                .map(Student::getFirstName)
                .sorted()
                .collect(Collectors.toList());

        //if you want to reverse the firstName u can use Comparator.reverseOrder()
         System.out.println("Name---> "+studentsByCity);
//         System.out.println(studentsByCity1);

        /**
         *   3. Find all departments names
         *   two ways you can use to find the distinct elements, by using distinct() and Set<>
         */

        List<String> deptNames = studentList.stream()
                .map(Student::getDept)
                .distinct()
                .collect(Collectors.toList());

        Set<String> deptNamesInSet = studentList
                .stream().map(Student::getDept)
                .collect(Collectors.toSet());

        //System.out.println(deptNames);
        //System.out.println(deptNamesInSet);

        /**
         *   4.  Find all the contact numbers
         */

        List<String> contacts = studentList.stream()
                .flatMap(student -> student.getContacts().stream())
                .distinct()
                .collect(Collectors.toList());

//        System.out.println(contacts);
        //one2one-> map
        //one2many-> flatmap

        /**
         *   5.  Group The Student By Department Names
         */

        Map<String, List<Student>> studentMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));
//         System.out.println("===="+studentMap);

        /**
         *   Group The Student By Department Names, print the count of the students instead of printing all values
         */

        Map<String, Long> result = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));

        System.out.println(result);

        /**
         *   6. Find the department who is having maximum number of students
         */

        Map.Entry<String, Long> results = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(results);

        /**
         *   7. Find the average age of male and female students
         */

        Map<String, Double> avgStudents = studentList.stream()
                .collect(Collectors
                        .groupingBy(Student::getGender,
                                Collectors.averagingInt(Student::getAge)));

//        System.out.println(avgStudents);

        /**
         *  8. Find the highest rank in each department
         */

        Map<String, Optional<Student>> stdMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.minBy(Comparator.comparing(Student::getRank))));
         System.out.println("highest rank in each department: "+stdMap);

        //9 .Find the student who has second rank

        Student student = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .findFirst().get();
//        System.out.println(student);

//      10.  Using java 8 stream and lambda - we have to group the list by age and need to print names.

        // Group employees by age
        Map<Integer, List<Student>> employeesByAge = studentList.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        // Print the names of employees for each age group
        employeesByAge.forEach((age, empList) -> {
            System.out.println("Age " + age + ": " + empList.stream()
                    .map(Student::getFirstName)
                    .collect(Collectors.joining(", ")));
        });


    }
}
