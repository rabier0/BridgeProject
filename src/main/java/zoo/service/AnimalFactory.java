package zoo.service;

import zoo.model.animal.Animal;
import zoo.model.animal.invertebrates.*;
import zoo.model.animal.vertebrates.*;
import zoo.model.environment.*;

/** Helper so the GUI can create animals from dropdown selections. */
public class AnimalFactory {
    public static Animal create(String species, String name, EnvironmentType envType) {
        Environment env = switch (envType) {
            case LAND -> new LandEnvironment();
            case WATER -> new WaterEnvironment();
            case AIR -> new AirEnvironment();
        };
        return switch (species) {
            case "Lion" -> new Lion(name, env);
            case "Eagle" -> new Eagle(name, env);
            case "Shark" -> new Shark(name, env);
            case "Butterfly" -> new Butterfly(name, env);
            case "Octopus" -> new Octopus(name, env);
            case "Spider" -> new Spider(name, env);
            default -> throw new IllegalArgumentException("Unknown species: " + species);
        };
    }
}
