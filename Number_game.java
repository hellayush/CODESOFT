import java.util.*;
public class Number_game {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    //  1.  Initializing the Max and Min Range(i.e MaxRange to 100  and MinRange to 1).
    int MaxRange = 100;
    int MinRange = 1;
    
    int MaxAttempts = 7;
    int rounds = 0 ;
    int totalAttempts = 0;
    int roundWon = 0;
    System.out.println("**********************************");
    System.out.println("Welcome to the Guesser Game!!\n");
    System.out.println("**********************************");    

    while (true) {
        rounds++;
        // 2. Generating a Random number using the random number from the range of 1 - 100
        int GuesserNumber = (int) (Math.random() * (MaxRange-MinRange+1));
        int attempt = 0 ;
        System.out.println("\n");
        System.out.println("Round " + rounds);

        System.out.println("Guess the number from range " + MinRange + " to " + MaxRange + " . You have " + MaxAttempts + " attempts");

        while(attempt<MaxAttempts)
        {
            System.out.println("Enter your Guess --> ");
            int guess = sc.nextInt();
            sc.nextLine();
            attempt++;
 /*  3 .   Comparing the user's guess with the generated number and providing feedback on whether the guess
            is correct, too high, or too low */
                if(guess==GuesserNumber)
                {
                    System.out.println("*********************************************************************");
                    System.out.println("Congrats!! you have gueesed the Number right ! You Won ");
                    System.out.println("*********************************************************************");
                    roundWon++;
                    break;
                }
                else if(guess<GuesserNumber)
                {
                    System.out.println("Number you Guessed is  low !! Think of a higher number !!");
                }
                else 
                {
                    System.out.println("Number you Guessed is high !! Think of a lower number !!");
                }
            }
            // 4.  Limit the number of attempts the user has to guess the number.
            if(attempt>=MaxAttempts)
            {
                System.out.println("*********************************************************************");
                System.out.println("Sorry you have ran out of Attempts ! The Number was " + GuesserNumber );
                System.out.println("*********************************************************************");
            }

            // 5 .  Add the option for multiple rounds, allowing the user to play again.
            System.out.println("Do you want to play once more ?? ");
            System.out.println("(Yes/No)");
            String decide = sc.nextLine();

            if (!decide.equalsIgnoreCase("yes")) {
                break;
        }
    }

    System.out.println("Game Is over !! ");
            // 6 .  Displaying the user's score, which can be based on the number of attempts taken or rounds won.
    System.out.println("*************************************************************");        
    System.out.println("You won total of " + roundWon + " Rounds !!");
    System.out.println("***************************************************************");

    

    }

}

  
   
