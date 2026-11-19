package zoo.gui;

import java.awt.Color;
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
        setBackground(new Color(224, 206, 175));
        add(new JLabel("Name:")); add(nameField);
        add(new JLabel("Species:")); add(speciesBox);
        add(new JLabel("Environment:")); add(envBox);
        add(admitButton);
    
        
        //admitButton.setForeground(button);
        // Auto-select appropriate environment when species changes
        speciesBox.addActionListener(e -> {
            String species = (String) speciesBox.getSelectedItem();
            if ("Lion".equals(species) || "Eagle".equals(species)) {
                envBox.setSelectedItem(EnvironmentType.LAND);
            } else if ("Shark".equals(species)) {
                envBox.setSelectedItem(EnvironmentType.WATER);
            } else if ("Butterfly".equals(species)) {
                envBox.setSelectedItem(EnvironmentType.AIR);
            } else if ("Octopus".equals(species)) {
                envBox.setSelectedItem(EnvironmentType.WATER);
            } else if ("Spider".equals(species)) {
                envBox.setSelectedItem(EnvironmentType.LAND);
            }
        });
    }

    /** Getters for the form inputs */
    public String getAnimalName() { return nameField.getText().trim(); }
    public String getSpecies() { return (String) speciesBox.getSelectedItem(); }
    public EnvironmentType getEnvironmentType() { return (EnvironmentType) envBox.getSelectedItem(); }
    public JButton getAdmitButton() { return admitButton; }
    public void clear() { nameField.setText(""); }
}
