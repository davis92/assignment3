package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();

  public static void main(String[] args) {
    makeMySecret();
    isGameOver("1234");
    isGameOver("4321");
    isGameOver("2567");
    isGameOver("1432");
  }

  public static void makeMySecret() {
     // Part 1 code goes here (please leave the next few lines at the end of the makeMySecret method)
	 
	  int[] secret = new int[4];
	  
	  secret[0] = 0;
	  secret[1] = 0;
	  secret[2] = 0;
	  secret[3] = 0;
	  
	  secret[0] = 1 + (int)(Math.random()*7);
	  
	  do{
	  secret[1] = 1 + (int)(Math.random()*7);
	  } while (secret[0]==secret[1]);
	  
	  do{
	  secret[2] = 1 + (int)(Math.random()*7);
	  } while (secret[0]==secret[2]||secret[1]==secret[2]);
	  
	  do{
	  secret[3] = 1 + (int)(Math.random()*7);
	  } while (secret[0]==secret[3]||secret[1]==secret[3]||secret[2]==secret[3]);
	  
	  String mySecret = ""+ secret[0] + "" + ""+ secret[1] + "" + ""+ secret[2] + "" +""+ secret[3] + "";
	  
	  System.out.println(mySecret);
	  
    if (DEBUG)
    {
       System.out.println(mySecret);
    }
  }

  public static boolean isGuessValid(String input) {
    // Part 2 code goes here
  }

  public static boolean isGameOver(String input) {
    // Parts 3 and 4 code goes here
  }
}