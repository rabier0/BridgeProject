package zoo.chain;

import zoo.model.animal.Animal;
import zoo.model.environment.EnvironmentType;
import zoo.model.habitat.Habitat;

/** CHAIN OF RESPONSIBILITY - Concrete Handler: water animals (vertebrate or invertebrate) */
public class AquariumHandler extends HabitatHandler {
    public AquariumHandler(Habitat habitat) { super(habitat); }

    @Override
    protected boolean canHandle(Animal animal) {
        return animal.getEnvironment().getType() == EnvironmentType.WATER;
    }
}
