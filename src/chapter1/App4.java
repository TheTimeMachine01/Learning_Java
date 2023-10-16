package chapter1;

import java.util.Scanner;

public class App4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the User to enter Their Name :
        System.out.print("Enter your Name : ");

        // Reading user input as String :
        String name = scanner.nextLine();

        scanner.close();

        // display the  greeting
        System.out.println("Hello ! " + name + ", Have a good Day!");

    }
}
