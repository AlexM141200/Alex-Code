/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2dice;

/**
 *
 * @author Alex
 */
public class Lab2Dice {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        
        MyDie myDie = new MyDie();
        int theDie =  myDie.die1();
        System.out.println("The first die: " + theDie);
        System.out.println();
        
        Die myADie = new Die();
        int theADie = myADie.roll();
        System.out.println("The second die: " + theADie);
        System.out.println();
        
        BeDie myBDie = new BeDie();
        int theBDie = myBDie.spin();
        System.out.println("The B die: " + theBDie);
        System.out.println();
        
        Dice theDice = new Dice();
        int die1 = theDice.roll();
        int die2 = theDice.roll();
        System.out.println("Die 1 came out to: " + die1);
        System.out.println("Die 2 came out to:" + die2);
        System.out.println();
        
    }
    
}
