import javax.swing.*;

public class Frame extends JFrame
{
    static JPanel gamePanel = new JPanel();

    public Frame()
    {
        setContentPane(gamePanel);
        setSize(500,500);
        setContentPane(gamePanel);
        setLayout(null);
        setSize(500, 500);
        gamePanel.setLayout(null);
        gamePanel.setSize(500,500);
        gamePanel.add(new Ball(10,20,10));
        gamePanel.add(new Ball(5,25,10));



        gamePanel.add(new Panzer(getWidth()/2,getHeight()-100));


        gamePanel.setVisible(true);
        setVisible(true);

    }
}
