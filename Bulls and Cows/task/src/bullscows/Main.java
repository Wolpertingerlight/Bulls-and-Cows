package bullscows;
import java.lang.Object;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String compNum="";
        Random random = new Random();
        String Symbols="0123456789abcdefghijklmnopqrstuvwxyz";
        String secretCode ="***********************************";

        try{
            System.out.println("Please, enter the secret code's length:");
            int n = scanner.nextInt();
            scanner.nextLine();

        }
        catch (InputMismatchException e){
            System.out.printf"Error: \"abc 0 -7\" isn't a valid number.();
        }
        try{

        }
        catch (){

        }
        System.out.println("Input the number of possible symbols in the code:");
        int range = scanner.nextInt();
        scanner.nextLine();



        if(n < 36 && n > 0){
            for (int i = 0; i < n; i++) {
                while (true){
                    int ranNum= random.nextInt((range-1) + 1);
                    if(compNum.contains(String.valueOf(Symbols.charAt(ranNum))) == false){
                        compNum += Symbols.charAt(ranNum);
                        break;
                    }
                }
            }
        }
        else
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.",n);



        System.out.printf("The secret is prepared: %s (%s).", secretCode.substring(0, n),
                range < 11 ? "0-"+Symbols.charAt(range) : "0-9, " + Symbols.charAt(10) +"-"+ Symbols.charAt(range-1));
        System.out.println("Okay, let's start a game!");


        int Iteration = 1;

        while(true){
            System.out.println("Turn " + Iteration + ":");
            int Bulls = 0;
            int Cows = 0;

            String myNum = scanner.nextLine();
            for (int i = 0; i < n; i++){

                if(myNum.charAt(i) == compNum.charAt(i))
                    Bulls++;
                else if(myNum.contains(String.valueOf(compNum.charAt(i))))
                    Cows++;
            }
            if(Bulls > 0 && Cows > 0)
                System.out.printf("Grade: %d bull(s) and %d cow(s). ",Bulls, Cows);
            else if(Bulls > 0){
                System.out.printf("Grade: %d bull(s).",Bulls);
                if(Bulls == n){
                    System.out.println("Congratulations! You guessed the secret code.");
                    return;
                }
            }
            else if(Cows > 0)
                System.out.printf("Grade: %d cow(s).",Cows);
            else
                System.out.println("Grade: None.");

            Iteration++;
        }
    }
}
