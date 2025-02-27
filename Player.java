




public class Player {
    
    private final Hand hand;
    private int balance;
    //Constructor that gives the player a hand and also gives him a balnce to start gambling with
    public Player(int balance) {
        this.hand = new Hand();
        this.balance = balance;

    }
    //Adds a card to the player's hand
    public void addCard(Card card) {
        hand.addCard(card);
    }
    //Calculates the value of the player's hand
    public int getHandValue() {
        return hand.getTotalValue();
    }
    //Determines whether the player has gone over or to keep playing
    public boolean isBussing() {
        return hand.getTotalValue() > 21;
    }
    //Reveals the players hand to the terminal
    public String showHand() {
        return hand.toString();
    }
    //Gets the new balance of the player after playing the game
    public int getBalance() {
        return balance;
    }
    //This will set the new balance if the player decides to play again
    public void setBalance(int balance) {
        this.balance = balance;
    }
    //Adjusts the balance the player now has
    public void adjustBalance(int amount) {
        this.balance += amount;
    }
}
