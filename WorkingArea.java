import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class WorkingArea extends JPanel implements Observer {

    public WorkingArea() {

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(CodeBlock codeBlock: Repository.getInstance().getCodeBlocks()) {
            codeBlock.draw(g);
        }
        for(Line l : Repository.getInstance().getLines()) {
            l.draw(g);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Updated");
        repaint();
    }
}
