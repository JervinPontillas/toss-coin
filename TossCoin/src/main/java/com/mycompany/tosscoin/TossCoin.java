package com.mycompany.tosscoin;
import java.util.*;
/**
 *
 * @author jervi
 */
public class TossCoin {

    public static void main(String[] args) {
      askUser();
      flipCoin();
    }
    
    public static void askUser(){
        System.out.println("Choose between Heads and Tails");
        System.out.println("0 for Heads");
        System.out.println("1 for Tails");
        
    }
    public static void flipCoin(){
        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        int choice;
        int result;
        choice = input.nextInt();
        result = randomNum.nextInt(2);
         
        if (result == 0 && choice == 0){
            System.out.println("Heads!");
            System.out.println("You win");
        }
        if (result == 1 && choice == 1){
            System.out.println("Tails!");
            System.out.println("You win!");
        }
          if (result == 1 && choice == 0){
            System.out.println("Tails!");
            System.out.println("You lose!");
        }
            if (result == 0 && choice == 1){
            System.out.println("Heads!");
            System.out.println("You lose!");
        }
            
    }
}

