import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TBFX tbfx = new TBFX();

        JFrame jFrame = new JFrame("台灣銀行美金匯率");
        final JTextField textField = new JTextField();
        textField.setBounds(120,100,250,30);
        JButton jButton = new JButton("查詢當天美金");
        jButton.setBounds(180, 200, 120,30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField.setText(tbfx.getForex());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });



        jFrame.add(textField);
        jFrame.add(jButton);
        jFrame.setSize(500, 500);
        jFrame.getContentPane().setBackground(new Color(0x123445));
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);


    }
}
