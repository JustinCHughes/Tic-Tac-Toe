package com.csc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Computer
{
  // Handles game loop when playing against computer
  public static void startGame(char[][] board, String currentState)
  {
    // Initialize variables
		int currentPlayer = 1;

    // Continue game loop as long as currentState says to continue
		while(currentState.equals("Continue"))
		{
      ArrayList<Character> available = new ArrayList<>();

			// Prints the board and then calls playerSelect function to
			// prompt user on what cells they want to play
			board = Menu.playerSelectMenu(board, currentPlayer);

			// Checks gameState and updates currentState accordingly
			currentState = GameLogic.gameState(board);

      if (currentState.equals("Continue"))
      {
        // Creates array of all current cell positions
        for(int i = 0; i < 3; i++)
        {
          for (int j = 0; j < 3; j++)
          {
            available.add(board[i][j]);
          }
        }

        // Removes all Xs and Os from the array
        available.removeAll(Arrays.asList('X','O'));

        // Initializes random and has the computer select a value from
        // the array. The value is then presumed to be correct and skips
        // the GameLogic input checks that a user's input would go through
        // and directly goes to claiming that cell
        Random rand = new Random();
        int computerSelection = rand.nextInt(available.size());
        board = GameLogic.playerSelect(board, Character.getNumericValue(available.get(computerSelection)), 2);

        // Checks current state of game after computer plays
        currentState = GameLogic.gameState(board);
        if(currentState.equals("Victory"))
        {
          currentPlayer = 2;
        }
        System.out.println("The Computer has selected "
                        + Integer.toString(Character.getNumericValue(available.get(computerSelection))));
      }
      else
      {
        currentPlayer = 1;
      }
		}

    String winner = (currentPlayer == 1) ? "You" : "The Computer";

		// Prints final board state
		GameLogic.printBoard(board);

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
