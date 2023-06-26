import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;

public class PascalTriangleFrame extends JFrame {
    public PascalTriangleFrame(int row) {
        this.setSize(row * 100, row * 100);
        this.setTitle("Pascal Triangle");
        this.setResizable(true);
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea(PascalTriangle.make(row));

        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        Font font = textArea.getFont();
        textArea.setFont(font.deriveFont(55.0f));
        


        panel.add(textArea, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
