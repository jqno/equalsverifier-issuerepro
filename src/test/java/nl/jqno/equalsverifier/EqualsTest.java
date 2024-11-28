package nl.jqno.equalsverifier;

import org.junit.jupiter.api.Test;

public class EqualsTest {
    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier.forClass(MyClass.class)
                .verify();
    }
}
