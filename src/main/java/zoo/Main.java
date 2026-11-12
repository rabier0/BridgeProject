package zoo;

import javax.swing.SwingUtilities;
import zoo.gui.ZooController;
import zoo.gui.ZooFrame;
import zoo.service.ZooService;

/** Entry point: wires the service, controller and GUI together. */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ZooService zoo = new ZooService();
            ZooFrame frame = new ZooFrame();
            new ZooController(zoo, frame);
            frame.setVisible(true);
        });
    }
}
