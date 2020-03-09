import javax.swing.*;
import java.awt.*;

public class Missile extends JComponent
{
    Image bullet = new ImageIcon("bullet.jpg").getImage();
    private int x,y,speed;


    public Missile(int X) {
        setSize(500, 500);
        y = getHeight();
        x = X;
        speed = 5;
        setVisible(true);

    }
    protected void paintComponent(Graphics g) {
        g.drawImage(bullet, x - 4, y - 160, 30, 60, null);
        launch();
        collide();

    }

    public void launch() {
        y -= speed;
        repaint();
    }
    public void collide() {
        int mid = x+15;
        for (Ball ballss : Ball.ballList) {
            if (mid > ballss.getX() && mid < ballss.getX()+35 && y > ballss.getY()
                    && y < ballss.getY() + 35) {
                System.out.println("PEW PEW");
                Frame.gamePanel.remove(ballss);
            }
        }

    }



}
