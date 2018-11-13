import java.awt.*;
import javax.swing.*;

public class BowlingGame extends JFrame{
    private JButton button;
    private JButton custom;

    public BowlingGame(){
        super("Bowling");
        setLayout(new FlowLayout());

        button = new JButton("NEW GAME");
        add(button);

        HandlerClass handler = new HandlerClass();
        button.addActionListener(handler);
    }
}
