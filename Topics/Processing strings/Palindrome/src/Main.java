import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String revstr = "";
        for (int i = str.length()-1; i >= 0; i--)
            revstr += str.charAt(i);

        if(str.equals(revstr))
            System.out.println("yes");
        else System.out.println("no");
    }
}