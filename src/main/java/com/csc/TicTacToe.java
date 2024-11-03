package com.csc;

public class TicTacToe
{
	public static void main(String[] args)
	{
		// Initialize variables
		char[][] board = {{'1', '2', '3'},
                      {'4', '5', '6'},
                      {'7', '8', '9'}};
    String currentState = "Continue";

		int humanComputer = ModeSelection.player();

		if (humanComputer == 1)
		{
			Human.startGame(board, currentState);
		}
		else
		{
			Computer.startGame(board, currentState);
		}
	}
}
