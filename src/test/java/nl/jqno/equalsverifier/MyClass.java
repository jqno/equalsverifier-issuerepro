package nl.jqno.equalsverifier;

import java.awt.color.ICC_Profile;
import java.util.Objects;

public class MyClass {
    private final ICC_Profile p;

    public MyClass(ICC_Profile p) {
        this.p = p;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyClass)) {
            return false;
        }
        MyClass other = (MyClass)obj;
        return Objects.equals(p, other.p);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(p);
    }
}
