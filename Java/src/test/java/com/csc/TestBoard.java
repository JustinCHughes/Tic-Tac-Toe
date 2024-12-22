package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBoard {

  Board game;

  @BeforeEach
  void setUp() {
    game = new Board();
  }

  @Test
  void testCell1Empty() {
    assertEquals(true,game.cellEmpty(1));
  }

  @Test
  void testCell2Empty() {
    assertEquals(true,game.cellEmpty(2));
  }

  @Test
  void testCell3Empty() {
    assertEquals(true,game.cellEmpty(3));
  }

  @Test
  void testCell4Empty() {
    assertEquals(true,game.cellEmpty(4));
  }

  @Test
  void testCell5Empty() {
    assertEquals(true,game.cellEmpty(5));
  }

  @Test
  void testCell6Empty() {
    assertEquals(true,game.cellEmpty(6));
  }

  @Test
  void testCell7Empty() {
    assertEquals(true,game.cellEmpty(7));
  }

  @Test
  void testCell8Empty() {
    assertEquals(true,game.cellEmpty(8));
  }

  @Test
  void testCell9Empty() {
    assertEquals(true,game.cellEmpty(9));
  }

  @Test
  void testTakenP1Cell1Empty() {
    game.assignP1('X');
    game.playerSelect(1,1);
    assertEquals(false,game.cellEmpty(1));
  }

  @Test
  void testTakenP1Cell2Empty() {
    game.assignP1('X');
    game.playerSelect(2,1);
    assertEquals(false,game.cellEmpty(2));
  }

  @Test
  void testTakenP1Cell3Empty() {
    game.assignP1('X');
    game.playerSelect(3,1);
    assertEquals(false,game.cellEmpty(3));
  }

  @Test
  void testTakenP1Cell4Empty() {
    game.assignP1('X');
    game.playerSelect(4,1);
    assertEquals(false,game.cellEmpty(4));
  }

  @Test
  void testTakenP1Cell5Empty() {
    game.assignP1('X');
    game.playerSelect(5,1);
    assertEquals(false,game.cellEmpty(5));
  }

  @Test
  void testTakenP1Cell6Empty() {
    game.assignP1('X');
    game.playerSelect(6,1);
    assertEquals(false,game.cellEmpty(6));
  }

  @Test
  void testTakenP1Cell7Empty() {
    game.assignP1('X');
    game.playerSelect(7,1);
    assertEquals(false,game.cellEmpty(7));
  }

  @Test
  void testTakenP1Cell8Empty() {
    game.assignP1('X');
    game.playerSelect(8,1);
    assertEquals(false,game.cellEmpty(8));
  }

  @Test
  void testTakenP1Cell9Empty() {
    game.assignP1('X');
    game.playerSelect(9,1);
    assertEquals(false,game.cellEmpty(9));
  }

  @Test
  void testTakenP2Cell1Empty() {
    game.assignP2('O');
    game.playerSelect(1,2);
    assertEquals(false,game.cellEmpty(1));
  }

  @Test
  void testTakenP2Cell2Empty() {
    game.assignP2('O');
    game.playerSelect(2,2);
    assertEquals(false,game.cellEmpty(2));
  }

  @Test
  void testTakenP2Cell3Empty() {
    game.assignP2('O');
    game.playerSelect(3,2);
    assertEquals(false,game.cellEmpty(3));
  }

  @Test
  void testTakenP2Cell4Empty() {
    game.assignP2('O');
    game.playerSelect(4,2);
    assertEquals(false,game.cellEmpty(4));
  }

  @Test
  void testTakenP2Cell5Empty() {
    game.assignP2('O');
    game.playerSelect(5,2);
    assertEquals(false,game.cellEmpty(5));
  }

  @Test
  void testTakenP2Cell6Empty() {
    game.assignP2('O');
    game.playerSelect(6,2);
    assertEquals(false,game.cellEmpty(6));
  }

  @Test
  void testTakenP2Cell7Empty() {
    game.assignP2('O');
    game.playerSelect(7,2);
    assertEquals(false,game.cellEmpty(7));
  }

  @Test
  void testTakenP2Cell8Empty() {
    game.assignP2('O');
    game.playerSelect(8,2);
    assertEquals(false,game.cellEmpty(8));
  }

  @Test
  void testTakenP2Cell9Empty() {
    game.assignP2('O');
    game.playerSelect(9,2);
    assertEquals(false,game.cellEmpty(9));
  }

  @Test
  void testP1Win1() {
    game.assignP1('X');
    game.playerSelect(1,1);
    game.playerSelect(2,1);
    game.playerSelect(3,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win2() {
    game.assignP1('X');
    game.playerSelect(4,1);
    game.playerSelect(5,1);
    game.playerSelect(6,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win3() {
    game.assignP1('X');
    game.playerSelect(7,1);
    game.playerSelect(8,1);
    game.playerSelect(9,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win4() {
    game.assignP1('X');
    game.playerSelect(1,1);
    game.playerSelect(4,1);
    game.playerSelect(7,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win5() {
    game.assignP1('X');
    game.playerSelect(2,1);
    game.playerSelect(5,1);
    game.playerSelect(8,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win6() {
    game.assignP1('X');
    game.playerSelect(3,1);
    game.playerSelect(6,1);
    game.playerSelect(9,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win7() {
    game.assignP1('X');
    game.playerSelect(1,1);
    game.playerSelect(5,1);
    game.playerSelect(9,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP1Win8() {
    game.assignP1('X');
    game.playerSelect(3,1);
    game.playerSelect(5,1);
    game.playerSelect(7,1);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win1() {
    game.assignP2('O');
    game.playerSelect(1,2);
    game.playerSelect(2,2);
    game.playerSelect(3,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win2() {
    game.assignP2('O');
    game.playerSelect(4,2);
    game.playerSelect(5,2);
    game.playerSelect(6,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win3() {
    game.assignP2('O');
    game.playerSelect(7,2);
    game.playerSelect(8,2);
    game.playerSelect(9,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win4() {
    game.assignP2('O');
    game.playerSelect(1,2);
    game.playerSelect(4,2);
    game.playerSelect(7,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win5() {
    game.assignP2('O');
    game.playerSelect(2,2);
    game.playerSelect(5,2);
    game.playerSelect(8,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win6() {
    game.assignP2('O');
    game.playerSelect(3,2);
    game.playerSelect(6,2);
    game.playerSelect(9,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win7() {
    game.assignP2('O');
    game.playerSelect(1,2);
    game.playerSelect(5,2);
    game.playerSelect(9,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testP2Win8() {
    game.assignP2('O');
    game.playerSelect(3,2);
    game.playerSelect(5,2);
    game.playerSelect(7,2);
    assertEquals("Victory",game.gameState());
  }

  @Test
  void testGameStateContinue1() {
    game.assignP1('X');
    game.assignP2('O');
    game.playerSelect(1,2);
    game.playerSelect(2,1);
    game.playerSelect(3,2);
    assertEquals("Continue",game.gameState());
  }

  @Test
  void testGameStateContinue2() {
    game.assignP1('X');
    game.assignP2('O');
    game.playerSelect(1,2);
    game.playerSelect(5,1);
    game.playerSelect(9,1);
    assertEquals("Continue",game.gameState());
  }

  @Test
  void testGameStateContinue3() {
    game.assignP1('1');
    game.assignP2('1');
    game.playerSelect(1,2);
    game.playerSelect(5,1);
    game.playerSelect(9,1);
    assertEquals("Continue",game.gameState());
  }

  @Test
  void testGameStateDraw() {
    game.assignP1('X');
    game.assignP2('O');
    game.playerSelect(1,1);
    game.playerSelect(2,2);
    game.playerSelect(3,1);
    game.playerSelect(5,2);
    game.playerSelect(4,1);
    game.playerSelect(6,2);
    game.playerSelect(8,1);
    game.playerSelect(7,2);
    game.playerSelect(9,1);
    assertEquals("Draw", game.gameState());
  }
}