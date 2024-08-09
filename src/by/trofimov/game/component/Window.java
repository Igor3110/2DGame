package by.trofimov.game.component;

import javax.swing.*;

import static by.trofimov.game.util.Constant.*;

public class Window {

    private static Panel panel;
    private static JFrame frame;
    private static Label label;
    private static int count;

    public Window(String title) {
        count = 0;

        frame = new JFrame(title);
        frame.setBounds(SCREEN_SIZE.width / 2 - SCREEN_WIDTH / 2, SCREEN_SIZE.height / 2 - SCREEN_HEIGHT / 2, SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setResizable(false);

        panel = new Panel();
        frame.add(panel);
        panel.getTomato().move();

        label = new Label();
        panel.add(label);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static Panel getPanel() {
        return panel;
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static Label getLabel() {
        return label;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Window.count = count;
    }

}
