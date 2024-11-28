package com.csc;

import java.util.ArrayList;

public class Board {
  private char[][] boardSymbols;
  private int[][] boardTaken;
	private Character p1;
	private Character p2;

	// Intialize board object with clean set of variables
  public Board()
  {
    this.boardSymbols = new char[][] {{'1', '2', '3'},
												{'4', '5', '6'},
												{'7', '8', '9'}};
    
    this.boardTaken = new int[][] {{0,0,0},
											{0,0,0},
											{0,0,0}};
		this.p1 = null;
		this.p2 = null;
  }

  // Prints current state Tic Tac Toe board
	public void printBoard()
	{
		System.out.println("\n");
		System.out.println(" " + this.boardSymbols[0][0] + " | " + this.boardSymbols[0][1] + " | " + this.boardSymbols[0][2]);
		System.out.println("-----------");
		System.out.println(" " + this.boardSymbols[1][0] + " | " + this.boardSymbols[1][1] + " | " + this.boardSymbols[1][2]);
		System.out.println("-----------");
		System.out.println(" " + this.boardSymbols[2][0] + " | " + this.boardSymbols[2][1] + " | " + this.boardSymbols[2][2]);
		System.out.println("\n");
	}

	// Next two classes are used to assign what p1's and p2's char will be
  public void assignP1(char P1)
  {
		this.p1 = P1;
  }

	public void assignP2(char P2)
	{
		this.p2 = P2;
	}

  // Check if selected cell is empty
	public boolean cellEmpty(int playerSelection)
	{
		// Checks player selected cell to ensure it has not been selected
		// Returns true if selected cell is still empty
		// Returns false if selected cell has already been used
		int rowChoice = (playerSelection - 1) / 3;
		int columnChoice = (playerSelection - 1) % 3;

		return this.boardTaken[rowChoice][columnChoice] == 0;
	}

  // Update board state depending on user selection
	public void playerSelect(int playerSelection, int currentPlayer)
	{
		int rowChoice = (playerSelection - 1) / 3;
		int columnChoice = (playerSelection - 1) % 3;

		this.boardSymbols[rowChoice][columnChoice] = (currentPlayer == 1 ? this.p1 : this.p2);
		this.boardTaken[rowChoice][columnChoice] = (currentPlayer == 1 ? 1 : -1);
	}

  // Check game state
	public String gameState()
	{
		// Checks if someone has won via absolute value of board win conditions
		if(abs((this.boardTaken[0][0] + this.boardTaken[0][1] + this.boardTaken[0][2])) == 3 ||
			abs((this.boardTaken[1][0] + this.boardTaken[1][1] + this.boardTaken[1][2])) == 3 ||
			abs((this.boardTaken[2][0] + this.boardTaken[2][1] + this.boardTaken[2][2])) == 3 ||
			abs((this.boardTaken[0][0] + this.boardTaken[1][0] + this.boardTaken[2][0])) == 3 ||
			abs((this.boardTaken[0][1] + this.boardTaken[1][1] + this.boardTaken[2][1])) == 3 ||
			abs((this.boardTaken[0][2] + this.boardTaken[1][2] + this.boardTaken[2][2])) == 3 ||
			abs((this.boardTaken[0][0] + this.boardTaken[1][1] + this.boardTaken[2][2])) == 3 ||
			abs((this.boardTaken[2][0] + this.boardTaken[1][1] + this.boardTaken[0][2])) == 3)
		{
			return "Victory";
		}
		
		// Checks if all cells are selected and thus a draw
		else if(0 != this.boardTaken[0][0] &&
				0 != boardTaken[0][1] &&
				0 != boardTaken[0][2] &&
				0 != boardTaken[1][0] &&
				0 != boardTaken[1][1] &&
				0 != boardTaken[1][2] &&
				0 != boardTaken[2][0] &&
				0 != boardTaken[2][1] &&
				0 != boardTaken[2][2])
		{
			return "Draw";
		}
		else
		{
			return "Continue";
		}
	}

	// Convert values to absolute values
  public int abs(int values)
  {
    if(values < 0)
    {
      values = values * -1;
    }

    return values;
  }

	// Check what cells are still available for computer
	public ArrayList<Integer> available()
	{
		ArrayList<Integer> available = new ArrayList<>();

		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(this.boardTaken[i][j] == 0)
				{
					available.add((int)boardSymbols[i][j]-'0');
				}
			}
		}

		return available;
	}
}
