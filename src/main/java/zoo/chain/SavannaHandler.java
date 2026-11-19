package zoo.chain;

import zoo.model.animal.Animal;
import zoo.model.environment.EnvironmentType;
import zoo.model.habitat.Habitat;

/** CHAIN OF RESPONSIBILITY - Concrete Handler: land vertebrates */
public class SavannaHandler extends HabitatHandler {
    public SavannaHandler(Habitat habitat) { super(habitat); }

    @Override
    protected boolean canHandle(Animal animal) {
        return animal.hasBackbone() && animal.getEnvironment().getType() == EnvironmentType.LAND;
    }
}
