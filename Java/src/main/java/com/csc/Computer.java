package com.csc;

import java.util.Random;

public class Computer
{
  // Handles game loop when playing against computer
  public static void startGame(Board game, String currentState)
  {
    // Initialize variables
		int currentPlayer = 1;

    // Continue game loop as long as currentState says to continue
		while(currentState.equals("Continue"))
		{
			// Prints the board and then calls playerSelect function to
			// prompt user on what cells they want to play
			Menu.playerSelectMenu(game, currentPlayer);

			// Checks gameState and updates currentState accordingly
			currentState = game.gameState();

      if (currentState.equals("Continue"))
      {
        // Initializes random and has the computer select a value from
        // the array. The value is then presumed to be correct and skips
        // the GameLogic input checks that a user's input would go through
        // and directly goes to claiming that cell
        Random rand = new Random();
        int computerSelection = game.available().get(rand.nextInt(game.available().size()));
        game.playerSelect(computerSelection, 2);

        // Checks current state of game after computer plays
        currentState = game.gameState();
        if(currentState.equals("Victory"))
        {
          currentPlayer = 2;
        }
        System.out.println("The Computer has selected "
                        + Integer.toString(computerSelection));
      }
      else
      {
        currentPlayer = 1;
      }
		}

    String winner = (currentPlayer == 1) ? "You" : "The Computer";

		// Prints final board state
		game.printBoard();

		// Checks currentState and outputs result
		if(currentState.equals("Victory"))
		{
			System.out.println(winner + " won!");
		}
		else
		{
			System.out.println("The game has ended in a draw!");
		}
		System.out.println("Thank you for playing!");
  }
}
