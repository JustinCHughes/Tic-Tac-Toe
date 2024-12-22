#include <iostream>

class Board
{
  private:
    int table[9] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

  public:
    Board() {}

    void print();
    void choose(int choice);
    void checkFill(int choice);
    int gameState();
};
