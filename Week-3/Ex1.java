import java.util.Random;
import java.util.Scanner;

class GuessGame {

    int totalGamesPlayed;
    int totalGuesses;
    double averageGuessesPerGame;
    
    GuessGame() {
        totalGamesPlayed = 0;
        totalGuesses = 0;
        averageGuessesPerGame = 0;
    }

    void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100)+1;

        System.out.println("\n\n---New Game---");
        System.out.println("A secret number between 1 and 100 has been generated");
        for(int i = 0;i < 10;i++) {
            int guessNumber;
            System.out.println("Enter your guess number : ");
            guessNumber = sc.nextInt();
            if(guessNumber==-1) {
                System.out.println("Game aborted by user");
                System.out.println("You have used "+(i)+" attempts"); 
                totalGamesPlayed++;
                return;
            }
            else if(!(guessNumber>=1) || !(guessNumber<=100)) {
                i--;
                continue;
            }
            else {
                totalGuesses++;
                if(guessNumber==secretNumber) {
                    System.out.println("\nCongratulations ! Your guessed number is correct\n\nGame Over !");
                    System.out.println("You have used "+(i+1)+" attempts");
                    totalGamesPlayed++;
                    return;
                }
                else if(guessNumber > secretNumber) {
                    System.out.println("Your guess number is too high");
                }
                else if(guessNumber < secretNumber) {
                    System.out.println("Your guess number is too low");
                }
            }
        }
        System.out.println("The secret number was : "+secretNumber);
        System.out.println("You have used all your attempts\n\nGame Over !");
        totalGamesPlayed++;
    }

    void viewStatus() {
        System.out.println("---Game statistics---");
        if(totalGamesPlayed == 0) {
            System.out.println("No games played");
        }
        else {
            System.out.println("Total games played : "+totalGamesPlayed);
            System.out.println("Total guesses : "+totalGuesses);

            averageGuessesPerGame = (double) totalGuesses/totalGamesPlayed;

            System.out.println("Average guesses per game : "+averageGuessesPerGame);
        }
    }
}

class GuessGameTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Navaneedan S\n2024503557\n");
        GuessGame player1 = new GuessGame();
        System.out.println("Welcome to the guess game!\nYou have 10 attempts to guess\nAll the very best");
        GuessGame:
        do {
            int gameOptions;
            System.out.println("\n\n---Game menu---");
            System.out.println("1.Play Game\n2.View Status\n3.Quit");
            System.out.println("Enter your option : ");
            gameOptions = s.nextInt();
            switch(gameOptions) {
                case 1 : player1.playGame(); break;
                case 2 : player1.viewStatus(); break;
                case 3 : System.out.println("\n---Exit---"); break GuessGame;
                default : System.out.println("Invalid option"); continue GuessGame;
            }
        }while(true);
    }
}
