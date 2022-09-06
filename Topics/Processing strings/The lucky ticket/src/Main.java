import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tick = scanner.nextLine().split("");
        if(Integer.valueOf(tick[0]) + Integer.valueOf(tick[1]) + Integer.valueOf(tick[2]) ==
                Integer.valueOf(tick[3]) + Integer.valueOf(tick[4]) + Integer.valueOf(tick[5]))
            System.out.println("Lucky");
        else System.out.println("Regular");
    }
}