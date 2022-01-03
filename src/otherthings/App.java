package otherthings;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello My Name Fynn, whats yours?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("21 mod 1 = " + (21 % 1));

        scanner.close();
    }
}
