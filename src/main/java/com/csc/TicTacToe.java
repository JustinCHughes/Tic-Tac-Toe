import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args)
	{
		// Initialize variables
		char[][] board = {{'1', '2', '3'},
	    					{'4', '5', '6'},
							{'7', '8', '9'}};
		String currentState = "Continue";
		int currentPlayer = 1;

		// Continue game loop as long as currentState says to continue
		while(currentState.equals("Continue"))
		{
			// Prints the board and then calls playerSelect function to
			// prompt user on what cells they want to play
			printBoard(board);
			playerSelect(board, currentPlayer);

			// Checks gameState and updates currentState accordingly
			currentState = gameState(board,currentPlayer);

			// Updates currentPlayer if currentState is still "Continue"
			if(currentState.equals("Continue"))
			{
				if(currentPlayer == 2)
				{
					currentPlayer = 1;
				}
				else
				{
					currentPlayer = 2;
				}
			}
		}

		// Prints final board state
		printBoard(board);

		// Checks currentState and outputs result
		if(currentState.equals("Victory"))
		{
			System.out.println("Player " + Integer.toString(currentPlayer) + " has won!");
		}
		else
		{
			System.out.println("The game has ended in a draw!");
		}
	}

	// Prints current state Tic Tac Toe board
	public static void printBoard(char[][] board)
	{
		System.out.println("\n");
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("-----------");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("-----------");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		System.out.println("\n");
	}

	// Check if selected cell is empty
	public static boolean cellEmpty(char[][] board, int playerSelection)
	{
		// Checks player selected cell to ensure it has not been selected
		// Returns true if selected cell is still empty
		// Returns false if selected cell has already been used
		switch(playerSelection)
		{
			case 1:
				if(board[0][0] == '1')
				{
					return true;
				}
				break;
			case 2:
				if(board[0][1] == '2')
				{
					return true;
				}
				break;
			case 3:
				if(board[0][2] == '3')
				{
					return true;
				}
				break;
			case 4:
				if(board[1][0] == '4')
				{
					return true;
				}
				break;
			case 5:
				if(board[1][1] == '5')
				{
					return true;
				}
				break;
			case 6:
				if(board[1][2] == '6')
				{
					return true;
				}
				break;
			case 7:
				if(board[2][0] == '7')
				{
					return true;
				}
				break;
			case 8:
				if(board[2][1] == '8')
				{
					return true;
				}
				break;
			case 9:
				if(board[2][2] == '9')
				{
					return true;
				}
				break;
		}
		return false;
	}

	// Update board state depending on user selection
	public static char[][] playerSelect(char[][] board, int playerSelection, int currentPlayer)
	{
		if(currentPlayer == 1)
		{
			switch(playerSelection)
			{
				case 1:
					board[0][0] = 'X';
					break;
				case 2:
					board[0][1] = 'X';
					break;
				case 3:
					board[0][2] = 'X';
					break;
				case 4:
					board[1][0] = 'X';
					break;
				case 5:
					board[1][1] = 'X';
					break;
				case 6:
					board[1][2] = 'X';
					break;
				case 7:
					board[2][0] = 'X';
					break;
				case 8:
					board[2][1] = 'X';
					break;
				case 9:
					board[2][2] = 'X';
					break;
			}
		}
		else
		{
			switch(playerSelection)
			{
				case 1:
					board[0][0] = 'O';
					break;
				case 2:
					board[0][1] = 'O';
					break;
				case 3:
					board[0][2] = 'O';
					break;
				case 4:
					board[1][0] = 'O';
					break;
				case 5:
					board[1][1] = 'O';
					break;
				case 6:
					board[1][2] = 'O';
					break;
				case 7:
					board[2][0] = 'O';
					break;
				case 8:
					board[2][1] = 'O';
					break;
				case 9:
					board[2][2] = 'O';
					break;
			}
		}
		return board;
	}

	// Prompts user for cell selection
	public static char[][] playerSelect(char[][] board, int currentPlayer)
	{
		Scanner in = new Scanner(System.in);
		
		// Initializes validity check as false
		boolean valid = false;
		int selection;

		// Runs once and continues as long as valid is still false
		do
		{
			// Initial prompt for user input and checks user input for int
			System.out.println("Player " + Integer.toString(currentPlayer) + " - please select an empty square from 1-9");
			if(in.hasNextInt())
			{
				selection = in.nextInt();

				// Determines if selection is in bounds of board
				if(selection > 0 && selection < 10)
				{
					// Checks if user selected an empty cell
					if(cellEmpty(board, selection))
					{
						// Updates board according to player selection
						// Updates valid to true to escape while loop
						board = playerSelect(board, selection, currentPlayer);
						valid = true;
					}
					else
					{
						System.out.println("That cell is taken. Please select a different cell\n");
					}
				}
				else
				{
					System.out.println("That is not a valid cell. Please select an empty square from 1-9\n");
				}
			}
			else
			{
				System.out.println("That is not an integer. Please try again\n");
			}

			// Clears previous user input
			in.nextLine();

		} while(!valid);
		
		return board;
	}

	// Check game state
	public static String gameState(char[][] board, int currentPlayer)
	{
		// Checks if someone has won
		if((board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
			(board[1][0] == board[1][1] && board[1][1] == board[1][2]) |
			(board[2][0] == board[2][1] && board[2][1] == board[2][2]) ||
			(board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
			(board[0][1] == board[1][1] && board[1][1] == board[2][1]) ||
			(board[0][2] == board[1][2] && board[1][2] == board[2][2]) ||
			(board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
			(board[2][0] == board[1][1] && board[1][1] == board[0][2]) )
		{
			return "Victory";
		}
		
		// Checks if all cells are selected and thus a draw
		else if('1' != board[0][0] &&
				'2' != board[0][1] &&
				'3' != board[0][2] &&
				'4' != board[1][0] &&
				'5' != board[1][1] &&
				'6' != board[1][2] &&
				'7' != board[2][0] &&
				'8' != board[2][1] &&
				'9' != board[2][2])
		{
			return "Draw";
		}
		else
		{
			return "Continue";
		}
	}
}
