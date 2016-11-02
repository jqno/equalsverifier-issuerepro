package nl.jqno.equalsverifier;

public final class ConcreteGrandChild extends AbstractChild {
    private int z;

    public ConcreteGrandChild(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConcreteGrandChild)) {
            return false;
        }
        ConcreteGrandChild other = (ConcreteGrandChild)obj;
        return z == other.z;
    }

    @Override
    public int hashCode() {
        return z;
    }
}
