
/**
 * learning about if and else
 * and changing content in git
 * and again on my machine
 *
 * Shane Fairhall
 * 14/02/2024
 */

import java.util.Scanner;
public class Conditions1
{    
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("what was the grade? ");
        int grade = keyboard.nextInt();
        
        
        if (grade >= 80){
            System.out.println("A");
        } else if (grade >= 70){
            System.out.println("B");
        } else if (grade >= 50){
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        

        
    }
}
