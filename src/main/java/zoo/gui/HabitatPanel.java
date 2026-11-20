package zoo.gui;

import java.awt.Color;
import java.util.List;
import javax.swing.*;
import zoo.model.animal.Animal;
import zoo.model.habitat.Habitat;
/** Displays each habitat and who lives there. */
public class HabitatPanel extends JPanel {
    private final JTextArea display = new JTextArea(26, 40);

    public HabitatPanel() {
        setBorder(BorderFactory.createTitledBorder("Habitats"));
        // setBackground(new Color(118, 91, 46));
        // setBackground(new Color(151, 117, 59));
        setBackground(new Color(196, 163, 104));

        display.setEditable(false);
        add(new JScrollPane(display));
        //Color color = new Color(207, 224, 175);
        Color color = new Color(224, 206, 175);
        display.setBackground(color);
    }   

    public void refresh(List<Habitat> habitats) {

        StringBuilder sb = new StringBuilder();
        for (Habitat h : habitats) {
            sb.append(h.getName()).append(":\n");
            for (Animal a : h.getResidents()) {
                sb.append("  - ").append(a.describe()).append('\n');
            }
        }
        display.setText(sb.toString());

        
    }
}
