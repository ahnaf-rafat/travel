package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame {

    public Payment() {

        setLayout(null);
        setBounds(600, 220, 800, 600);

        JLabel label = new JLabel("Pay using.. ");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/pay8.png"));
        Image i8 = i7.getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 150, 800, 600);
        add(l4);

        JButton pay = new JButton("Pay");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the payment window
                JFrame paymentWindow = new JFrame();
                paymentWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
                paymentWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                // Create a label to display the image
                JLabel imageLabel = new JLabel(i9);
                imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                paymentWindow.getContentPane().add(imageLabel);
                
                paymentWindow.setVisible(true);
            }
        });
        pay.setBounds(420, 20, 80, 40);
        add(pay);

        

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Payment().setVisible(true);
    }
}
