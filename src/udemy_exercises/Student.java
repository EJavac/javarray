package udemy_exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import java.util.Collections;

import static java.math.RoundingMode.UP;

public class Student {

    private String name;
    private ArrayList<Integer>marks = new ArrayList<Integer>();

 public Student(String name, int... marks){
     this.name = name;
     for(int mark : marks){
         this.marks.add(mark);
     }
 }
    public int getTotalOfMarks() {
       int sum = 0;
       for(int mark: marks){
           sum += mark;
       }
        return sum;
    }

    public int getNumbersOfMarks() {
     return marks.size();
    }

    public int getMaximumMarks(){
        //ashagidaki funksiyani daha kichik yazmag
        return Collections.max(marks);
    }

    /* int maximum = Integer.MIN_VALUE;

     for(int mark : marks){
         if(mark > maximum) {
             maximum = mark;
         }
     }
        return maximum;
    }*/

    public int getMinimumMarks() {
        return Collections.min(marks);
    }
      /*  int minimum =Integer.MAX_VALUE;

        for(int mark : marks){
            if(mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    } */

    public BigDecimal getAverageMarks() {
        int sum = getTotalOfMarks();
        int number = getNumbersOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 2, RoundingMode.UP);
    }

    public void addNewMark(int mark){
        marks.add(mark);
    }


    public void removeIndexMark(int i) {
        marks.remove(i);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}