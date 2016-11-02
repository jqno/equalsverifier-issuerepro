package nl.jqno.equalsverifier;

public abstract class AbstractParent {
    private int x;

    public AbstractParent(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractParent)) {
            return false;
        }
        AbstractParent other = (AbstractParent)obj;
        return x == other.x;
    }

    @Override
    public int hashCode() {
        return x;
    }
}
