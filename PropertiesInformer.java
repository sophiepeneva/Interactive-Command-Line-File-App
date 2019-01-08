# Interactive-Command-Line-File-App

import java.io.File;

public class PropertiesInformer implements ActionListener {

    @Override
    public void executeAction(ActionEvent actionEvent) {
        String filename = actionEvent.getFilename();
        File file = new File(filename);
        System.out.println("File type : " + filename.substring(filename.lastIndexOf('.')));
        double bytes = file.length();
        System.out.println("File size : " + bytes/1024 + "kB");
        System.out.println("File location : " + file.getAbsolutePath());
    }
}
