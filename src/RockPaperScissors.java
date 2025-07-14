import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            String[] rps={"r","p","s"};
            String computerMove=rps[new  Random().nextInt(rps.length)];

            String playerMove;

            while (true){
                System.out.println("Please enter your move (r,p,s) :");
                playerMove=sc.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s") ){
                    break;
            }
                System.out.println("Please enter valid inputs");
        }
            System.out.println("Computer Played:"+computerMove);

            if(playerMove.equals(computerMove)){
                System.out.println("tie!!");
            } else if (playerMove.equals("r")) {
                if(computerMove.equals("p")){
                    System.out.println("you lose!");
                } else if (computerMove.equals("s")) {
                    System.out.println("you Win!!");
                }
            }else if (playerMove.equals("p")) {
                if(computerMove.equals("r")){
                    System.out.println("you win!");
                } else if (computerMove.equals("s")) {
                    System.out.println("you lose!!");

                }
            }else if (playerMove.equals("s")) {
                if(computerMove.equals("p")){
                    System.out.println("you win!");
                } else if (computerMove.equals("r")) {
                    System.out.println("you lose!!");
                }
            }
            System.out.println("Play Again? (y/n)");
            String playAgain= sc.nextLine();

            if(!playAgain.equals("y")){
                break;
            }

            }
        sc.close();
        }

}
