# Interactive-Command-Line-File-App

public class ActionEvent {
    String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        if (filename != null) {
            this.filename = filename;
        }
    }

    public ActionEvent(String filename){
        setFilename(filename);
    }
}
