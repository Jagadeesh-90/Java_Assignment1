package assignment_12;

import java.util.ArrayList;

public interface StudentInterfaces {
    public void getDepartments(ArrayList<Student> studentList);
    public void studentsEnrolledAfter2018(ArrayList<Student> studentList);
    public void getMaleCSEStudents(ArrayList<Student> studentList);
    public void numOfMalesAndFemales(ArrayList<Student> studentList);
    public void avgOfMalesAndFemales(ArrayList<Student> studentList);
    public void detailsOfHighestPercentageStudent(ArrayList<Student> studentList);
    public void numOfStudentsInEachDept(ArrayList<Student> studentList);
    public void avgPercentageInEachDept(ArrayList<Student> studentList);
    public void detailsOfYoungestMaleInElectronics(ArrayList<Student> studentList);
    public void numOfFemalesAndMalesInCSEDept(ArrayList<Student> studentList);
}
