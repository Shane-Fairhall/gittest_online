
/**
 * Write a description of class cards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class cards
{
    public static void main(String[] args){
        
        //set up keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //declare arrays
        String[] faces = new String[]{"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};
        String[] suits = new String[]{"Hearts", "Diamonds", "Spades", "Clubs"};
        
        String[] card = new String[2];
        String[][] player1Hand = new String[5][2];
        int again = 1;
        while(again==1){
        //generate a card and add it to the hand
        for(int i=0; i<5; i++){
            card[0] = faces[(int)(Math.random()*faces.length)];
            card[1] = suits[(int)(Math.random()*suits.length)];
            //System.out.println(card[0] + " of " + card[1]);
            
            player1Hand[i] = card;
            System.out.println(player1Hand[i][0] + " of " + player1Hand[i][1]);
        }
        
        boolean possibleFlush = true;
        for(int i=1; i<5; i++){
            if(player1Hand[0][1] != player1Hand[i][1]){
                possibleFlush = false;
                System.out.println("here");
            }
        }
        
        if(possibleFlush == true){
            System.out.println("#######\n\n FLUSH \n\n#######");
        }
        
        System.out.println("Deal again (1) yes, (0), no:");
        again = keyboard.nextInt();
        
    }
    }
}
