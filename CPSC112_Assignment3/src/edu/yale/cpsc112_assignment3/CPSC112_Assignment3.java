package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();

  public static int a = 0; //this makes a global variable - chapter on global variable
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  public static int exception = 3;
  public static int previousvalue = 0;
  public static int highguess = 0;
  
  public static void main(String[] args) 
  {
    makeMySecret();
    isGameOver("1234");
    isGameOver("4321");
    isGameOver("2567");
    isGameOver("1432");
    isGameOver("9999");
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
			  String r = input.substring(0,1);
			  String s = input.substring(1,2);
			  String t = input.substring(2,3);
			  String q = input.substring(3,4);
			  
			  int w = Integer.parseInt(r);
			  int x = Integer.parseInt(s);
			  int y = Integer.parseInt(t);
			  int z = Integer.parseInt(q); 
		   
			  if (w < 1 || w > 7)
			  {
				  System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
				  return false;
			  }
			  
			  else if (x < 1 || x > 7)
			  {
				  System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
				  return false;
			  }
			  
			  else if (y < 1 || y > 7)
			  {
				  System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
				  return false;
			  }
			  
			  else if (z < 1 || z > 7)
			  {
				  System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
				  return false;
			  }
			  else
			  {
				  return true; 
			  }
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
		  
		  String mySecret = ""+ a + "" + ""+ b + "" + ""+ c + "" +""+ d + "";
		  int currentguess = Integer.parseInt(input);
		  //int highguess = 0000;
		  
		  String r = input.substring(0,1);
		  String s = input.substring(1,2);
		  String t = input.substring(2,3);
		  String q = input.substring(3,4);
		  
		  int w = Integer.parseInt(r);
		  int x = Integer.parseInt(s);
		  int y = Integer.parseInt(t);
		  int z = Integer.parseInt(q);
		  

		  if (a == w )
		  {
			  match++;
		  place++;
		  }
		  
		  if (a == x )
		  {
		  match++;
		  }
		  
		  if (a == y)
		  {
		  match++;
		  }
		  
		  if (a == z)
		  {
		  match++;
		  }

		  // b time
		  
		  if (b == w )
		  {
			  match++;
		  }
		  
		  if (b == x )
		  {
			  match++;
		  place++;
		  }
		  
		  if (b == y)
		  {
			  match++;
		  }
		  
		  if (b == z)
		  {
			  match++;
		  }  
		  
		  // c
		  
		  if (c == w )
		  {
			  match++;
		  }
		  
		  if (c == x )
		  {
			  match++;
		  }
		  
		  if (c == y)
		  {
			  match++;
		  place++;
		  }
		  
		  if (c == z)
		  {
			  match++;
		  }  
		  
		  //d
		  
		  if (d == w )
		  {
			  match++;
		  }
		  
		  if (d == x )
		  {
			  match++;
		  }
		  
		  if (d == y)
		  {
			  match++;
		  }
		  
		  if (d == z)
		  {
			  match++;
		  place++;
		  }  
	
		  if (place != 4)
		  {
			  System.out.println("Your Guess is: " + input + " Your Result is " + match + "," + place);
			  
			  if (currentguess < highguess)
				  
				  if (exception > 0)
				  {
					  exception--;
					  System.out.println("Your guess was lower than allowed. You have " + exception + " exceptions remaining.");
					  
				  }
				  
				  if (exception == 0)
				  {
					  System.out.println("You're out of exceptions and you've guessed too high! The secret was " + mySecret);
	
					  exception = 3;
					  makeMySecret();
					  
					  System.out.println("I've reset your exceptions and the secret number so you can try again ");
					  
				  }
		  }
		  
		  else
		  {
			  System.out.println("Your Guess: " + input + " is perfect!!! Congratulations!!!");
		  }
		  
		  previousvalue = Integer.parseInt(input);
		  
		  if (previousvalue > highguess)
		  {
			  highguess = previousvalue;
		  }
		  
		  return true;
	  }
	  
	  
	  else
	  {
		  return false;
	  }
  }
}