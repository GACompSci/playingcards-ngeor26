public class App {
    public static void main(String[] args) throws Exception {
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
        // printing each card as you create it. 
    }
}
