package by.trofimov.game.component;

import javax.swing.*;
import java.awt.*;

import static by.trofimov.game.util.Constant.IMAGE_FON_PATH;


public class Panel extends JPanel {

    private final Image imageFon;
    private final Wolf wolf;
    private final Tomato tomato;

    public Panel() {
        imageFon = new ImageIcon(IMAGE_FON_PATH).getImage();
        wolf = new Wolf();
        tomato = new Tomato(wolf);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageFon, 0, 0, null);
        g.drawImage(wolf.getImage(), wolf.getX(), wolf.getY(), null);
        g.drawImage(tomato.getImage(), tomato.getX(), tomato.getY(), null);
    }

    public Image getImageFon() {
        return imageFon;
    }

    public Wolf getWolf() {
        return wolf;
    }

    public Tomato getTomato() {
        return tomato;
    }

}
