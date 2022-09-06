import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] str = scanner.nextLine().split("\\s+");

        System.out.println(Math.pow(Double.parseDouble(str[0]),Double.parseDouble(str[1])));
    }
}