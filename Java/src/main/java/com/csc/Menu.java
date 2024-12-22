package com.csc;

public class Menu
{
  // Asks user what game vs type they would like to select
  public static int gameTypeMenu()
  {
    int playerSelect = 0;

    System.out.println("Welcome to TicTacToe!\n\n");

    do
    {
      String input = "Please choose a game mode:\n\n(1) Human vs Human\n(2) Human vs Computer\n";
      
      playerSelect = Validation.integerCheck(input);
      switch (playerSelect)
      {
        case 1:
          System.out.println("You have selected to play against a human\n");
          break;
        case 2:
          System.out.println("You have selected to play against a computer\n");
          break;
        default:
          System.out.println("You did not input '1' or '2'. Try again.");
          break;
      }
    } while(playerSelect != 1 && playerSelect != 2);

    System.out.println("Good luck!\n\n");

    return playerSelect;
  }

  // Asks user at the end of the game if they would like to play again
  // Does not allow for game vs type to change. Only a replay of same game
  public static int replayMenu()
  {
    do
    {
      String input = "Would you like to play again?\n\n(1) Yes\n(2) No\n\n";
      int redo = Validation.integerCheck(input);

      switch (redo)
      {
        case 1:
          System.out.println("You have chosen to play another game!");
          return redo;
        case 2:
          System.out.println("You have chosen to quit. Goodbye!");
          return redo;
        default:
          System.out.println("That is not a valid input. Please choose either 1 or 2\n");
      }
    } while(true);
  }

  public static void playerCharacterMenu(Board game)
  {
    String input = "Please select the symbol for Player 1";
    game.assignP1(Validation.charCheck(input));

    input = "Please select the symbol for Player 2";
    game.assignP2(Validation.charCheck(input));
  }

  // Prompts user for cell selection
	public static void playerSelectMenu(Board game, int currentPlayer)
	{
		// Runs once and continues as long as valid is still false
		do
		{
      game.printBoard();
			// Initial prompt for user input and checks user input for int
			String input = "Player " + Integer.toString(currentPlayer) + " - please select an empty square from 1-9";
      int selection = Validation.integerCheck(input);

      // Determines if selection is in bounds of board
      if(selection < 1 || selection > 9)
      {
        System.out.println("That is not a valid cell. Please select an unclaimed square from 1-9\n");
        // Checks if user selected an empty cell
      }
      else if(!game.cellEmpty(selection))
      {
        System.out.println("That cell is taken. Please select a different cell\n");
      }
      else
      {
        // Updates board according to player selection
        // Updates valid to true to escape while loop
        game.playerSelect(selection, currentPlayer);
        break;
      }
		} while(true);
	}
}