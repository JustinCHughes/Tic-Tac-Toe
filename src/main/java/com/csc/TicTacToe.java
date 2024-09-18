import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args)
	{
		char[][] board = {{' ', ' ', ' '},
	    					{' ', ' ', ' '},
							{' ', ' ', ' '}};
		String currentState = "Continue";
		int currentPlayer = 1;

		while(currentState.equals("Continue"))
		{
			System.out.flush();
			printBoard(board);
			playerSelect(board, currentPlayer);

			currentState = gameState(board,currentPlayer);
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

		printBoard(board);

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
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("-----------");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("-----------");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
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

	// Check if selected cell is empty
	public static boolean cellEmpty(char[][] board, int playerSelection)
	{
		switch(playerSelection)
		{
			case 1:
				if(board[0][0] == ' ')
				{
					return true;
				}
				break;
			case 2:
				if(board[0][1] == ' ')
				{
					return true;
				}
				break;
			case 3:
				if(board[0][2] == ' ')
				{
					return true;
				}
				break;
			case 4:
				if(board[1][0] == ' ')
				{
					return true;
				}
				break;
			case 5:
				if(board[1][1] == ' ')
				{
					return true;
				}
				break;
			case 6:
				if(board[1][2] == ' ')
				{
					return true;
				}
				break;
			case 7:
				if(board[2][0] == ' ')
				{
					return true;
				}
				break;
			case 8:
				if(board[2][1] == ' ')
				{
					return true;
				}
				break;
			case 9:
				if(board[2][2] == ' ')
				{
					return true;
				}
				break;
		}
		return false;
	}

	// Ask for input
	public static char[][] playerSelect(char[][] board, int currentPlayer)
	{
		Scanner in = new Scanner(System.in);
		
		boolean valid = false;
		int selection;

		do
		{
			System.out.println("Please select an empty square from 1-9");
			if(in.hasNextInt())
			{
				selection = in.nextInt();
				if(selection > 0 && selection < 10)
				{
					if(cellEmpty(board,selection))
					{
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
			in.nextLine();

		} while(!valid);
		
		return board;
	}

	// Check game state
	public static String gameState(char[][] board, int currentPlayer)
	{
		if((board[0][0] == board[0][1] && board[0][1] == board[0][2]) && board[0][0] != ' ' ||
			(board[1][0] == board[1][1] && board[1][1] == board[1][2]) && board[1][0] != ' ' ||
			(board[2][0] == board[2][1] && board[2][1] == board[2][2]) && board[2][0] != ' ' ||
			(board[0][0] == board[1][0] && board[1][0] == board[2][0]) && board[0][0] != ' ' ||
			(board[0][1] == board[1][1] && board[1][1] == board[2][1]) && board[0][1] != ' ' ||
			(board[0][2] == board[1][2] && board[1][2] == board[2][2]) && board[0][2] != ' ' ||
			(board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[0][0] != ' ' ||
			(board[2][0] == board[1][1] && board[1][1] == board[0][2]) && board[2][0] != ' ')
		{
			return "Victory";
		}
		else if(' ' != board[0][0] &&
				' ' != board[0][1] &&
				' ' != board[0][2] &&
				' ' != board[1][0] &&
				' ' != board[1][1] &&
				' ' != board[1][2] &&
				' ' != board[2][0] &&
				' ' != board[2][1] &&
				' ' != board[2][2])
		{
			return "Draw";
		}
		else
		{
			return "Continue";
		}
	}
}
