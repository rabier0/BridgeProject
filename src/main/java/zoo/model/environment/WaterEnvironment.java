package zoo.model.environment;

/** BRIDGE - Concrete Implementor. */
public class WaterEnvironment implements Environment {
    @Override
    public EnvironmentType getType() { return EnvironmentType.WATER; }

    @Override
    public String describeMovement() { return "swims through water"; }
}
