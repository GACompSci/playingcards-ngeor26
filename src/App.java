public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        Card[] cards = new Card[54];
        // Use nested loops to create a full deck (plus two Jokers)
        int index = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 13; j++){
                cards[index] = new Card(j, i);
                System.out.println(cards[index]);
                index++;
            }
        }
        for(int i = 0; i < 2; i++){
            cards[index] = new Card();
            System.out.println(cards[index]);
            index++;
        }

        System.out.println(Card.getNumCards());

        // printing each card as you create it. 
=======
        Deck deck = new Deck();
        System.out.println(deck.drawCard());
        System.out.println(deck.drawCard());
        System.out.println(deck);
>>>>>>> 5debef4d0b51a236f1249cea5d798cfafd42ed3d
    }
}
