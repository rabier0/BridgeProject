package zoo.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import zoo.model.animal.Animal;
import zoo.model.habitat.Habitat;
import zoo.service.AnimalFactory;
import zoo.service.ZooService;
/** Connects GUI events to the ZooService */
public class ZooController {
    private final ZooService zoo;
    private final ZooFrame frame;

    public ZooController(ZooService zoo, ZooFrame frame) {
        this.zoo = zoo;
        this.frame = frame;
        frame.getFormPanel().getAdmitButton().addActionListener(e -> onAdmit());
        frame.getHabitatPanel().refresh(zoo.getHabitats());
        //Color back = new Color(224, 206, 175);
        Color back = new Color(196, 163, 104);

        frame.setBackground(back);
    }

    private void onAdmit() {
        AnimalFormPanel form = frame.getFormPanel();
        if (form.getAnimalName().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter a name.");
            return;
        }
        Animal animal = AnimalFactory.create(form.getSpecies(), form.getAnimalName(), form.getEnvironmentType());
        Habitat placed = zoo.admit(animal);
        // TODO: nicer feedback / status bar
        JOptionPane.showMessageDialog(frame, animal.getName() + " placed in " + placed.getName());
        form.clear();
        Color back = new Color(224, 206, 175);
        frame.getHabitatPanel().refresh(zoo.getHabitats());
        form.setBackground(back);
        //Color back = new Color(224, 206, 175);
        //zoo.setBackground(back);
        frame.setBackground(back);
    }
}
