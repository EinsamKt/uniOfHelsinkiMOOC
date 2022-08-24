
public class Program {

    public static void main(String[] args) {
        // This is an empty main method where you can experiment
        // with your Fitbyte class

        Fitbyte Lucas = new Fitbyte(28, 63);
//
        double percentage = 0.5;
//
        while (percentage < 1.0) {
            double target = Lucas.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage += 0.1;
       }

    }
}
