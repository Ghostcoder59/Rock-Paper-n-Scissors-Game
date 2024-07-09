package com.company;
import java.util.Scanner;
import java.util.Random;

public class if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to the rock, paper and scissors game!");
        System.out.println("Enter 1 for Rock, 2 for Paper and 3 for Scissor: ");
        int player1 = sc.nextByte();
        if(player1 == 1){
            System.out.println("You've chosen Rock");
        }
        else if(player1 == 2){
            System.out.println("You've chosen Paper");
        }
        else if(player1 == 3){
            System.out.println("You've chosen Scissors");
        }
        else{
            System.out.println("Enter a valid number from the range of 1 to 3");
        }
        int player2 = rand.nextInt(3)+1;

        if(player2 == 1){
            System.out.println("PC has chosen Rock");
        }
        else if(player2 == 2){
            System.out.println("PC has chosen Paper");
        }
        else{
            System.out.println("PC has chosen Scissors");
        }
        if(player1 == player2){
            System.out.println("It's a tie!");
        }
        else if((player1 == 1 && player2 == 3) ||
                (player1 == 3 && player2 == 2) ||
                (player1 == 2 && player2 == 1)){
            System.out.println("You win!");
        }
        else{
            System.out.println("PC won!");
        }

    }
}
