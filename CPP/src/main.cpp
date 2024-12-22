#include <iostream>
#include "Board.h"

int main ()
{
  Board* newGame = new Board();

  newGame->print();

  delete newGame;

  return 0;
}
