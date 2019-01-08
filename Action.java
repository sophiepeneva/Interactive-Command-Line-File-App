# Interactive-Command-Line-File-App

import java.util.Scanner;

public class Action {
    private ActionListener actionListener;

    public Action(ActionListener actionListener){
        this.actionListener = actionListener;
    }

    public void addActionListener(ActionListener actionListener){
        this.actionListener = actionListener;
    }

    public void doWork () {
        System.out.println("Enter the filename");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        if(actionListener!=null){
            actionListener.executeAction(new ActionEvent(filename));
        }
    }
}
