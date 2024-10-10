
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class BackColorChanger extends JFrame implements ActionListener {

    private JButton redBtn, blueBtn, orangeBtn, grayBtn;

    public BackColorChanger() {
        setTitle("Color Changer");
        setLayout(new FlowLayout());
        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");

        orangeBtn = new JButton("Orange");
        grayBtn = new JButton("Gray");
        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        orangeBtn.addActionListener(this);
        grayBtn.addActionListener(this);
        add(redBtn);
        add(blueBtn);
        add(orangeBtn);
        add(grayBtn);

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

        } else if (e.getSource() == orangeBtn) {
            getContentPane().setBackground(Color.ORANGE);
        } else if (e.getSource() == grayBtn) {
            getContentPane().setBackground(Color.GRAY);

        }
    }
    public static void main(String[] args) {
        new BackColorChanger();
    }
}
