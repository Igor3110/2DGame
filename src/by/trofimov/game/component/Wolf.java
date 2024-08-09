package by.trofimov.game.component;

import by.trofimov.game.util.Transparency;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static by.trofimov.game.util.Constant.*;

public class Wolf implements KeyListener {

    private final Image image;
    private int x;
    private int y;

    public Wolf() {
        image = Transparency.makeColorTransparent(new ImageIcon(IMAGE_WOLF_PATH).getImage(), Color.WHITE);
        x = SCREEN_WIDTH / 2 - image.getWidth(null) / 2;
        y = SCREEN_HEIGHT - 450;
        Window.getFrame().addKeyListener(this);
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (x >= -image.getWidth(null)) {
                x -= 15;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (x < (SCREEN_WIDTH - image.getWidth(null))) {
                x += 15;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
        Window.getPanel().repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
