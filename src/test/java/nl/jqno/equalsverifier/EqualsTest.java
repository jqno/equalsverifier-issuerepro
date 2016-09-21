package nl.jqno.equalsverifier;

import org.junit.Test;

public class EqualsTest {
    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier.forClass(MyClass.class)
                .verify();
    }
}
