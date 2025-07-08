import java.util.Scanner;
import java.util.Random;

class NumberGame
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String play="yes";

        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while(guess != randNum)
            {
                System.out.print("Guess a number between 1 and 100 :");
                guess = scan.nextInt();
                tries++;

                if(guess == randNum)
                {
                    System.out.println("your guess is correct well done!!");
                    System.out.println("would you like to play again? yes or no:");
                    play=scan.next().toLowerCase();
                }
                else if(guess > randNum)
                {
                    System.out.println("your guess is too high,choose some lower number:");
                }
                else
                {
                    System.out.println("your guess is too low,choose some higher number:");
                }
            }
        }
        scan.close();
    }
}