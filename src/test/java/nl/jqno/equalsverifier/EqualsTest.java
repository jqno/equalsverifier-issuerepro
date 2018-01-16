package nl.jqno.equalsverifier;

import org.junit.Test;

import java.awt.color.ColorSpace;

public class EqualsTest {
    @Test
    public void testEqualsAndHashCode() {
        EqualsVerifier.forClass(MyClass.class)
                .withPrefabValues(ColorSpace.class, ColorSpace.getInstance(ColorSpace.CS_sRGB), ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB))
                .verify();
    }
}
