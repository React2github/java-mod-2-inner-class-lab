import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        String gradingMethod = "HEAVY"; 
        StudentGradeTranslator gradeTranslator = new StudentGradeTranslator();

        HashMap<String, String> studentGrades = new HashMap<String, String>();
        studentGrades.put("Jamaal", "93");
        studentGrades.put("Jennifer", "87");
        studentGrades.put("Jules", "59");

        // get all the student and their grades using each entry
        System.out.println("List of students and their grades:");
        for (Entry<String, String> studentGrade: studentGrades.entrySet()) {
            System.out.println(studentGrade.getKey() + "'s grade is " +
                    gradeTranslator.getLetterGrade(Integer.parseInt(studentGrade.getValue())));


            /// This is the code to check for next Letter 

            System.out.println(gradeTranslator.howManyForNextLetter(Integer.parseInt(studentGrade.getValue())) + " Points till next Letter. ");
            // System.out.println("Passing grade status: " + gradeTranslator.isPassingGrade(Integer.parseInt(studentGrade.getValue())));
        }
    }
}
