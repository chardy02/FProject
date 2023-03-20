import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class StatusBar extends JTextArea implements Observer {

    public StatusBar(String text){
        setText(text);
    }

    @Override
    public void update(Observable o, Object arg) {
        String status = (String)arg;
        if(status != null)
            setText("Status: " + status);
    }
}
