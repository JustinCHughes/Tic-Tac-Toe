package com.csc;

public class Menu
{
  public static int gameTypeMenu()
  {
    int playerSelect = 0;

    System.out.println("Welcome to TicTacToe!\n\n");

    do
    {
      String input = "Please choose a game mode:\n\n(1) Human vs Human\n(2) Human vs Computer\n";
      
      playerSelect = Validation.integerCheck(input);
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
    } while(playerSelect != 1 && playerSelect != 2);

    System.out.println("Good luck!\n\n");

    return playerSelect;
  }

  public static int replayMenu()
  {
    do
    {
      String input = "Would you like to play again?\n\n(1) Yes\n(2) No\n\n";
      int redo = Validation.integerCheck(input);

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
    } while(true);
  }

  // Prompts user for cell selection
	public static char[][] playerSelectMenu(char[][] board, int currentPlayer)
	{
		// Initializes validity check as false
		boolean valid = false;

		// Runs once and continues as long as valid is still false
		do
		{
			// Initial prompt for user input and checks user input for int
			String input = "Player " + Integer.toString(currentPlayer) + " - please select an empty square from 1-9";
      int selection = Validation.integerCheck(input);

      // Determines if selection is in bounds of board
      if(selection < 1 || selection > 9)
      {
        System.out.println("That is not a valid cell. Please select an unclaimed square from 1-9\n");
        // Checks if user selected an empty cell
      }
      else if(!GameLogic.cellEmpty(board, selection))
      {
        System.out.println("That cell is taken. Please select a different cell\n");
      }
      else
      {
        // Updates board according to player selection
        // Updates valid to true to escape while loop
        board = GameLogic.playerSelect(board, selection, currentPlayer);
        valid = true;
      }
		} while(!valid);
		
		return board;
	}
}