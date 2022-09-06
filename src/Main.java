package bullscows;
import java.lang.Object;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String compNum="";
        Random random = new Random();
        String Symbols="0123456789abcdefghijklmnopqrstuvwxyz";
        String secretCode ="***********************************";
        int n=0;
        int range;
        String str="";


        while(true){
            try{
                System.out.println("Input the length of the secret code:");
                str = scanner.nextLine();
                n = Integer.valueOf(str);
                if(n > 36 || n < 1)
                    System.out.println("Error: invalid length");
                else
                    break;
            }catch (NumberFormatException e){
                System.out.printf("Error: \"%s\" isn't a valid number.",str);
            }
        }

        while(true){
            try{
                System.out.println("Input the number of possible symbols in the code:");
                str = scanner.nextLine();
                range = Integer.valueOf(str);
                if(range > 36 || range < 1)
                    System.out.println("Error:  number of possible symbols in the code is 36 (0-9, a-z).");
                else if(range < n)
                    System.out.println("Error: maximum number of possible symbols must be greater than length the code");
                else
                    break;
            }catch (NumberFormatException e){
                System.out.printf("Error: \"%s\" isn't a valid number.",str);
            }
        }

        for (int i = 0; i < n; i++) {
            while (true){
                int ranNum= random.nextInt((range-1) + 1);
                if(compNum.contains(String.valueOf(Symbols.charAt(ranNum))) == false) {
                    compNum += Symbols.charAt(ranNum);
                }
                else  break;
            }
        }


        System.out.printf("The secret is prepared: %s (%s).", secretCode.substring(0, n),
                range < 10 ? "0-"+Symbols.charAt(range) : "0-9, " + Symbols.charAt(10) +"-"+ Symbols.charAt(range-1));
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