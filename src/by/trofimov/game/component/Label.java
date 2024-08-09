package by.trofimov.game.component;

import java.awt.*;
import javax.swing.*;

import static by.trofimov.game.util.Constant.*;

public class Label extends JLabel {

    public Label() {
        this.setBounds(0, 0, 100, 50);
        this.setFont(new Font(LABEL_TEXT, Font.PLAIN, 24));
        this.setText(LABEL_COUNT + 0);
    }

}
