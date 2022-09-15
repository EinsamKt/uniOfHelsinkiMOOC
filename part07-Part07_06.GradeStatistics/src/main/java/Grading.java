
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Grading {
    private final ArrayList<Integer>grades;

    
    
    public Grading() {
        this.grades = new ArrayList<>();
    }
    
    public void add(int input) {
        grades.add(input);
    }
    
    public double average() {
        int sum = 0;
        double average = 0;
        
        for(Integer grade: grades) {
            sum = sum + grade;
        }
        
        if (grades.size() >= 1) {
            average = 1.0 * sum / grades.size();
        
            return average;
        }
        return -1;
    }
    
    public double passingAverage() {
        int sum = 0;        
        double average = 0;
        int count =0;
        for (Integer grade: grades) {
            if (grade >= 50) {
                sum = sum + grade;
                count++;
            }
        }
            if (count > 0) {
                
                average = 1.0 * sum / count;
            return average;
            }            
        
        return -1;
    }
    
    public double passingPorcentage() {  
            double count = 0;
            for (Integer grade: this.grades) {
                if (grade >= 50)
                    count++;                
            }
            if (count > 0) {
                return 100 * count / grades.size();
            } else {
                return 0.0;
            }
    }
    
    public String printStar(int value) {
        String stars = "";
        for (int i=0;i<value;i++) {
            stars = stars + "*";
        }
        return stars;
    }
    
    public int pointsDistribution(int points) {
            int zero = 0;
            int one = 0;
            int two = 0;
            int three = 0;
            int four = 0;
            int five =0;
        
        for (Integer received: this.grades) {
            
            if (received < 50) {
                zero++;
                continue;
                
            }
            
            if (received < 60) {
                one++;
                continue;
            }
            
            if (received < 70) {
                two++;
                continue;
            }
            
            if (received < 80) {
                three++;
                continue;
            }
            
            if (received < 90) {
                four++;
                continue;
            }
            
            if (received >= 90) {
                five++;                
            }
        }
        
        if (points == 0) {
            return zero;
        }
        
        if (points == 1) {
            return one;
        }
        
        if (points == 2) {
            return two;
        }
        
        if (points == 3) {
            return three;
        }
        
        if (points == 4) {
            return four;
        }
        
        if (points == 5) {
            return five;
        }

        return 0;
        
        }        

    
    
    public int gradesDistribution(int grade) {
            int gradesTotal = 0;
            for (Integer received: grades) {
                if (received < grade) {
                    gradesTotal++;
                }
            }
            return gradesTotal;
        }
    
    
    
    @Override
    public String toString() {
        //print Grade Distribution chart
        String five = "\n" + "5: " + this.printStar(this.pointsDistribution(5));
        String four = "\n" + "4: " + this.printStar(this.pointsDistribution(4));
        String three = "\n" +  "3: " + this.printStar(this.pointsDistribution(3));
        String two = "\n" + "2: " + this.printStar(this.pointsDistribution(2));
        String one = "\n" + "1: " + this.printStar(this.pointsDistribution(1));
        String zero = "\n" + "0: " + this.printStar(this.pointsDistribution(0));
        String grade = "\n" + "Grade distribution:";
        
        //print average, pass average and passing Porcentage
        String average = "Point average (all): " + this.average();
        String passingAverage = "";
        String passingPorcentage = "\n" + "Pass percentage: " + passingPorcentage();
        
        if (!(this.passingAverage() == -1)) {
            passingAverage = "\n" + "Point average (passing): " + this.passingAverage();
            
        } else {
            passingAverage = "\n" + "Point average (passing): -";
        }
        
        return average + passingAverage + passingPorcentage + grade + five + four + three+ two+ one + zero;
    }
    
}

