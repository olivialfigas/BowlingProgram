import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game{
    public static void main(String args[]){
        BowlingGame game = new BowlingGame();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(500,500);
        game.setVisible(true);
        game.setBackground(Color.red);
    }
}