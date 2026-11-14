package zoo.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/** Main window that holds the panels */
public class ZooFrame extends JFrame {
    private final AnimalFormPanel formPanel = new AnimalFormPanel();
    private final HabitatPanel habitatPanel = new HabitatPanel();

    public ZooFrame() {
        super("Zoo Manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.WEST);
        add(habitatPanel, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(null);
    }

    public AnimalFormPanel getFormPanel() { return formPanel; }
    public HabitatPanel getHabitatPanel() { return habitatPanel; }
}
