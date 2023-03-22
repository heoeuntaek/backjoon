package 단원9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class adg extends JFrame implements MouseListener {
    private JLabel jLabel;
    public adg() {
        setTitle("마우스 업댑터테스트");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jLabel = new JLabel("Hello");
        jLabel.setSize(50,20);
        jLabel.setLocation(10, 10);
        Container contentPane = getContentPane();

        contentPane.add(jLabel);
        contentPane.addMouseListener(this);



    }


    public static void main(String[] args) {
        adg adg = new adg();

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        jLabel.setLocation(x,y);

    }


    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }


}