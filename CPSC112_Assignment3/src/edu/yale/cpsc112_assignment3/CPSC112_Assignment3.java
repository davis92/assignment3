package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();

  public static int a = 0; //chapter on global variable
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  
  public static void main(String[] args) {
    makeMySecret();
    isGameOver("1234");
    isGameOver("4321");
    isGameOver("2567");
    isGameOver("1432");
  }

  public static void makeMySecret() {
     // Part 1 code goes here (please leave the next few lines at the end of the makeMySecret method)
	 	  	  
	  a = 1 + r.nextInt(7);
	  
	  do{
	  b = 1 + r.nextInt(7);
	  } while (a==b);
	  
	  do{
	  c = 1 + r.nextInt(7);
	  } while (a==c|| b==c);
	  
	  do{
	  d = 1 + r.nextInt(7);
	  } while (a==d||b==d||c==d);
	  
	  String mySecret = ""+ a + "" + ""+ b + "" + ""+ c + "" +""+ d + "";
	  
	  
    if (DEBUG)
    {
       System.out.println(mySecret);
    }
  }

  public static boolean isGuessValid(String input) 
  {
    // Part 2 code goes here
	  
	  {  
		  try  
		  {  
		   int num = Integer.parseInt(input); 
		   return true;
		  }  
		  catch(NumberFormatException nfe)  
		  {  
			System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
		    return false;  
		  }    
		}
	  	  
  }

  public static boolean isGameOver(String input) 
  {  
	  if (isGuessValid(input) == true)
	  {
		  int match = 0;
		  int place = 0;
		  
		  char w = input.charAt(0);
		  char x = input.charAt(1);
		  char y = input.charAt(2);
		  char z = input.charAt(3);
		  
		  if (a == w )
		  {
		  boolean aw = true;
		  place++;
		  }
		  
		  if (a == x )
		  {
		  boolean ax = true;
		  }
		  
		  if (a == y)
		  {
		  boolean ay = true;
		  }
		  
		  if (a == z)
		  {
		  boolean az = true;
		  }

		  // b time
		  
		  if (b == w )
		  {
		  boolean bw = true;
		  }
		  
		  if (b == x )
		  {
		  boolean bx = true;
		  place++;
		  }
		  
		  if (b == y)
		  {
		  boolean by = true;
		  }
		  
		  if (b == z)
		  {
		  boolean bz = true;
		  }  
		  
		  // c
		  
		  if (c == w )
		  {
		  boolean cw = true;
		  }
		  
		  if (c == x )
		  {
		  boolean cx = true;
		  }
		  
		  if (c == y)
		  {
		  boolean cy = true;
		  place++;
		  }
		  
		  if (c == z)
		  {
		  boolean cz = true;
		  }  
		  
		  //d
		  
		  if (d == w )
		  {
		  boolean dw = true;
		  }
		  
		  if (d == x )
		  {
		  boolean dx = true;
		  }
		  
		  if (d == y)
		  {
		  boolean dy = true;
		  }
		  
		  if (d == z)
		  {
		  boolean dz = true;
		  place++;
		  }  
		  

			  
		  match = 1;
		  match = 2;
		  match = 3;
		  match = 4;
				 
		  place = 1;
		  place = 2;
		  place = 3;
		  place = 4; 

		
		  
	  System.out.println("Your Guess is: " + input + " Your Result is " + match + "," + place);
	  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
}