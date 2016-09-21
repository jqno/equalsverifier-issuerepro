package nl.jqno.equalsverifier;

import lombok.NonNull;
import lombok.Value;

@Value
public class MyClass {
    @NonNull
    private final String something;
}
