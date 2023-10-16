package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable {

    JLabel[] labels;
    String[] imagePaths;
    JLabel caption;
    Thread th;

    public void run() {
        try {
            for (int i = 0; i < labels.length; i++) {
                labels[i].setVisible(true);
                caption.setText(labels[i].getName());
                Thread.sleep(2800);
                labels[i].setVisible(false);
            }
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public CheckHotels() {
        setBounds(0, 0, getScreenWidth(), getScreenHeight());
        getContentPane().setBackground(new Color(220, 250, 250));
        setLayout(null);

        th = new Thread(this);
        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.white);
        caption.setFont(new Font("Tahoma", Font.ITALIC, 30));
        add(caption);

        imagePaths = new String[] {
            "travel/management/system/icons/Renesa.jpg",
            "travel/management/system/icons/renesa2.jpg",
            "travel/management/system/icons/renesa3.jpg",
            "travel/management/system/icons/pan.front1.jpg",
            "travel/management/system/icons/pan.swimming2.jpg",
            "travel/management/system/icons/pan.png",
            "travel/management/system/icons/pan.dining.jpg",
            "travel/management/system/icons/Inter1.jpg",
            "travel/management/system/icons/inter.2.jpg",
            "travel/management/system/icons/inter3.jpg"
        };

        labels = new JLabel[imagePaths.length];

        for (int i = 0; i < imagePaths.length; i++) {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(imagePaths[i]));
            Image image = icon.getImage().getScaledInstance(getScreenWidth(), getScreenHeight(), Image.SCALE_DEFAULT);
            ImageIcon scaledIcon = new ImageIcon(image);
            labels[i] = new JLabel(scaledIcon);
            labels[i].setBounds(0, 0, getScreenWidth(), getScreenHeight());
            labels[i].setVisible(false);
            labels[i].setName(getHotelName(i));
            add(labels[i]);
        }

        th.start();
    }

    private String getHotelName(int index) {
        switch (index) {
            case 0:
                return "<html><b>Renaissance Dhaka Gulshan Hotel</b><br>78 Gulshan Avenue Gulshan 1, Dhaka City 1212 Bangladesh</html>";
            case 1:
                return "<html><b>Renaissance Dhaka Gulshan Hotel swimming pool</b>";
            case 2:
                return "<html><b>Renaissance Dhaka Gulshan Hotel room view</b>";
            case 3:
                return "<html><b>Pan Pacific Sonargaon Dhaka</b><br>107 Kazi Nazrul Islam Avenue GPO Box 3595</html>";
            case 4:
                return "<html><b>Pan Pacific Sonargaon Dhaka swimming pool</b><html>";
            case 5:
                return "<html><b>Pan Pacific Sonargaon Dhaka room view</b><html>";
            case 6:
                return "<html><b>Pan Pacific Sonargaon Dhaka dining</b><html>";
            case 7:
                return "<html><b>InterContinental Dhaka</b><br>1 Minto Road G, Dhaka City 1000 Bangladesh</html>>";
            case 8:
                return "<html><b>InterContinental Dhaka room view</b>";
            case 9:
                return "<html><b>InterContinental Dhaka dining";
            default:
                return "";
        }
    }

    private int getScreenWidth() {
        return Toolkit.getDefaultToolkit().getScreenSize().width;
    }

    private int getScreenHeight() {
        return Toolkit.getDefaultToolkit().getScreenSize().height;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CheckHotels().setVisible(true);
        });
    }
}
