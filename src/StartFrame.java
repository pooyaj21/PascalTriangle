import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame {
    private static JTextField userText;
    private final JFrame frame = this;

    public StartFrame() {
        this.setSize(400, 400);
        this.setTitle("Pascal Triangle Maker");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        JPanel panel = new JPanel();
        this.add(panel);
        panel.setBackground(new Color(123, 50, 250));
        panel.setLayout(null);
        JLabel label = new JLabel("How many row?");
        label.setBounds(10, this.getHeight() / 2 - 25, 100, 25);
        panel.add(label);


        userText = new JTextField();
        userText.setBounds(120, this.getHeight() / 2 - 25, 165, 25);
        panel.add(userText);

        JLabel error = new JLabel("");
        error.setBounds(10, this.getHeight() / 2 + 25, 400, 25);
        panel.add(error);

        JButton button = new JButton("Draw");
        button.setBounds(300, this.getHeight() / 2 - 25, 80, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userText.getText().matches("[3-9]")) {
                    error.setText("");
                    new PascalTriangleFrame(Integer.parseInt(userText.getText()));
                } else {
                    error.setText("Enter Number between 2-10");
                }
            }
        });
        panel.add(button);


        this.setVisible(true);
    }

}
