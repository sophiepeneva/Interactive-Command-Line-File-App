# Interactive-Command-Line-File-App

public class Command {
    public static void getAction(String action) {
        switch (action.toUpperCase()) {
            case "COPY":
                new Action(new Copier()).doWork();
                break;
            case "MOVE":
                new Action(new Mover()).doWork();
                break;
            case "LIST FILES":
                new Action(new FileLister()).doWork();
                break;
            case "VIEW PROPERTIES":
                new Action(new PropertiesInformer()).doWork();
                break;
            case "OPEN AND READ":
                new Action(new FileOpener()).doWork();
                break;
            case "EXIT":
                System.exit(1);
            default:
                System.out.println("Illegal action");
                break;
        }
    }
}
