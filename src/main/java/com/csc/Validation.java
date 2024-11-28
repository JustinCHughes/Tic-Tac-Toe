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
    char userInput = '\t';
    char[] invalid = {'\t', '\n', ' '};

    while(true)
    {
      System.out.println(prompt);
      if(in.hasNext())
      {
        userInput = in.findInLine(".").charAt(0);
      }
      if(userInput == '\t' || userInput == ' ' || userInput == '\n')
      {
        System.out.println("Try again. Spaces, tabs, and enters are invalid.");
        in.nextLine();
      }
      else
      {
        return userInput;
      }
    }
  }
}
