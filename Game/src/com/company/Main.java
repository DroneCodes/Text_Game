package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to my first game");
	System.out.println("This is just a mini game built by me");

	// Acknowledgements

        System.out.println("Special Thanks to My Family, Mr. Abayomi Omosehin, Mr. Olakunle Joshua, my good friends; Mazi, Ifihan, Solomon, Pluto, Mofe, my padi Timothy and everyone from OSC ");

        // Rules
        System.out.println("So, this game is just a game of Guessing" +
                " Since we all aren't new to guessing game, then relax and play this game");
        System.out.println("You would have to pick your answer in the number form");


        // Start of Game
        System.out.print("So Friend, what's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name );

        // Parental Guidance

        System.out.println("Due to rules guiding this game, we would honorably ask you to specify your age");
        System.out.print("How old are you" + name + "?");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();

        // if statement Used
        String Unl = "Sorry";
        String unl1 = " You are not eligible to play the game";
        if (age > 16) {
            System.out.println("Welcome " + name);
        } else {
            System.out.println(Unl + "" + name + unl1 );
        }

        // If statement continues
        if (age > 16) {
            System.out.print(name + " You are far from home, and you're lost " +
                    "now you have to find your way home..........");
            System.out.println();
            System.out.println("You are on a bush path, you are faced with two different roads, where do you go? ([left] 1/ [right] 2)");
            Scanner scanner2 = new Scanner(System.in);
            int Direction = scanner2.nextInt();
            if (Direction > 2) {
                System.out.println("Error!!!!!");
            } else {
                System.out.println(name + " You chose to go" + " " + Direction);
            }
            switch (Direction) {
                case 1:
                    System.out.println("You choose to go left, now after walking ahead yu saw a river, do you swim or take a boat? (swim (3)/ boat (4)");
                    Scanner scanner3 = new Scanner(System.in);
                    int Direction1 = scanner3.nextInt();
                    if (Direction1 == 3){
                        System.out.println("you swim across the river, you were swallowed by a fish and you died. So, you lost!!!!!");
                    } else{
                        System.out.println("You took the boat and you arrived safely so you won!!!!!!!!!");
                        System.out.println("Congratulations " + name + " You Won" );
                    }
                    break;
                case 2:
                    System.out.println("you choose to go right, after walking a few yards, ou got eaten by a lion. So you Lost!!!!!!!");
                    break;

            }
            }
        }







    }

