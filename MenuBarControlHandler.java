import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ashton Alonge
 * @author Alex Banham
 * Controller for the menu bar
 */
public class MenuBarControlHandler implements ActionListener {

    /**
     * Constructor
     */
    public MenuBarControlHandler(){
    }

    /**
     * Method to control action when any menu item is selected
     * @param e action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "New":
                Repository.getInstance().clear();
                Repository.getInstance().selectMenuItem("New File Created.");
                System.out.println("New");
                break;
            case "Save":
                Repository.getInstance().selectMenuItem("File Saved.");

                String saveFile = (String) JOptionPane.showInputDialog(
                        null,
                        "Select a file name to save your diagram",
                        "Save file",
                        1, null, null, "myDiagram" );
                if(saveFile != null && saveFile.length() > 0) {
                    FileManager.writeFile(saveFile);
                }
                else {
                    System.out.println("Please select a valid file name");
                }
                break;
            case "Load":
                Repository.getInstance().selectMenuItem("File Loaded.");
                String loadFile = (String) JOptionPane.showInputDialog(
                        null,
                        "Select a save file to load a diagram",
                        "Load file",
                        1);
                if(loadFile != null && loadFile.length() > 0) {
                    FileManager.readFile(loadFile);
                    Repository.getInstance().repaintWorkingArea();
                }
                else {
                    System.out.println("Please select a valid save file");
                }
                break;
            case "About":
                Repository.getInstance().selectMenuItem("About");
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                        "Welcome to version 1.0 of the Diagram App.\nThis is an overview of the features and how to use them.\nBy clicking on \"File\", you have the options to make a new diagram,\nsave your diagram, or load an existing diagram.\nBy clicking on help, you managed to open this dialog.\nClicking on Actions gives the options to clear the diagram or undo the last action.\nIf you click on Start, you can select which component you would like to draw.\nClicking anywhere in the area will draw the selected shape at that location.\nIf you scroll down in the shapes menu and select connections, you can draw lines\nbetween shapes by clicking them consecutively.\nAuthors:\nAshton Alonge\nAaron Bettencourt\nAlex Banham\nConnor Hickey" +
                                "\nPatrick Whitlock\nCameron Hardy");
                break;
            case "Undo":
                Repository.getInstance().undo();
                break;
            case "Clear":
                Repository.getInstance().clear();

        }

        if(e.getActionCommand().equals("comboBoxChanged")){
            JComboBox tmp = (JComboBox) e.getSource();
            switch ((String)tmp.getSelectedItem()){
                case "Start":
                    //System.out.println("Start");
                    Repository.getInstance().setSelectedCodeBlock("Start");
                    break;
                case "End":
                    //System.out.println("End");
                    Repository.getInstance().setSelectedCodeBlock("End");
                    break;
                case "Print":
                    //System.out.println("Print");
                    Repository.getInstance().setSelectedCodeBlock("Print");
                    break;
                case "Loop":
                    //System.out.println("Loop");
                    Repository.getInstance().setSelectedCodeBlock("Loop");
                    break;
                case "If":
                    //System.out.println("If");
                    Repository.getInstance().setSelectedCodeBlock("If");
                    break;
                case "Instruction":
                    //System.out.println("Instruction");
                    Repository.getInstance().setSelectedCodeBlock("Instruction");
                    break;
                case "Function":
                    //System.out.println("Function");
                    Repository.getInstance().setSelectedCodeBlock("Function");
                    break;
                case "Variable":
                    //System.out.println("Variable");
                    Repository.getInstance().setSelectedCodeBlock("Variable");
                    break;
                case "Connection":
                    //System.out.println("Connection");
                    Repository.getInstance().setSelectedCodeBlock("Connection");
                    break;

            }
        }
    }
}
