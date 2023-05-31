/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Name: Kritan Tamrakar 
 * Student ID: 991706440
 */

package card;

import java.util.Random; 
import java.util.Scanner; 

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //hand of seven cards. 
        Card[] magicHand = new Card[7];
        Random random = new Random(); 
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13) + 1);  
           //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
           c.setSuit(Card.SUITS[random.nextInt(3)]); 
           
           magicHand[i] = c; 
        }
        
        //hard-coded luckyCard
        Card luckyCard = new Card(); 
        luckyCard.setValue(8);
        luckyCard.setSuit("Diamonds"); 
        
        int userVal = luckyCard.getValue(); 
        String userSuit = luckyCard.getSuit(); 
        
        boolean found = false; 
        // and search magicHand here
        for (Card card: magicHand) {
            if (userVal == card.getValue() && userSuit.equals(card.getSuit())) {
                found = true; 
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Found your Card!"); 
        } else {
            System.out.println("Sorry, Your Card is not in the magic hand!"); 
        }
    }
    
}
