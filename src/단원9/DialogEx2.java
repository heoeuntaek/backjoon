package 단원9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyModalDialog extends JDialog {
    private JTextField jTextField = new JTextField(10);
    private JButton okButton = new JButton("OK");

    public MyModalDialog(JFrame frame, String title) {
        super(frame, title, true); // 모달 다이얼로그로 설정
        setLayout(new FlowLayout());
        add(jTextField);
        add(okButton);
        setSize(200, 100);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    public String getInput() {
        if (jTextField.getText().length() == 0) return null;
        else return jTextField.getText();
    }
}

public class DialogEx2 extends JFrame {
    private MyModalDialog dialog;

    public DialogEx2() {
        super("DialogEx2 예제 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("Show Modal Dialog");
        dialog = new MyModalDialog(this, "Test Modal Dialog");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
                String text = dialog.getInput();
                if (text == null) return;
                JButton btn = (JButton) e.getSource();
                btn.setText(text);
            }
        });
        getContentPane().add(btn);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogEx2();
    }
}