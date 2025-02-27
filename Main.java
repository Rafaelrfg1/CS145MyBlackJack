
import java.util.Scanner;


public class Main {

    private final Deck deck;
    private final Player player;
    private final Dealer dealer;
    private final Scanner scanner;

    //Constructor to instantiate all of the classes in order to run the actual game in this class
    public Main() {
        deck = new Deck();
        player = new Player(100);
        dealer = new Dealer();
        scanner = new Scanner(System.in);
    }

    public void startRound(){
        System.out.println("Welcome enjoy losing all your money!");

        player.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());

        System.out.println("Your cards are "+ player.showHand() + " (Total value: " + player.getHandValue() + ")");
        System.out.println("Dealer's cards are " + dealer.showHand() + " (Total value: " + dealer.getHandValue() + " )"); 



        //Player's turn
        String choice = "";
        while (player.getHandValue() < 21 && !choice.equals("s")) {
            System.out.println("DO you want to hit or stand? (h/s)");
            choice = scanner.nextLine();
            switch (choice) {
                case "h"-> {
                    player.addCard(deck.drawCard());
                    System.out.println("Your cards are " + player.showHand() + " (Total value: " + player.getHandValue() + " )");
                }
                case "s"->  {
                 //This doesn't do anything it's just to break the loop
            }
                default -> {
                    System.out.println("Invalid choice. Please enter h or s");
                }
                    
            }
            if(choice.equals("s") || player.getHandValue() >= 21) {
                break;
            }
            if (dealer.shouldHit()) {
                dealer.addCard(deck.drawCard());
                System.out.println("Dealer hits: " + dealer.showHand() + " (Total: " + dealer.getHandValue() + ")");
            }   else {
                System.out.println("Dealer stands: ");
            }   
            if (dealer.getHandValue() >= 21) {
                break;
            }
            
        }    
        if (player.isBussing()) {
            System.out.println("You went over 21! You lose!");
        } else if (dealer.isBussing()) {
            System.out.println("Dealer busted! You win.");
        } else {
            int playerTotal = player.getHandValue();
            int dealerTotal = dealer.getHandValue();

            if (playerTotal > dealerTotal) {
                System.out.println("You win!");
            }   else if (playerTotal < dealerTotal) {
                System.out.println("You lose!");
            }   else {
                System.out.println("Tie Game!");
            }
        }
    }
    public static void main(String[] args) {
        Main blackjack = new Main();
        blackjack.startRound();
    }

}