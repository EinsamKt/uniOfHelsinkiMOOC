
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }
    
    public double averageOfPoints() {
        int sumPoints = 0;
        int count = 0;
        double avgPoints = 0;
        for (int point: points) {
            sumPoints += point;
            count++;
        }
        if (sumPoints == 0) {
            return -1;
        } else {
            avgPoints = 1.0*sumPoints/count;
            return avgPoints;
        }
    }    
    
    public double averageOfGrades() {
        int sumGrades = 0;
        int count = 0;
        double avgGrades = 0;
        for (int grade: grades) {
            sumGrades += grade;
            count++;
        }
        if (sumGrades == 0) {
            return -1;
        } else {
            avgGrades = 1.0*sumGrades/count;
            return avgGrades;
        }
        
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
