// Joshua Lennon
// 2/12/24
// Tic Tac Toe Game
// Period 5


import java.util.UUID;
import java.util.Scanner;

public class Player{

  //////////////////////////////////////////////
  // VARIABLES
  //////////////////////////////////////////////
  private final Scanner scn = new Scanner(System.in);
  
  private String username;

  private String playerCode;
  

  //////////////////////////////////////////////
  // CONSTRUCTORS
  //////////////////////////////////////////////

  public Player(String username, String playerCode){
    this.username = username;
    this.playerCode = playerCode;
  }

  public Player(String username){
    this.username = username;
    this.playerCode = makePlayerCode();
  }

  //////////////////////////////////////////////
  // METHODS
  //////////////////////////////////////////////

  public String makePlayerCode(){
    return new UUID().randomUUID().toString();
  }
}
