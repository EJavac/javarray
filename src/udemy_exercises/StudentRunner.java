package udemy_exercises;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class StudentRunner {

    public static void main(String[] args) {

        Student student = new Student("Elvin", 5, 7, 13, 10);


        int number = student.getNumbersOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalOfMarks();
        System.out.println("Total of the marks: " + sum);

        int maximumMakrs = student.getMaximumMarks();
        System.out.println("Maximum value of marks: " + maximumMakrs);

        int minimumMakrs = student.getMinimumMarks();
        System.out.println("Minimum value of marks: " + minimumMakrs);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average of marks: " + average);

        System.out.println(student);

        student.addNewMark(8);

        System.out.println(student);

        student.removeIndexMark(0);
        System.out.println(student);




    }
}

