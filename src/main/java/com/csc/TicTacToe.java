public class TicTacToe
{
  public static void main(String[] args)
  {
    char[][] board = {{' ', ' ', ' '},
	    								{' ', ' ', ' '},
											{' ', ' ', ' '}};
    boolean victory = false;
    int currentPlayer = 1;

    while(victory = false)
    {
      printBoard(board);
    
      victory = gameState(board,currentPlayer);

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
    	  	char[0][0] = 'X';
        case '2':
    	  	char[0][1] = 'X';
        case '3':
    	  	char[0][2] = 'X';
        case '4':
    	  	char[1][0] = 'X';
        case '5':
    	  	char[1][1] = 'X';
        case '6':
    	  	char[1][2] = 'X';
        case '7':
    	  	char[2][0] = 'X';
        case '8':
    	  	char[2][1] = 'X';
        case '9':
    	  	char[2][2] = 'X';
    }
    else
    {
      switch playerSelection:
        case '1':
    	  	char[0][0] = 'O';
        case '2':
    	  	char[0][1] = 'O';
        case '3':
    	  	char[0][2] = 'O';
        case '4':
    	  	char[1][0] = 'O';
        case '5':
    	  	char[1][1] = 'O';
        case '6':
    	  	char[1][2] = 'O';
        case '7':
    	  	char[2][0] = 'O';
        case '8':
    	  	char[2][1] = 'O';
        case '9':
    	  	char[2][2] = 'O';
    }
  }

  // Check game state
  public static boolean gameState(char[][] board, int currentPlayer)
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
      return true;
    }
    else if(
    else
    {
      return false;
    }
  }
}
