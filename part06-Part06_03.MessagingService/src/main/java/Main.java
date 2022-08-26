
public class Main {

    public static void main(String[] args) {
        Message teste = new Message("Lucas", "I love you Anna");
        System.out.println(teste.getContent().length());
        MessagingService ms = new MessagingService();
        System.out.println(ms.getMessages());

        // Try out your class here
    }
}
