package com.csc;

import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args)
	{
		int redo = 0;
		int humanComputer = ModeSelection.player();

		do
		{
			// Initialize variables
			char[][] board = {{'1', '2', '3'},
												{'4', '5', '6'},
												{'7', '8', '9'}};
			String currentState = "Continue";

			if (humanComputer == 1)
			{
				Human.startGame(board, currentState);
			}
			else
			{
				Computer.startGame(board, currentState);
			}

			do
			{
				System.out.println("Would you like to play again?\n\n");
				System.out.println("(1) Yes\n");
				System.out.println("(2) No\n\n");

				Scanner in = new Scanner(System.in);

				if(in.hasNextInt())
				{
					redo = in.nextInt();
					if(redo == 1)
					{
						System.out.println("You have chosen to play another game!");
						break;
					}
					if(redo == 2)
					{
						System.out.println("You have chosen to quit. Goodbye!");
						break;
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
		} while(redo != 2);
	}
}
