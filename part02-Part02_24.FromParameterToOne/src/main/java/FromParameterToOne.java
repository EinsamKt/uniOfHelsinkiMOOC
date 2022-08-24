

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(7);


    }
    public static void printFromNumberToOne(int number) {
        int count = 0;
        while (count < number) {           
            System.out.println(number - count);
            count++;
        }
        
    }

}
