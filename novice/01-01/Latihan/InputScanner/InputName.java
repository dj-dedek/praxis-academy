package InputScanner;

import java.util.Scanner;

public class InputName
{
    public static void main(String[] args)
    {
        Scanner InputName = new Scanner(System.in);

        System.out.println("what is your name ?");

        String name = InputName.nextLine();

        System.out.println("Hello "+name);

        // InputName.close();
    }
}