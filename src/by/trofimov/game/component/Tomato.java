package by.trofimov.game.component;

import java.awt.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import by.trofimov.game.util.Transparency;

import static by.trofimov.game.util.Constant.*;

public class Tomato {

    private final Image image;
    private final Wolf wolf;
    private int x;
    private int y;

    public Tomato(Wolf wolf) {
        image = Transparency.makeColorTransparent(new ImageIcon(IMAGE_TOMATO_PATH).getImage(), Color.WHITE);
        x = ThreadLocalRandom.current().nextInt(SCREEN_WIDTH - image.getWidth(null));
        this.wolf = wolf;
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

    public void move() {
        Timer timer = new Timer(10, e -> {
            y += 2;
            if ((x >= wolf.getX() + (wolf.getImage().getWidth(null) - 80)) &&
                (x < wolf.getX() + (wolf.getImage().getWidth(null) - 20)) &&
                (y >= wolf.getY() + (wolf.getImage().getHeight(null) / 2) - 60) &&
                (y < wolf.getY() + (wolf.getImage().getHeight(null) / 2) - 40)
            ) {
                nextTomato(Window.getCount(), true);
            }
            if (y > (SCREEN_HEIGHT - 150)) {
                nextTomato(Window.getCount(), false);
            }
            Window.getPanel().repaint();
        });
        timer.start();
    }

    private void nextTomato(int count, boolean victory) {
        if (victory) {
            count++;
        } else {
            count--;
        }
        Window.setCount(count);
        Window.getLabel().setText(LABEL_COUNT + count);
        y = 0;
        x = ThreadLocalRandom.current().nextInt(SCREEN_WIDTH - image.getWidth(null));
    }

}
