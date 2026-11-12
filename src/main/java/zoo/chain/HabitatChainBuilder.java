package zoo.chain;

import java.util.List;
import zoo.model.habitat.Habitat;

/** Builds the chain in one place so the order is easy to change. */
public class HabitatChainBuilder {
    private final List<HabitatHandler> handlers = List.of(
            new SavannaHandler(new Habitat("Savanna", 5)),
            new AquariumHandler(new Habitat("Aquarium", 10)),
            new AviaryHandler(new Habitat("Aviary", 8)),
            new InsectariumHandler(new Habitat("Insectarium", 20)),
            new QuarantineHandler(new Habitat("Quarantine", 100)) // must be last
    );

    public HabitatHandler build() {
        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).setNext(handlers.get(i + 1));
        }
        return handlers.get(0);
    }

    public List<HabitatHandler> getHandlers() { return handlers; }
}
