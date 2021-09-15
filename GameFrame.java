import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){

        // Another shortcut to instantiate GamePanel
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Adding components to a JFrame, fitting it within the JFrame
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
