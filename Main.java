/*
This project must play Tic-Tac-Toe.

For the first in-class demonstration, you must have the following:
1) a static constand 2-D Array the represnets the board and holds the STATE data for the game.
2) You must correctly resolve:
  horizontal, 
  diagonal, 
  vertical winner conditions
  And a draw
3) You must have 1 player.

For the future and more points above an A-...
0) You must correctly resolve all win and draw states
1) You should have a seond player
2) You should be able to play on a 4 x 4 board
3) You should correctly resolve turns
4) The player and the game should be in seperate classes from your static Main


For more in the future and more awesomer...
1) You can have a text file documenting player win-loss records and another stat of your choice
2) You can have a 3rd or 4th player
3) You can have a 3rd dimension to the game
4) You can make a new class for a game session as well as a single game
5) You can make a new class for a turn, or a piece, or a screen painter
*/

// Joshua Lennon
// 2/12/24
// Tic Tac Toe Game
// Period 5


import java.util.Arrays;
import java.util.Random;

class Main {

  public static final String[][] STATE = {
      { "2", "", "1" },
      { "", "1", "2" },
      { "2", "1", "2" },
  };

  public static void main(String[] args) {
    System.out.println(checkWin());
  }

  // Looks through all diags and straights for a win case
  // Returns boolean if there is a win
  public static boolean checkWin() {
    // Diagonal checks
    if (checkLine(0, 0, 1, 1) || checkLine(0, STATE.length - 1, 1, -1)) {
      return true;
    }
    // Straight check
    for (int i = 0; i < STATE.length; i++) {
      if (checkLine(i, 0, 0, 1) || checkLine(0, i, 1, 0)) {
        return true;
      }
    }

    return false;
  }

  // Takes in a start y and x, and an increment amount for each
  // Uses that info to increment through a line in 2d array
  // Checks if that line is all one player's with boolean
  // Returns boolean
  public static boolean checkLine(int startRow, int startCol, int rowIncrement, int colIncrement) {
    String[] lineVals = new String[STATE.length];
    for (int i = 0; i < STATE.length; i++) {
      lineVals[i] = STATE[startRow + i * rowIncrement][startCol + i * colIncrement];
      System.out.print(lineVals[i] + " ");
    }
    System.out.println();
    return inARow(lineVals);
  }

  public static boolean inARow(String[] vals) {
    String val = vals[0];
    for (int i = 1; i < vals.length; i++) {
      if (vals[i] != val)
        return false;
    }
    return true;
  }

  public static boolean isBoardFull(){
    for(String[] i : STATE){
      for(String j : i){
        if(j == null) return false;
      }
    }
    return true;
  }

  public static void printBoard(int[][] board) {
    System.out.println("+---+---+---+");
    for (int[] i : board) {
      System.out.print("|");
      for (int j : i) {
        System.out.print(" " + ((j == 0) ? " " : (j == 1) ? "X" : "O") + " ");
        System.out.print("|");
      }
      System.out.println();
      System.out.println("+---+---+---+");
    }
  }
}