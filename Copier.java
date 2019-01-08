# Interactive-Command-Line-File-App

import java.io.*;
import java.util.Scanner;

public class Copier implements ActionListener {

    private static void writeToFile(String destination, String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
            String[] splitText = text.split("\n");
            for (int i = 0; i < splitText.length; i++) {
                writer.write(splitText[i]);
                if (i < splitText.length - 1){
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void executeAction(ActionEvent actionEvent) {
        System.out.println("Enter the destination file : ");
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        writeToFile(destination, Reader.readFile(actionEvent.getFilename()));
    }
}
