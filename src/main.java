import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class main {
    public static void main(String [] args) throws Exception{


        //TODO: Read random file line done
        // continue working on classes* no need
        // continue improving the code doing
        // add toUpperCase() to make a better code useless
        // stop and shows you win. done

        File file = new File ("D:\\learning\\guessTheMovie\\src\\movies.txt");
        Scanner scanner = new Scanner (file);
        //count: the number of the names in the file
        int countMovie = 0;
        //create an array to store the movie
        String [] movieList = new String[100];
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println("The movies include: " + line);
            movieList[countMovie] = line;
            countMovie ++;
        }
        System.out.println(countMovie +" movies are in the file");

        //random pick one movie from the pool
        String selectedMovie = movieList[(int)(Math.random() * countMovie)];
        System.out.println("selected movie is " + selectedMovie);

        String test = selectedMovie;
        char [] guess = new char[100];

        for(int i=0;i<test.length();i++){
            if (test.charAt(i) == ' '){
                System.out.print(" ");
                guess[i]=' ';
            }
            else{
                System.out.print("_");
                guess[i] = '_';
            }
        }
        int i = 10;

        char [] wrongNumber = new char[100];

        Scanner scan = new Scanner(System.in);
        int wrong =0;
        while(i>0) {
            boolean found = false;
            System.out.println("\nYou have "+i+" attempts to find the right movie name.");
            char letter = scan.next().charAt(0);

            for (int j = 0; j < test.length(); j++) {
                if (test.charAt(j) == letter) {
                    found = true;
                    guess[j] = letter;
                }
            }

            for (int f=0; f <guess.length; f++){
                System.out.print(guess[f]);
            }
            int missed = 0;
            for (int o=0; o< guess.length; o++) {
                if (guess[o] == '_') {
                    missed++;
                }
            }

            if (missed == 0) {
                System.out.println(" You won！");
                return;
            }

            if (found ==false){
                wrongNumber[wrong] = letter;
                wrong++;

                i--;
                System.out.println(" You have guessed ( " + wrong + ") wrong numbers: ");

            }
        }
        System.out.println("Better luck next time!");




    }

}
