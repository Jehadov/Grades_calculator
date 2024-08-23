import java.util.ArrayList;

public class StudentData {
 private ArrayList<Double> grades;          

    public StudentData() {              
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
