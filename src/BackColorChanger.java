
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class BackColorChanger extends JFrame implements ActionListener {
    private JButton redBtn, blueBtn, greenBtn, yellowBtn;
    public BackColorChanger() {
        setTitle("Color Changer");
        setLayout(new FlowLayout());
        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");
        greenBtn = new JButton("Green");
        yellowBtn = new JButton("Yellow");
        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        yellowBtn.addActionListener(this);
        add(redBtn);
        add(blueBtn);
        add(greenBtn);
        add(yellowBtn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 300);
        setLocation(0, 0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redBtn) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == blueBtn) {
            getContentPane().setBackground(Color.BLUE);
        } else if (e.getSource() == greenBtn) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == yellowBtn) {
            getContentPane().setBackground(Color.YELLOW);
        }
    }
    public static void main(String[] args) {
        new BackColorChanger();
    }
}
