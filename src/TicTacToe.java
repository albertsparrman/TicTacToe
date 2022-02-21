import javax.swing.*;

public class TicTacToe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("sverker");
        frame.setContentPane(new sverker().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
