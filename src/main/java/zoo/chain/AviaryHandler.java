package zoo.chain;

import zoo.model.animal.Animal;
import zoo.model.environment.EnvironmentType;
import zoo.model.habitat.Habitat;

/** CHAIN OF RESPONSIBILITY - Concrete Handler: flying vertebrates */
public class AviaryHandler extends HabitatHandler {
    public AviaryHandler(Habitat habitat) { super(habitat); }

    @Override
    protected boolean canHandle(Animal animal) {
        // TODO: refine rule
        return animal.hasBackbone() && animal.getEnvironment().getType() == EnvironmentType.AIR;
    }
}
