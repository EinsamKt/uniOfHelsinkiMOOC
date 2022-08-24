
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate teste = new SimpleDate(29, 12, 2022);
        System.out.println(teste);
        teste.advance();
        System.out.println(teste);
        teste.advance();
        System.out.println(teste);
        teste.advance(30);
        System.out.println(teste);
        SimpleDate newDate = teste.afterNumberOfDays(40);
        System.out.println(newDate);
    }
}
