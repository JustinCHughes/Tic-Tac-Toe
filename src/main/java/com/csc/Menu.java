package com.csc;

import java.util.Scanner;

public class Menu
{
  public static int gameTypeMenu()
  {
    Scanner in = new Scanner(System.in);

    int playerSelect = 0;

    System.out.println("Welcome to TicTacToe!\n\n");

    do
    {
      System.out.println("Please choose a game mode:\n\n");
      System.out.println("(1) Human vs Human\n");
      System.out.println("(2) Human vs Computer\n");
      
      if(in.hasNextInt())
      {
        playerSelect = in.nextInt();

        if(playerSelect == 1)
        {
          System.out.println("You have selected to play against a human\n");
        }
        else if (playerSelect == 2)
        {
          System.out.println("You have selected to play against a computer\n");
        }
        else
        {
          System.out.println("You did not input '1' or '2'. Try again.");
        }
      }
      else
      {
        System.out.println("That is not an integer. Please input an integer");
      }
    } while(playerSelect != 1 && playerSelect != 2);

    System.out.println("Good luck!\n\n");

    return playerSelect;
  }

  public static int replayMenu()
  {
    do
    {
      System.out.println("Would you like to play again?\n\n");
      System.out.println("(1) Yes\n");
      System.out.println("(2) No\n\n");

      Scanner in = new Scanner(System.in);

      if(in.hasNextInt())
      {
        int redo = in.nextInt();
        if(redo == 1)
        {
          System.out.println("You have chosen to play another game!");
          return redo;
        }
        if(redo == 2)
        {
          System.out.println("You have chosen to quit. Goodbye!");
          return redo;
        }
        else
        {
          System.out.println("That is not a valid input. Please choose either 1 or 2\n");
        }
      }
      else
      {
        System.out.println("That is not an integer. Please input integers 1 or 2");
      }
    } while(true);
  }
}
