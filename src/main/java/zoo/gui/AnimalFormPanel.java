package zoo.gui;

import java.awt.GridLayout;
import javax.swing.*;
import zoo.model.environment.EnvironmentType;

/** Inputs for creating a new animal: name, species, environment. */
public class AnimalFormPanel extends JPanel {
    private final JTextField nameField = new JTextField(12);
    private final JComboBox<String> speciesBox = new JComboBox<>(
            new String[]{"Lion", "Eagle", "Shark", "Butterfly", "Octopus", "Spider"});
    private final JComboBox<EnvironmentType> envBox = new JComboBox<>(EnvironmentType.values());
    private final JButton admitButton = new JButton("Admit Animal");

    public AnimalFormPanel() {
        setLayout(new GridLayout(0, 1, 4, 4));
        setBorder(BorderFactory.createTitledBorder("New Animal"));
        add(new JLabel("Name")); add(nameField);
        add(new JLabel("Species")); add(speciesBox);
        add(new JLabel("Environment")); add(envBox);
        add(admitButton);
        // TODO: auto-select a sensible environment when species changes
    }

    public String getAnimalName() { return nameField.getText().trim(); }
    public String getSpecies() { return (String) speciesBox.getSelectedItem(); }
    public EnvironmentType getEnvironmentType() { return (EnvironmentType) envBox.getSelectedItem(); }
    public JButton getAdmitButton() { return admitButton; }
    public void clear() { nameField.setText(""); }
}
