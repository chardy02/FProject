import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class DiagramApp extends JFrame {

    public DiagramApp(){

        super("Diagram App");

        JMenuBar menuBar = new JMenuBar();
        WorkingArea drawPanel = new WorkingArea();
        StatusBar statusBar = new StatusBar("Status");
        Repository.getInstance().addObserver(drawPanel);
        Repository.getInstance().addObserver(statusBar);

        statusBar.setEnabled(false);
        statusBar.setFont(new Font(Font.DIALOG,Font.PLAIN,17));
        statusBar.setDisabledTextColor(Color.BLACK);

        statusBar.setPreferredSize(new Dimension(700,30));
        WorkingAreaControlHandler drawAreaController = new WorkingAreaControlHandler();

        drawPanel.setBackground(Color.GRAY);
        drawPanel.addMouseListener(drawAreaController);
        drawPanel.addMouseMotionListener(drawAreaController);

        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);

        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenu actions = new JMenu("Actions");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem load = new JMenuItem("Load");
        JMenuItem about = new JMenuItem("About");
        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem clear = new JMenuItem("Clear");


        String [] shapes = {"Start","End","Print","Loop","If","Instruction", "Function", "Variable","Connection"};

        JComboBox shape = new JComboBox(shapes);

        file.add(newFile);
        file.add(save);
        file.add(load);
        help.add(about);
        actions.add(undo);
        actions.add(clear);

        MenuBarControlHandler menuController = new MenuBarControlHandler(menuBar);

        newFile.addActionListener(menuController);
        save.addActionListener(menuController);
        load.addActionListener(menuController);
        about.addActionListener(menuController);
        shape.addActionListener(menuController);
        undo.addActionListener(menuController);
        clear.addActionListener(menuController);

        menuBar.add(file);
        menuBar.add(help);
        menuBar.add(actions);
        menuBar.add(shape);

        add(menuBar,BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);

    }

    public static void main(String [] args){
        DiagramApp app = new DiagramApp();
        app.setSize(700,700);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
