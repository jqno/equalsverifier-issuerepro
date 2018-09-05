package nl.jqno.equalsverifier.issuerepro;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class EqualsTest {
    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(A.class).usingGetClass()
                .suppress(Warning.NONFINAL_FIELDS, Warning.INHERITED_DIRECTLY_FROM_OBJECT)
                .withPrefabValues(B.class, new B("foo"), new B("bar"))
                .verify();
    }
}
