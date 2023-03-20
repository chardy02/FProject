import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class WorkingArea extends JPanel implements Observer {
    Repository repo;
    public WorkingArea() {
        super();
        repo = Repository.getInstance();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Shape s : repo.getShapes()) {
            s.draw(g);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
