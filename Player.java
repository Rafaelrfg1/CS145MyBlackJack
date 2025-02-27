




public class Player {
    
    private final Hand hand;
    private int balance;

    public Player(int balance) {
        this.hand = new Hand();
        this.balance = balance;

    }
    public void addCard(Card card) {
        hand.addCard(card);
    }
    public int getHandValue() {
        return hand.getTotalValue();
    }
    public boolean isBussing() {
        return hand.getTotalValue() > 21;
    }
    public String showHand() {
        return hand.toString();
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void adjustBalance(int amount) {
        this.balance += amount;
    }
}
