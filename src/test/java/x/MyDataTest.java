package x;

import nl.jqno.equalsverifier.EqualsVerifier;

import org.junit.Test;

public class MyDataTest {
    @Test
    public void testEquals() {
        EqualsVerifier.forClass(MyData.class)
            .verify();
    }
}
