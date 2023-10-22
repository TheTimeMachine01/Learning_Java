package Mind_Riddle;

import java.util.Scanner;

// ## Swap the Number Program ##

public class Ques1
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("## Welcome To the swap program ## \n \n");

        System.out.print("Enter the 1st Number : ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the 2nd Number : ");
        String num2 = scanner.nextLine();
        scanner.close();

        int Num1 = Integer.parseInt(num1);
        int Num2 = Integer.parseInt(num2);

        // First Logic : Addition and subtraction

        // Num1 = Num1 - Num2;
        // Num2 = Num1 + Num2;
        // Num1 = Num2 - Num1;

        // Second Logic : If interviewer don't allow you to use addition-subtraction
        Num1 = Num1 ^ Num2;
        Num2 = Num1 ^ Num2;

        Num1 = Num1 ^ Num2;

        System.out.println("The first Number is : " + Num1 + " : Whereas The Second Number is : " + Num2 );
    }
}
