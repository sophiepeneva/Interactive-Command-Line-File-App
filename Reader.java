# Interactive-Command-Line-File-App

import java.io.*;
import java.util.Scanner;

public class Reader {

    public static String readFile(String filename) {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file's encoding");
        String encoding = scanner.nextLine();
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             InputStreamReader in = new InputStreamReader(fileInputStream, encoding);
             BufferedReader reader = new BufferedReader(in)
        ) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                text += line;
                line = reader.readLine();
                if (line != null) {
                    text += "\n";
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
