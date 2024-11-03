package com.csc;

import java.util.Scanner;

public class GameLogic
{
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
		int rowChoice = (playerSelection - 1) / 3;
		int columnChoice = (playerSelection - 1) % 3;

		if(board[rowChoice][columnChoice] == 'X' || board[rowChoice][columnChoice] == 'O')
		{
			return false;
		}
		return true;
	}

  // Update board state depending on user selection
	public static char[][] playerSelect(char[][] board, int playerSelection, int currentPlayer)
	{
		int rowChoice = (playerSelection - 1) / 3;
		int columnChoice = (playerSelection - 1) % 3;

		board[rowChoice][columnChoice] = (currentPlayer == 1 ? 'X' : 'O');
		
		return board;
	}

  // Prompts user for cell selection
	public static char[][] playerSelectCheck(char[][] board, int currentPlayer)
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
				if(selection < 1 || selection > 9)
				{
					System.out.println("That is not a valid cell. Please select an unclaimed square from 1-9\n");
					// Checks if user selected an empty cell
				}
				else if(!cellEmpty(board, selection))
				{
					System.out.println("That cell is taken. Please select a different cell\n");
				}
				else
				{
					// Updates board according to player selection
					// Updates valid to true to escape while loop
					board = playerSelect(board, selection, currentPlayer);
					valid = true;
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
	public static String gameState(char[][] board)
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
