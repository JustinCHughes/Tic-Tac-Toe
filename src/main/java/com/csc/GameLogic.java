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
