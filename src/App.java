public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        System.out.println(deck.drawCard());
        System.out.println(deck.drawCard());
        System.out.println(deck);
    }
}
