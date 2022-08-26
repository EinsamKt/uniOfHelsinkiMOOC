
public class Main {

    public static void main(String[] args) {

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift watch = new Gift("Amazingfit Band 7", 1);

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(watch);
        System.out.println(gifts.totalWeight());
    }
}


