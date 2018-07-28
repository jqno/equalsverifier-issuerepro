package nl.jqno.equalsverifier;

import org.junit.Test;

public class EqualsTest {
    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier.forClass(PizzaBakery.class)
                .suppress(Warning.NULL_FIELDS, Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS)
                .verify();
    }
}
