# Interactive-Command-Line-File-App

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Mover implements ActionListener {

    @Override
    public void executeAction(ActionEvent actionEvent) {
        System.out.println("Enter the destination file : ");
        Scanner scanner = new Scanner(System.in);
        String from = actionEvent.getFilename();
        String to = scanner.nextLine();
        File fromFile = new File(from);
        Path fromPath = Paths.get(fromFile.getAbsolutePath());
        Path toPath = Paths.get(to);
        try {
            Files.move(fromPath, toPath,REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
