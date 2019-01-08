# Interactive-Command-Line-File-App

import java.io.File;

public class FileLister implements ActionListener{

    @Override
    public void executeAction(ActionEvent actionEvent) {
        String dir = actionEvent.getFilename();
        File root = new File("");
        File[] list = root.listFiles();
        if(list==null){
            return;
        }
        for(File f : list){
            System.out.println(f.getAbsolutePath());
        }
    }
}
