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
      printBoard(board);
   		
			playerSelect(board, currentPlayer);

      currentState = gameState(board,currentPlayer);
      if(currentState.equals("Continue")
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
  public static void playerSelect(char[][] board, int playerSelection, int currentPlayer)
  {
    if(currentPlayer = 1)
    {
      switch playerSelection:
        case '1':
					board[0][0] = 'X';
        case '2':
    	  	board[0][1] = 'X';
        case '3':
    	  	board[0][2] = 'X';
        case '4':
    	  	board[1][0] = 'X';
        case '5':
    	  	board[1][1] = 'X';
        case '6':
    	  	board[1][2] = 'X';
        case '7':
    	  	board[2][0] = 'X';
        case '8':
    	  	board[2][1] = 'X';
        case '9':
    	  	board[2][2] = 'X';
    }
    else
    {
      switch playerSelection:
        case '1':
    	  	board[0][0] = 'O';
        case '2':
    	  	board[0][1] = 'O';
        case '3':
    	  	board[0][2] = 'O';
        case '4':
    	  	board[1][0] = 'O';
        case '5':
    	  	board[1][1] = 'O';
        case '6':
    	  	board[1][2] = 'O';
        case '7':
    	  	board[2][0] = 'O';
        case '8':
    	  	board[2][1] = 'O';
        case '9':
    	  	board[2][2] = 'O';
    }
		return board;
  }

	// Check if selected cell is empty
	public static boolean cellEmpty(char[][] board, int playerSelection)
	{
		switch playerSelection:
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
		return false;
	}

	// Ask for input
	public static void playerSelect(char[][] board, int currentPlayer)
	{
		Scanner in = new Scanner();

		
	}

  // Check game state
  public static String gameState(char[][] board, int currentPlayer)
  {
    if((board[0][0] == board[0][1] && board[0][1] == board[0][2]) ||
       (board[1][0] == board[1][1] && board[1][1] == board[1][2]) ||
       (board[2][0] == board[2][1] && board[2][1] == board[2][2]) ||
       (board[0][0] == board[1][0] && board[1][0] == board[2][0]) ||
       (board[0][1] == board[1][1] && board[1][1] == board[2][1]) ||
       (board[0][2] == board[1][2] && board[1][2] == board[2][2]) ||
       (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
       (board[2][0] == board[1][1] && board[1][1] == board[0][2]))
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
