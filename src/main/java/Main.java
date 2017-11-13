import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] substrs = str.split(" ");
        for (int i = 0; i < substrs.length; i++) {
            substrs[i] = substrs[i].trim();
            System.out.print(substrs[i] + " ");
        }
    }
}
