#include <iostream>
#include "Board.h"

void Board::print()
{
  printf(" %d | %d | %d \n", this->table[0],this->table[1],this->table[2]);
  printf("---+---+---\n");
  printf(" %d | %d | %d \n", this->table[3],this->table[4],this->table[5]);
  printf("---+---+---\n");
  printf(" %d | %d | %d \n", this->table[6],this->table[7],this->table[8]);
}
