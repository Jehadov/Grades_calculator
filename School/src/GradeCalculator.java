import java.util.ArrayList;

public class GradeCalculator {
      private ArrayList<Double> grades;

    public GradeCalculator(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    


    public double findHighest() {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public double findLowest() {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public ArrayList AllGraders() {
    return this.grades;
    }
}
