import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Ball extends JComponent implements Runnable
{
    private int x,y,speed;
    static List<Ball> ballList = new ArrayList<>();

    public Ball(int x, int y, int speed)
    {
        setSize(500,500);
        this.x = x;
        this.y = y;
        this.speed = speed;
        setVisible(true);
        ballList.add(this);
        new Thread(this).start();
    }


    protected void paintComponent(Graphics g)
    {
        g.setColor(Color.green);
        g.fillOval(x, y, 25, 25);
    }


    public void move() {

        if (x < 0 || x + 35 > 500) {
            speed *= -1;
        }

        x += speed;
        repaint();

    }


    @Override
    public void run()
    {
        while(isVisible()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {

                e.printStackTrace();
            }
            move();
        }
    }
}
