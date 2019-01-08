# Interactive-Command-Line-File-App

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the action you'd like to perform");
            String action = scanner.nextLine();
            Command.getAction(action);
        }
    }
}
