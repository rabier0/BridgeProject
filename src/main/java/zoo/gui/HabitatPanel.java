package zoo.gui;

import java.util.List;
import javax.swing.*;
import zoo.model.animal.Animal;
import zoo.model.habitat.Habitat;

/** Displays each habitat and who lives there. */
public class HabitatPanel extends JPanel {
    private final JTextArea display = new JTextArea(25, 20);

    public HabitatPanel() {
        setBorder(BorderFactory.createTitledBorder("Habitats"));
        display.setEditable(false);
        add(new JScrollPane(display));
    }

    public void refresh(List<Habitat> habitats) {
        // TODO: replace with JTree / JList / cards for a nicer look
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
