import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        this.add(new Panels());
        this.setTitle("Java Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
