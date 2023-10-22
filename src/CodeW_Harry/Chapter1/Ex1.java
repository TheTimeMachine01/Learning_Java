package CodeW_Harry.Chapter1;

import java.util.Scanner;

public class Ex1
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st Number : ");
        String num1 = scanner.nextLine();
//        scanner.close();

        System.out.print("Enter the 2nd Number : ");
        String num2 = scanner.nextLine();
        scanner.close();

        int Num1 = Integer.parseInt(num1);
        int Num2 = Integer.parseInt(num2);

        int sum = Num1 + Num2;

        System.out.println("The Sum of the Numbers is : " + sum);

    }
}
