package 단원9;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class prac extends JFrame {
    private JLabel jLabel = new JLabel("ds");



    public static void main(String[] args) {
        new prac();
    }

    private class MymounsListener implements MouseListener {


        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            jLabel.setLocation(x, y);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}