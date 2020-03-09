import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panzer extends JComponent
{
     Image tanks = new ImageIcon("tank.png").getImage();
    private int x,y;


    protected void paintComponent(Graphics g) {
        g.drawImage(tanks, x - 25, y - 15, 70, 70, null);
    }
    public Panzer(int x, int y) {
        setSize(750, 500);
        this.x = x;
        this.y = y;
        setVisible(true);
        moveTank();

    }

    public void moveTank() {
        setFocusable(true);
        grabFocus();
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_RIGHT) {
                    setX(getX() + 15);
                } else if (key == KeyEvent.VK_LEFT) {
                    setX(getX() - 15);
                }
                else if (key == KeyEvent.VK_SPACE) {
                    add(new Missile(getX()));
                }
            }
        });
    }

    public int getX() {
        return x;
    }

    public void setX(int xCoo) {
        this.x = xCoo;
    }
}
