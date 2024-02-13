// Joshua Lennon
// 2/12/24
// Tic Tac Toe Game
// Period 5


import java.util.Random;
import java.util.Scanner;

public class Player{

  //////////////////////////////////////////////
  // VARIABLES
  //////////////////////////////////////////////
  private final Scanner scn = new Scanner(System.in);
  private final Random rand = new Random();
  
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
    return "" + rand.nextInt(100000000);
  }

  public String getUsername() {
	 return username;
  }

  public String getPlayerCode() {
	 return playerCode;
  }
  
}
