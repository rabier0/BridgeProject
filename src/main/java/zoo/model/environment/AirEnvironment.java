package zoo.model.environment;

/** BRIDGE - Concrete Implementor. */
public class AirEnvironment implements Environment {
    @Override
    public EnvironmentType getType() { return EnvironmentType.AIR; }

    @Override
    public String describeMovement() { return "flies through the air"; }
}
