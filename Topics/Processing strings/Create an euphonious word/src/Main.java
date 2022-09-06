import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowels="aeyuuio";
        String[] str = scanner.nextLine().split("");
        int index=0;
        for(int i = 0; i < str.length - 2; i++)
            if(vowels.contains(str[i]) && vowels.contains(str[i+1]) && vowels.contains(str[i+2]) || !vowels.contains(str[i]) && !vowels.contains(str[i+1]) && !vowels.contains(str[i+2])) {
                index += 1;
                i++;
            }
        System.out.println(index);
    }
}