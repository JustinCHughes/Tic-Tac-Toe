package com.csc;

import java.util.Scanner;

public class Validation
{
  // Validates that user input an integer before any further checks on input
  public static int integerCheck(String prompt)
  {
    Scanner in = new Scanner(System.in);
    int userInput = -1;

    while(true)
    {
      System.out.println(prompt);
      if(in.hasNextInt())
      {
        userInput = in.nextInt();
        break;
      }
      System.out.println("That is not an integer. Please input an integer");
      in.nextLine();
    }
    return userInput;
  }

  // Validates that user inputs a character that isn't a space, enter or tab
  public static char charCheck(String prompt)
  {
    Scanner in = new Scanner(System.in);
    String userInput;

    while(true)
    {
      System.out.println(prompt);
      // Try will fail if user input whitespace because strip will
      // convert value to null
      try
      {
        // Intakes userinput without whitespace
        userInput = in.nextLine().strip();
        // Rejects inputs of more than a single character
        if(userInput.length() > 1)
        {
          System.out.println("Inputs of more than one character are invalid\n");
        }
        // Check passed. Going back to user
        else
        {
          System.out.println("User has selected: " + userInput);
          return userInput.charAt(0);
        }
      }
      // Catches nulls after strip which informs user not to use whitespace
      // characters
      catch(Exception NullPointerException)
      {
        System.out.println("Tabs, spaces, and enters are invalid custom characters\n");
      }
    }
  }
}
