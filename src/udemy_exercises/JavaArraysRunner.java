package udemy_exercises;

public class JavaArraysRunner {

    public static void main(String[] args) {

        String [] daysOfWeek ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String dayWithMostCharacter = "";
        for (String days: daysOfWeek
             ) {

            if (days.length()>dayWithMostCharacter.length()) {
                dayWithMostCharacter = days;

            }

        }   System.out.println("Day with most char: " + dayWithMostCharacter);
            for(int i = daysOfWeek.length-1; i>=0; i--){
                System.out.println(daysOfWeek[i]);
            }
    }
}
