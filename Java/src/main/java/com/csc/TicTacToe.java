package com.csc;

public class TicTacToe
{
	public static void main(String[] args)
	{
		int redo = 0;
		int humanComputer = Menu.gameTypeMenu();

		do
		{
			Board game = new Board();
			Menu.playerCharacterMenu(game);
			String currentState = "Continue";

			if (humanComputer == 1)
			{
				Human.startGame(game, currentState);
			}
			else
			{
				Computer.startGame(game, currentState);
			}

			redo = Menu.replayMenu();
		} while(redo != 2);
	}
}
