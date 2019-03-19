package com.samples.usage;

/**
 * This class is used to understand the usage of 'static' keyword
 * 1: static keyword can be applied with 1)variables, 2)methods, 3)blocks and 4)nested classes
 * 2: static keyword belongs to class not to instance
 * 3: static variables are initialised at the time of class loading
 * 4: static properties are shared by all objects
 * 5: static method or object is called without creating object
 * 6: static methods accesses static variables.
 * 7: static methods can not access non static members or methods.
 * 8: Keyword "super" or "this" is not applied to static method or static variables.
 * 9: static block is used to initialise static data members
 * 10: static block is called before main() method at the time of class loading
 * 11: Before to JDK 1.7 we could execute a programm without main() method via static block.
 * after jdk 1.7 it is not possible
 * @author Rafique Mujawar
 * Date 05-07-2018
 */
public class UseOfStatic {

  {
    System.out.println("cgusv");
  }

  static {
    System.out.println("sdklhiu");
  }

  /**
   * Static methods and variables have been Stored in the PERMGEN space before the 8th version
   * of the java. But,now they have introduced a new memory space called "METASPACE" now this is
   * the place where all those name and fields of the class, methods of a class with the bytecode
   * of the methods, constant pool, JIT optimizations  etc are stored.

   Reason for removing PERMGEN in java 8.0 is
   * METASPACE is very hard to predict the required  size of PERMGEN..
   * METASPACE helps in improving Garbage Collection Performance and Class data-de allocation..
   */
  static int myPrimitive = 1; //the value 1 is stored in the METASPACE section
  static Player coach = new Player("Sam",0); //the reference(pointer/memory address) coach is
  // stored
  // in the METASPACE section, the object itself is not.Object is stored in heap.


  public static void main(String args[]){
    if(null == args){
      System.out.println("Arguments are null");
    } else if(args.length ==0){
      System.out.println("Arguments are not null but empty");
    } else {
      System.out.println("Arguments have values:");
      for(String s: args){
        System.out.println(s);
      }
    }

    Player sachin = new Player("Sachin",99);
    Player virat = new Player("Virat",70);
    Player savrav = new Player("Savrav",120);
    Player zahir = new Player("Zahir",17);
    Player.updateTeamScore(sachin.getPlayerScore());
    Player.updateTeamScore(virat.getPlayerScore());
    Player.updateTeamScore(savrav.getPlayerScore());
    Player.updateTeamScore(zahir.getPlayerScore());
  }
  //TODO 1: Static inner class
  static class Player{
    //TODO 2: Static member variable, also called as class variable
    private static int teamScore ;
    private String playerName;
    private int playerScore;

    //TODO 2: static block
    static {
      teamScore = 0;
      System.out.println("team score initialised to 0.");
    }

    public Player(String playerName, int playerScore) {
      this.playerName = playerName;
      this.playerScore = playerScore;
    }

    public static int getTeamScore() {
      return teamScore;
    }

    //TODO 3: static method, also called as class method
    public static void updateTeamScore(int playerScore) {
      System.out.println("Existing team score:"+Player.teamScore+" player score to be added:"+playerScore);
      Player.teamScore = Player.teamScore + playerScore;
      System.out.println("Total Team score is: "+Player.teamScore);
    }

    public String getPlayerName() {
      return playerName;
    }

    public void setPlayerName(String playerName) {
      this.playerName = playerName;
    }

    public int getPlayerScore() {
      return playerScore;
    }

    public void setPlayerScore(int playerScore) {
      this.playerScore = playerScore;
    }
  }

}
