# Design Notes

## Bridge
| Role | Class(es) |
|---|---|
| Abstraction | `model.animal.Animal` |
| Refined Abstraction | `Vertebrate`, `Invertebrate` |
| Implementor | `model.environment.Environment` |
| Concrete Implementor | `LandEnvironment`, `WaterEnvironment`, `AirEnvironment` |

Why: two independent dimensions (backbone vs. environment). Without the bridge we'd need
classes like `LandVertebrate`, `WaterInvertebrate`, ... for every combination.

## Chain of Responsibility
| Role | Class(es) |
|---|---|
| Handler | `chain.HabitatHandler` |
| Concrete Handlers | `SavannaHandler`, `AquariumHandler`, `AviaryHandler`, `InsectariumHandler`, `QuarantineHandler` |
| Client | `service.ZooService` |
| Chain assembly | `HabitatChainBuilder` |

<!--
For bridge, the abstraction is `Animal` and its refined abstractions are `Vertebrate` and `Invertebrate`. The implementor is `Environment` and its concrete implementors are `LandEnvironment`, `WaterEnvironment`, and `AirEnvironment`. This allows animals to vary independently from their environments, avoiding a combinatorial explosion of classes.

For chain of responsibility, the handler is `HabitatHandler` and its concrete handlers are `SavannaHandler`, `AquariumHandler`, `AviaryHandler`, `InsectariumHandler`, and `QuarantineHandler`. The client is `ZooService` and the chain is assembled by `HabitatChainBuilder`. This allows habitat placement rules to be handled independently and extended without modifying existing code.
-->


