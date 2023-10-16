package travel.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckPackage extends JFrame {
    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }

    CheckPackage() {
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        setBounds(screenWidth / 2 - 595, screenHeight / 2 - 300, 1190, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] package1 = new String[]{"tiger.jpg", "Sundarbans PACKAGE", "Dhaka-Khulna-Dhaka AC bus ticket ", "Airport Assistance at Airport", "3 Days 3 Night on Cruise", "B-B-Q dinner on the second night", "Buffet on the third night", "Boat trips on wooden boat", "Snacks, Tea and Coffee",  "BDT 12000 only", "Don't be late..", "Grab the offer!"};
        String[] package2 = new String[]{"sajekboy.jpg", "Sajek Valley Package", "Dhaka-Khagrachari-Dhaka Bus Tickets", "Sightseeing as per itinerary", "Jeep Services fpr 2 Days.", "Bar-B-Q Chicken,Parata,Mineral Water", "Special tribal menu with mashroom and duck meet", "Breakfast", "Coottage accommodation", "BDT 6,599 only", "Don't be late.."};
        String[] package3 = new String[]{"coxs.jpg", "Cox's Bazar Package", "3 days and 2 Nights", "Dhaka-Cox’s Bazar-Dhaka air ticket", "Hotel accommodation","Discount on Radiant Fish World", "20% Discount on Parasailing", "Daily Buffet", "BBQ at the hotel roof", "BDT 10,999 only ", "Don't be late..", "Don't be late..", "BDT 10,999 only"};

        JTabbedPane tabbedPane = new JTabbedPane();

// Create the panel for Package 1
      JPanel p1 = createPackage(package1, "<html><p style=\"font-size: 18px;\"><b>Sundarbans</b></p><p style=\"text-align: justify;\"><i>The Sundarbans is a vast mangrove forest located in the coastal region of the Bay of Bengal, spanning across Bangladesh and the Indian state of West Bengal. It is recognized as a UNESCO World Heritage Site and is one of the largest tidal halophytic mangrove forests in the world.he Sundarbans is renowned for its rich biodiversity and is often referred to as a \"museum of animals and plants.\" It is home to various species of flora and fauna, including the iconic Royal Bengal Tiger, estuarine crocodiles, spotted deer, snakes, and a diverse array of bird species.he Sundarbans is characterized by its unique mangrove ecosystem, where trees and other vegetation have adapted to thrive in saline and waterlogged conditions. The interplay of land and water creates a complex network of rivers, creeks, and channels that support diverse habitats.The Sundarbans plays a vital role in maintaining the ecological balance of the region. It acts as a natural barrier against cyclones, storm surges, and coastal erosion, protecting the inland areas. The mangroves also help in carbon sequestration and contribute to mitigating climate change impacts.the Sundarbans is a unique and extraordinary destination, offering a glimpse into a pristine natural environment.<br><u>Spot will Visit:</u><br>\n" +
"(1) KAROMJAL<br> (2) DEEP FOREST HARBARIA<br> (3) KATKA<br> (4) JAMTOLA SEA BEACH<br> (5) TIGER POINT<br> (6) DUBLERCHAR</i></p><br><b>So,why are you still thinking?<b></body></html>");
      tabbedPane.addTab("Package 1", null, p1);


        JPanel p2 = createPackage(package2, "<html><p style=\"font-size: 18px;\"><b>Sajek Valley</b></p>\n" +
"<p style=\"text-align: justify;\"><i>Sajek Valley is a popular tourist destination located in the Rangamati Hill District of Bangladesh. It is situated in the northeastern part of the country and is known for its scenic beauty and breathtaking landscapes.Sajek Valley is inhabited mainly by indigenous people. Tourists can experience the local lifestyle and interact with the friendly locals. \n" +
"It is one of the most beautiful places in the country, whether it is the queen of the mountains or the paradise of clouds. Yes, imagine you are standing on a hill 1800 feet high.\n" +
"Clouds are moving around. You can’t even see objects in the distance behind the clouds. Sometimes coming very close and touching the clouds is an increasing feeling. Dhaka to Sajek Distance: 335 KM. Rangamati to Sajek Distance: 135 KM. Chittagong to Sajek Distance: 176 KM.\n" +
"To reach Sajek Valley, one needs to travel to Baghaichhari Upazila in Rangamati District and then continue the journey by road to Sajek. The road trip to Sajek Valley is an adventure in itself, as it involves navigating through winding mountain roads offering breathtaking views.<br>\n" +
"<u>Place to visit:</u><br>\n" +
"1.Sajek Valley <br> 2.Konglak Para <br> 3.Ruilui Para <br> 4.Richang Waterfall <br> 5.Tareng<br> 6.Stone Garden <br> 7.Helipad <br> 8.Alutuila Cave <br> 9.Hanging Bridge\n<br><br> <b>So,why are you still thinking?</b>" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"");
        tabbedPane.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3, "<html><p style=\"font-size: 18px;\"><b>Cox’s Bazar  </b></p><p style=\"text-align: justify;\"><i> Cox's Bazar is a popular tourist destination located in the southeastern part of Bangladesh. It is known for its stunning natural beauty and boasts the title of having the longest natural sea beach in the world. The beach stretches over 120 kilometers along the Bay of Bengal, offering breathtaking views of the ocean and golden sandy shores.\n" +
"The beach at Cox's Bazar is a major attraction for both domestic and international tourists. Its pristine shoreline, gentle waves, and picturesque landscape make it an ideal spot for relaxation, sunbathing, and swimming. The beach is relatively less crowded compared to many other tourist destinations, allowing visitors to enjoy a peaceful and serene environment.\n" +
"Apart from its natural beauty, Cox's Bazar offers a range of activities and attractions for visitors. The nearby Himchari National Park is a popular spot for nature lovers, with lush green hills, waterfalls, and diverse wildlife. In addition, the nearby Maheshkhali Island is known for its ancient Hindu temples and Buddhist monasteries, providing cultural and historical experiences.\n" +
"For adventure enthusiasts, there are opportunities for water sports such as surfing, jet skiing, and speed boating. The beach also offers stunning views of sunrise and sunset, creating magical moments for photography enthusiasts.Cox's Bazar town itself has a vibrant atmosphere with bustling markets, local eateries, and a variety of accommodations ranging from luxury resorts to budget-friendly guesthouses. Visitors can savor delicious seafood, explore local handicrafts and souvenirs, and immerse themselves in the local culture and traditions.The best time to visit is typically during the winter months from October to March when the weather is pleasant and the sea is calm.<br><b>So,why are you still thinking?</b></i></html>\n" +
" \n" +
"\n" +
"\n" +
"\n" +
"\n" +
"");
        tabbedPane.addTab("Package 3", null, p3);

        add(tabbedPane, BorderLayout.CENTER);
    }

    public JPanel createPackage(String[] pack, String description) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/" + pack[0]));
        Image i3 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(400, 0, 650, 620);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblName.setBounds(35, 5, 350, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.BLACK);
        l3.setBounds(35, 70, 200, 14);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.BLACK);
        lblId.setBounds(35, 110, 200, 14);
        p1.add(lblId);

        JLabel lblAvailable = new JLabel(pack[4]);
        lblAvailable.setForeground(Color.BLACK);
        lblAvailable.setBounds(35, 150, 200, 14);
        p1.add(lblAvailable);

        JLabel lblNewLabel = new JLabel(pack[5]);
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setBounds(35, 190, 200, 14);
        p1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel(pack[6]);
        lblNewLabel_1.setForeground(Color.BLACK);
        lblNewLabel_1.setBounds(35, 230, 200, 14);
        p1.add(lblNewLabel_1);

        JLabel lblJourneyDate = new JLabel(pack[7]);
        lblJourneyDate.setForeground(Color.BLACK);
        lblJourneyDate.setBounds(35, 270, 200, 14);
        p1.add(lblJourneyDate);

        JLabel lblReturnDate = new JLabel(pack[8]);
        lblReturnDate.setForeground(Color.BLACK);
        lblReturnDate.setBounds(35, 310, 200, 14);
        p1.add(lblReturnDate);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.RED);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 16));
        lblCheckInStatus.setBounds(35, 370, 200, 18);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setForeground(Color.BLACK);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 425, 200, 34);
        p1.add(lblDeposite);
        
        //back
        
        

       
        JButton btnBook = new JButton("Back");
        btnBook.setBounds(120, 500, 100, 30);
        btnBook.setBackground(Color.BLACK);
        btnBook.setForeground(Color.WHITE);
        p1.add(btnBook);
        btnBook.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       Home home = new Home(); // Create a new instance of the Home class
        home.setVisible(true);
        dispose();
        
        
     // Close the current CheckPackage frame
       
    }
});
        // Assuming you have a JButton named btnBook
        


        
        

        // Create the description panel
         JPanel descriptionPanel = new JPanel();
        descriptionPanel.setBounds(1090, 50, 430, 520);
        descriptionPanel.setLayout(new BorderLayout());
        descriptionPanel.setBackground(Color.WHITE);

        JLabel descriptionLabel = new JLabel(description);
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        descriptionLabel.setForeground(Color.BLACK);
        descriptionPanel.add(descriptionLabel, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(descriptionPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        p1.add(scrollPane);
        
        

        p1.add(descriptionPanel);
        

        return p1;
    }
}
