package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTicTacToe {

  TicTacToe tictactoe;

  @BeforeEach
  void setUp() {
    
  }


  @Test
  public void testX1Claimed() {
    char[][] board = {{'X', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,1));
  }

  @Test
  public void testX2Claimed() {
    char[][] board = {{'1', 'X', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,2));
  }

  @Test
  public void testX3Claimed() {
    char[][] board = {{'1', '2', 'X'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,3));
  }

  @Test
  public void testX4Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'X', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,4));
  }

  @Test
  public void testX5Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', 'X', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,5));
  }

  @Test
  public void testX6Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', 'X'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,6));
  }

  @Test
  public void testX7Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'X', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,7));
  }

  @Test
  public void testX8Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', 'X', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,8));
  }

  @Test
  public void testX9Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', 'X'}};
    assertEquals(false, GameLogic.cellEmpty(board,9));
  }

  @Test
  public void testO1Claimed() {
    char[][] board = {{'O', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,1));
  }

  @Test
  public void testO2Claimed() {
    char[][] board = {{'1', 'O', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,2));
  }

  @Test
  public void testO3Claimed() {
    char[][] board = {{'1', '2', 'O'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,3));
  }

  @Test
  public void testO4Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'O', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,4));
  }

  @Test
  public void testO5Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', 'O', '6'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,5));
  }

  @Test
  public void testO6Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', 'O'},
                    {'7', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,6));
  }

  @Test
  public void testO7Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'O', '8', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,7));
  }

  @Test
  public void testO8Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', 'O', '9'}};
    assertEquals(false, GameLogic.cellEmpty(board,8));
  }

  @Test
  public void testO9Claimed() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', 'O'}};
    assertEquals(false, GameLogic.cellEmpty(board,9));
  }

  @Test
  public void testVictoryX1() {
    char[][] board = {{'X', 'X', 'X'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX2() {
    char[][] board = {{'1', '2', '3'},
                    {'X', 'X', 'X'},
                    {'7', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX3() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'X', 'X', 'X'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX4() {
    char[][] board = {{'X', '2', '3'},
                    {'X', '5', '6'},
                    {'X', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX5() {
    char[][] board = {{'1', 'X', '3'},
                    {'4', 'X', '6'},
                    {'7', 'X', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX6() {
    char[][] board = {{'1', '2', 'X'},
                    {'4', '5', 'X'},
                    {'7', '8', 'X'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX7() {
    char[][] board = {{'1', '2', 'X'},
                    {'4', 'X', '6'},
                    {'X', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryX8() {
    char[][] board = {{'X', '2', '3'},
                    {'4', 'X', '6'},
                    {'7', '8', 'X'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO1() {
    char[][] board = {{'O', 'O', 'O'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO2() {
    char[][] board = {{'1', '2', '3'},
                    {'O', 'O', 'O'},
                    {'7', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO3() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'O', 'O', 'O'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO4() {
    char[][] board = {{'O', '2', '3'},
                    {'O', '5', '6'},
                    {'O', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO5() {
    char[][] board = {{'1', 'O', '3'},
                    {'4', 'O', '6'},
                    {'7', 'O', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO6() {
    char[][] board = {{'1', '2', 'O'},
                    {'4', '5', 'O'},
                    {'7', '8', 'O'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO7() {
    char[][] board = {{'1', '2', 'O'},
                    {'4', 'O', '6'},
                    {'O', '8', '9'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testVictoryO8() {
    char[][] board = {{'O', '2', '3'},
                    {'4', 'O', '6'},
                    {'7', '8', 'O'}};
    assertEquals("Victory", GameLogic.gameState(board));
  }

  @Test
  public void testContinue() {
    char[][] board = {{'O', '2', '3'},
                    {'4', 'X', '6'},
                    {'7', '8', 'O'}};
    assertEquals("Continue", GameLogic.gameState(board));
  }

  @Test
  public void testDraw() {
    char[][] board = {{'O', 'X', 'O'},
                    {'O', 'X', 'X'},
                    {'X', 'O', 'O'}};
    assertEquals("Draw", GameLogic.gameState(board));
  }

  @Test
  public void testClaimX1Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,1,1)[0][0]);
  }

  @Test
  public void testClaimX2Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,2,1)[0][1]);
  }

  @Test
  public void testClaimX3Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,3,1)[0][2]);
  }

  @Test
  public void testClaimX4Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,4,1)[1][0]);
  }

  @Test
  public void testClaimX5Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,5,1)[1][1]);
  }

  @Test
  public void testClaimX6Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,6,1)[1][2]);
  }

  @Test
  public void testClaimX7Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,7,1)[2][0]);
  }

  @Test
  public void testClaimX8Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,8,1)[2][1]);
  }

  @Test
  public void testClaimX9Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('X', GameLogic.playerSelect(board,9,1)[2][2]);
  }

  @Test
  public void testClaimO1Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,1,2)[0][0]);
  }
  
  @Test
  public void testClaimO2Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,2,2)[0][1]);
  }
  
  @Test
  public void testClaimO3Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,3,2)[0][2]);
  }
  
  @Test
  public void testClaimO4Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,4,2)[1][0]);
  }
  
  @Test
  public void testClaimO5Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,5,2)[1][1]);
  }
  
  @Test
  public void testClaimO6Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,6,2)[1][2]);
  }
  
  @Test
  public void testClaimO7Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,7,2)[2][0]);
  }
  
  @Test
  public void testClaimO8Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,8,2)[2][1]);
  }
  
  @Test
  public void testClaimO9Tile() {
    char[][] board = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};
    assertEquals('O', GameLogic.playerSelect(board,9,2)[2][2]);
  }
}