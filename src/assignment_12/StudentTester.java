package assignment_12;


import java.util.*;
import java.util.stream.Collectors;

public class StudentTester implements StudentInterfaces  {
    @Override
    public void getDepartments(ArrayList<Student> studentList)
    {
        System.out.println("Names of the departments");
        studentList.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }

    @Override
    public void studentsEnrolledAfter2018(ArrayList<Student> studentList) {
        System.out.println("Students enrolled after 2018");
        studentList.stream().filter(s-> 2018 < s.getYear_of_enrollment()).forEach(s->System.out.println(s.getName()));
        System.out.println();
    }

    @Override
    public void getMaleCSEStudents(ArrayList<Student> studentList) {
        System.out.println("All Details Of Male and ComputerScience students ");
        studentList.stream().filter(s-> s.getGender().equals("Male") && s.getEngDepartment().equals("Computer Science")).forEach(s->System.out.println(s.toString()));
        System.out.println();
    }

    @Override
    public void numOfMalesAndFemales(ArrayList<Student> studentList) {
        System.out.println("Number of Males and Number of Females");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
        System.out.println();
    }

    @Override
    public void avgOfMalesAndFemales(ArrayList<Student> studentList) {
        System.out.println("Average age of males and Females");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))));
        System.out.println();
    }

    @Override
    public void detailsOfHighestPercentageStudent(ArrayList<Student> studentList) {
        System.out.println("Details of Student with highest percentage");
        System.out.println(studentList.stream().max(Comparator.comparingDouble(Student::getPerTillDate)).get());
        System.out.println();
    }

    @Override
    public void numOfStudentsInEachDept(ArrayList<Student> studentList) {
        System.out.println("Counting number of students for each department");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));
        System.out.println();
    }

    @Override
    public void avgPercentageInEachDept(ArrayList<Student> studentList) {
        System.out.println("Average percentage in each department");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));
        System.out.println();
    }

    @Override
    public void detailsOfYoungestMaleInElectronics(ArrayList<Student> studentList) {
        System.out.println("Details of Youngest male student in electronics department");
        System.out.println(studentList.stream().filter(s->s.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))));
        System.out.println();
    }

    @Override
    public void numOfFemalesAndMalesInCSEDept(ArrayList<Student> studentList) {
        System.out.println("Number of males and females in computer science department");
        System.out.println(studentList.stream().filter(s->s.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
        System.out.println();
    }

}
