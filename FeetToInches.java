// Project 2, 5/19/2023, FeetToInches.java, Stacey Chaiken

import java.util.Scanner;

public class FeetToInches

{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of feet: ");
    double feet = input.nextDouble();
    double inches = feet * 12;
    System.out.println(feet + " feet is equal to " + inches + " inches.");
  } // end of main
} // end of class