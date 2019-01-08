# Interactive-Command-Line-File-App

public class FileOpener implements ActionListener {
    @Override
    public void executeAction(ActionEvent actionEvent) {
        System.out.println(Reader.readFile(actionEvent.getFilename()));
    }
}
