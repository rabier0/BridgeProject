package zoo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/** Main window that holds the panels */
public class ZooFrame extends JFrame {
    private final AnimalFormPanel formPanel = new AnimalFormPanel();
    private final HabitatPanel habitatPanel = new HabitatPanel();

      public ZooFrame() {
        super("Zoo Manager");
        Color green = new Color(78, 135, 74);
        Color background = new Color(120, 179, 116);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(20, 20)); // 0, 0
        getContentPane().setBackground(background);
        
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(green);
        header.setBorder(new EmptyBorder(20,22,20,22));
        

        JLabel title = new JLabel("Zoo Manager");
        title.setFont(new Font("Serif", Font.BOLD, 32));
        //title.setForeground(new Color(100, 71, 17));
        title.setForeground(new Color(224, 206, 175));
        JLabel subtitle = new JLabel("Habitat Management");
        subtitle.setFont(new Font("SansSerif", Font.ITALIC, 16));
        subtitle.setForeground(new Color(220, 225, 220));

        JPanel titlePanel = new JPanel(new BorderLayout(0, 5));
        titlePanel.setOpaque(false);
        titlePanel.add(title, BorderLayout.NORTH);
        titlePanel.add(subtitle, BorderLayout.SOUTH);

        header.add(titlePanel, BorderLayout.WEST);

        JPanel content = new JPanel(new BorderLayout(15, 0));
        content.setBackground(background);
        content.setBorder(new EmptyBorder(10,20,20,20));
        formPanel.setPreferredSize(new java.awt.Dimension(260,400));
        content.add(formPanel, BorderLayout.WEST);
        content.add(habitatPanel, BorderLayout.CENTER);
        add(header, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        //content.setBackground(green);
        setSize(1000, 650);
        setLocationRelativeTo(null);
    }

    public AnimalFormPanel getFormPanel() { return formPanel; }
    public HabitatPanel getHabitatPanel() { return habitatPanel; }
}


